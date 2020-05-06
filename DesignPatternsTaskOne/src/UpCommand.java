public class UpCommand implements Command {
    private Position position;

    public UpCommand(Position position) {

        this.position = position;
    }

    @Override
    public void execute() {
        this.position.standUp();


    }


}
