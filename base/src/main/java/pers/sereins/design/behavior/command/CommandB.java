package pers.sereins.design.behavior.command;

public class CommandB implements Command{

    private Receiver receiver;

    public CommandB(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("命令B");
        receiver.b();
    }
}
