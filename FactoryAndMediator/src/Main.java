

public class Main {

	public static void main(String[] args)  {
		
		Message chatroom = new ChatRoom();
		ChatUserFactory userFactory = new ChatUserFactory();
		
		User user1 = userFactory.CreateUser(chatroom,"ChatUser", "Anton");
		User user2 = userFactory.CreateUser(chatroom,"ChatUser", "Ivan");
		User user3 = userFactory.CreateUser(chatroom,"ChatUser", "Mitko");
		

		user1.send("Are you guys ready with the project??");
		user3.send("The design patterns one?");
		user2.send("Oh man, i totally forgot!!");
		user2.send("Was is something with cats?");
		user1.send("addBot");
		user3.send("Yes it is cat related.");
	}

}
