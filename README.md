# Kafka Producer Example with Spring Boot

In this project I have covered how to use Spring Kafka to Publish JSON or String message to a Kafka topic with Spring Boot.

## Start Zookeeper
- Windows `.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties`
- Linux `bin/zookeeper-server-start.sh config/zookeeper.properties`

## Start Kafka Server
- Windows `.\bin\windows\kafka-server-start.bat .\config\server.properties`
- Linux `bin/kafka-server-start.sh config/server.properties`

## Create Kafka Topic
- Windows `.\bin\windows\kafka-topics.bat --create --topic KafkaTopicExample --bootstrap-server localhost:2181 --replication-factor 1 --partitions 1`
- Linux `bin/kafka-topics.sh --create --topic KafkaTopicExample --bootstrap-server localhost:2181 --replication-factor 1 --partitions 1 `

## Consume from the Kafka Topic via Console
- Windows `.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic KafkaTopicExample --from-beginning`
- Linux `bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic KafkaTopicExample --from-beginning`

## Publish message via WebService
- `http://localhost:8081/kafka/publish/John`
- `http://localhost:8081/kafka/publish/Doe`
