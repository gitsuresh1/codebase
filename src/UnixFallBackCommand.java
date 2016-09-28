public class UnixFallBackCommand implements Command {

    public UnixFallBackCommand(UnixTeam unixteam) {
        this.unixteam = unixteam;
    }

    private UnixTeam unixteam;

    public void execute() {
        unixteam.rollback();
    }
}
