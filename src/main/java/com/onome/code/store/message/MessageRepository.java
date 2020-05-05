package com.onome.code.store.message;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageRepository extends MongoRepository<Message,String> {

	@Query("{producer:?0}")
	 List<Message> findByProducer(String producer);
	
	@Query("{username:?0}")
	 List<Message> findByUsername(String username);
	
}
