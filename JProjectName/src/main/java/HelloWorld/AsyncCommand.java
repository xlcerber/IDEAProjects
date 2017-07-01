package HelloWorld;



public class AsyncCommand extends Command {

    Object commandState;

    void init() {
        System.out.println("Init AsyncCommand");
    }

    @Override
    public int setState (Object commandState) {
        this.commandState = commandState;
        return 0;
    }

    @Override
    public Object execute() {
        return commandState.toString();
    }
}