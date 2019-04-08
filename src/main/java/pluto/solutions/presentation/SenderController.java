package pluto.solutions.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import pluto.solutions.model.SenderMessage;
import pluto.solutions.model.SmsCommand;

@RestController
@RequestMapping("/sender")
public class SenderController {

	@Autowired
	private SenderMessage senderMessage;

	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public String send(@RequestBody SmsCommand sms) {
		Gson g = new Gson();
		String message = g.toJson(sms);
		String routeKey = "key." + sms.getRoutekey() + ".rabbitmq";

		senderMessage.sendMessage(routeKey, message);
		return "Success";
	}
}
