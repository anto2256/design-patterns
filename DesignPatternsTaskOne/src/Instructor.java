
public class Instructor {
    private Command command;


    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;

    }
    public void giveCommand(){
        this.command.execute();



    }
}
