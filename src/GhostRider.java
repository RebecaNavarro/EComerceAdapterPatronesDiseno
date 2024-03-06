public class GhostRider {

    Command command;

    public GhostRider(Command command){
        this.command= command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void revertAction(){
        command.revert();
    }

    public void takeAction(){
        command.execute();
    }
}
