
public class ChatUser extends User {

	public ChatUser(Message med, String name) {
		super(med, name);
		med.addUser(this);
	}

	@Override
	public void send(String msg) {
        System.out.println(getName() + " sends: " + msg);
        mediator.sendMessage(msg, this);
		
	}
	@Override
	public void receive(String msg) {
	      System.out.println(getName() + " receives:" + msg);
	}

}
