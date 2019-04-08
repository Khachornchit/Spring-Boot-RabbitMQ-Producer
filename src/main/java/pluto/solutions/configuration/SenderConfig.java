package pluto.solutions.configuration;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pluto.solutions.model.SenderMessage;

@Configuration
public class SenderConfig {

	@Bean
	public TopicExchange exchange() {
		return new TopicExchange("Pluto.Exchange");
	}
	
	@Bean
	public SenderMessage sendmsg() {
		return new SenderMessage();
	}
}