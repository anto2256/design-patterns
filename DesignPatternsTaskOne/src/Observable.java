public interface Observable {
    public String getName();
    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void notifyObservers();



}
