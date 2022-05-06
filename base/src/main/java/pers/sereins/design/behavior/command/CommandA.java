package pers.sereins.design.behavior.command;

public class CommandA implements Command{

    private Receiver receiver;

    public CommandA(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("命令A");
        receiver.a();
    }
}
