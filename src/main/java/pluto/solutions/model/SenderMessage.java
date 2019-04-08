package pluto.solutions.model;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class SenderMessage {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private TopicExchange topicExchange;

	public void sendMessage(String routeKey, String message) {
		rabbitTemplate.convertAndSend(topicExchange.getName(), routeKey, message);
	}
}
