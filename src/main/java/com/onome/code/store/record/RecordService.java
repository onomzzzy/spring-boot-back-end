package com.onome.code.store.record;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordService {

	
	@Autowired	
	 RecordRepository recordRepository;
	
	
	//Get Record for Customers
	public List<Record> getRecord(String username) {
		List<Record> userRecord = new ArrayList<>();
	try {	
	 return this.recordRepository.findByUsername(username);
	}
	catch(Exception ex) {
		
	}
	return userRecord;
	}
	
	//Get Record for Store Owners
	//Must have been authenticated
	public List<Record> getRecords(String store){
		 List<Record> records = new ArrayList<>();
	 try {
		 return this.recordRepository.findByStore(store);
	 }
	 catch(Exception ex) {
		
	 }
	 return records;
	}
	
	//Create record 
	public boolean createRecord(Record record) {
		try {
		 	this.recordRepository.insert(record);
		 	return true;
		}
		catch(Exception ex) {
			
		}
		return false;
	}
	
	//Update Record
	public boolean updateRecord(Record record) {
		try {
		 	this.recordRepository.save(record);
		 	return true;
		}
		catch(Exception ex) {
			
		}
		return false;
	}
	
}
