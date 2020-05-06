public class TopicSubscriber implements Observer {
    private String name;
    private Observable topic;


    public TopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (this.topic == null) {
            System.out.println(this.name + "No topic set");
            return;
        }
        String latestTopic = topic.getName();
        System.out.println( this.name+" is now  "+
                latestTopic);

    }

    @Override
    public void setTopic(Observable topic) {
        this.topic = topic;

    }
}
