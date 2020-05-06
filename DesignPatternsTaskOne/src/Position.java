import java.util.ArrayList;
import java.util.List;

public class Position implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private static String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setTopic(this);

    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }

    }


    private boolean isUp;

    public void standUp() {

        name = "Up";
        this.isUp = true;
        setName(name);
        System.out.println("The instructor gave up command so the trainer is up");


    }

    public void getDown() {
        System.out.println("The instructor gave down command so the trainer is down");
        name = "down";
        setName(name);
        this.isUp = false;

    }

    public String setNewCommand(Command command) {


        Instructor instructor = new Instructor();
        instructor.setCommand(command);
        instructor.giveCommand();
        this.notifyObservers();
        return name;

    }


}