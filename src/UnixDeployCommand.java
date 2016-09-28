public class UnixDeployCommand implements Command {

    private UnixTeam unixteam;

    public UnixDeployCommand(UnixTeam unixteam) {
        this.unixteam = unixteam;
    }

    public void execute() {
        unixteam.stopScripts();
        unixteam.backup();
        unixteam.installScripts();
        unixteam.verifyPermissions();
        unixteam.startScripts();
        unixteam.sanityCheck();
    }
}
