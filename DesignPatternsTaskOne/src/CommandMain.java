public class CommandMain {
    public static void main(String[] args) {
        Position topic = new Position();
        Observer obs1 = new TopicSubscriber("Gosho1");
        Observer obs2 = new TopicSubscriber("Gosho2");
        Observer obs3 = new TopicSubscriber("Gosho3");
        topic.subscribe(obs1);
        topic.subscribe(obs2);
        topic.subscribe(obs3);



        Position position = new Position();

        Command upCommand= new UpCommand(position);
        Command downCommand= new DownCommand(position);


        topic.setNewCommand(upCommand);
        topic.setNewCommand(downCommand);









    }
}
