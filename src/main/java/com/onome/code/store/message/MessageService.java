package com.onome.code.store.message;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

	@Autowired
	MessageRepository msg;
	
	//Get User Messages
	public List<Message> getUserMessages(String username){
		List<Message> message  = new ArrayList<>();
		try {
		 	return this.msg.findByUsername(username);
		}
		catch(Exception ex) {
		
		}
		 return message;
	}
	
	
	//Get Store Messages
		public List<Message> getMessages(String producer){
			 List<Message> message  = new ArrayList<>();
			try {
			 	return this.msg.findByProducer(producer);
			}
			catch(Exception ex) {
			
			}
			 return message;
		}
		
	//Create Message
		public boolean createMessage(Message message) {
			try {
			 	this.msg.insert(message);
			 	return true;
			}
			catch(Exception ex) {
				
			}
			return false;
		}
		
		//Delete Message
		public boolean deleteMessage(String id) {
			try {
			 	this.msg.deleteById(id);
			 	return true;
			}
			catch(Exception ex) {
				
			}
			return false;
		}
	
}
