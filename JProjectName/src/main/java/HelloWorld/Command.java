package HelloWorld;

public abstract class Command {

    Object commandState;
    public Command(){
    }

    public int setState (Object commandState) {
        this.commandState = commandState;
        return 0;
    }

    abstract Object execute();

}