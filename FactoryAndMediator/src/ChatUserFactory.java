
public class ChatUserFactory extends UserFactory {

	@Override
	public User CreateUser(Message mediator, String type, String userName) {
		switch (type)
		 {
		 case "ChatUser":
		 return new ChatUser(mediator,userName);
		 case "ChatBot":
		 return ChatBot.createBot(mediator,userName);
		 default: throw new NullPointerException("No such factory type.");
		 }
	}

}
