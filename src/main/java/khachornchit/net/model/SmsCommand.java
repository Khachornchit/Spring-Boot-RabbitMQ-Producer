package khachornchit.net.model;

public class SmsCommand {

	private String phoneNumber;
	private String message;
	private String routekey;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRoutekey() {
		return routekey;
	}

	public void setRoutekey(String routekey) {
		this.routekey = routekey;
	}

	public SmsCommand(String phoneNumber, String message, String routekey) {
		super();
		this.phoneNumber = phoneNumber;
		this.message = message;
		this.routekey = routekey;
	}

	public SmsCommand() {

	}

}
