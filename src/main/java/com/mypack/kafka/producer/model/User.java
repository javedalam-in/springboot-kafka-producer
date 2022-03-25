package com.mypack.kafka.producer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
	private String name;
	private String department;
	private Long salary;
}
