package com.onome.code.store.message;

import java.util.List;

//import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.onome.code.exception.OnomeException;

@CrossOrigin
@RestController
@RequestMapping("/store/messages")
public class MessageController {

	@Autowired
	MessageService messageService;

	@GetMapping("{username}")
	public List<Message> getUserMessage(@PathVariable("username") String username) {

		return messageService.getUserMessages(username);

	}

	@GetMapping("/store/{producer}")
	public List<Message> getRecords(@PathVariable("producer") String producer) {
		return messageService.getMessages(producer);
	}

	@PutMapping
	public boolean createMessage(@RequestBody Message message) {
		if (message == null) {
			throw new OnomeException("Message creation Failed");
		} else {
			return this.messageService.createMessage(message);
		}
	}

	@DeleteMapping("/{id}")
	public boolean deleteUser(@PathVariable("id") String id) {
		return this.messageService.deleteMessage(id);
	}

	@ExceptionHandler
	public String exceptionHandler(OnomeException ex) {
		return ex.getMessage();
	}

}
