package com.mypack.kafka.producer.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypack.kafka.producer.model.User;

@RestController
@RequestMapping("kafka")
public class UserResource {

	private static final String TOPIC = "KafkaTopicExample";
	@Autowired
	KafkaTemplate<String, User> kafkaTemplate;
	
	@GetMapping("publish/{name}")
	public String post(@PathVariable("name") final String name) {
		kafkaTemplate.send(TOPIC, new User(name, "IT", 12000L));
		return "Returned successfully";
	}
}
