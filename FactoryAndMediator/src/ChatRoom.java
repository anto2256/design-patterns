import java.util.ArrayList;
import java.util.List;



public class ChatRoom implements Message {

	private List<User> users;
	private ChatBot bot;
	
    public ChatRoom() {
        this.users = new ArrayList<>();
    }
	
	@Override
	public void sendMessage(String message, User user) {
		
		if (!users.contains(user)) {
			System.out.println("Hello, "+ user.getName() +"!You are not currently in the room.Please consider joining.");
			return;
		}
		
        if(message.equals("addBot") && bot==null)
        {
        	ChatUserFactory factory = new ChatUserFactory();
        	bot = (ChatBot) factory.CreateUser(this,"ChatBot","ChatBot");
        }
		if(message.contains("cat")&& bot!=null) {
			this.removeUser(user);
			bot.send(user.getName() + " was kicked from the room for typing a forbidden word!");
			return;
		}
        for (User u : this.users) {
            if (u != user) {
                u.receive(message);
            }
        }
	}

	@Override
	public void addUser(User user) {
        this.users.add(user);
		System.out.println(user.getName() + " has entered the chat.");
	}

	@Override
	public void removeUser(User user) {
		this.users.remove(user);
		
	}

}
