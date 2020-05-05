package com.onome.code.store.record;

import java.util.List;

//import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.onome.code.exception.OnomeException;

@CrossOrigin
@RestController
@RequestMapping("/store/records")
public class RecordController {

	@Autowired
	RecordService recordService;

	@GetMapping("{username}")
	public List<Record> getRecord(@PathVariable("username") String username) {
		return recordService.getRecord(username);
	}

	@GetMapping("/store/{store}")
	public List<Record> getRecords(@PathVariable("store") String store) {
		return recordService.getRecords(store);
	}

	@PutMapping
	public boolean createRecord(@RequestBody Record record) {
		if (record == null) {
			throw new OnomeException("Record creation Failed");
		} else {
			return this.recordService.createRecord(record);
		}
	}

	@PostMapping
	public boolean updateUser(@RequestBody Record record) {
		if (record == null) {
			throw new OnomeException("Update Failed");
		} else {
			return this.recordService.updateRecord(record);
		}
	}

	@ExceptionHandler
	public String exceptionHandler(OnomeException ex) {
		return ex.getMessage();
	}

}
