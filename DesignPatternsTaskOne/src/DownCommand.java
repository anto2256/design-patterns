public class DownCommand implements Command {
    private Position position;

    public DownCommand(Position position) {

        this.position = position;
    }

    @Override
    public void execute() {
        this.position.getDown();


    }
}
