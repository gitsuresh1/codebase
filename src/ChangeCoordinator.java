/*
ChangeCoordinator relates to Invoker in command pattern.
The command is created by the ProjectManager(The client in commnand pattern) and stored here for later purpose
During Deployment,ChangeCoordinator will be called by ProjectManager (corresponds to the invoke()) to coordinate and execute the deployment
ChangeCoordinator coordinates and executes the stored command ,which in turn has the 
instructions to invoke the appropriate sequence of actions on the unix team - {receiver in command pattern }
*/
public class ChangeCoordinator {
    Command command;
    
    public void setCommand(Command command) {
        this.command=command;
    }

    public void coordinate() {
        this.command.execute();
    }
}
