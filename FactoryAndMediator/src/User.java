
public abstract class User {


    protected Message mediator;
    private String name;

    public User(Message med, String name) {
        this.mediator = med;
        this.setName(name);
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
