public class ProjectManager {

    public static void main(String[] args) {
        UnixTeam unixTeam = new ProdUnixTeam();
        Command command = new UnixFallBackCommand(unixTeam);
        ChangeCoordinator coordinator = new ChangeCoordinator();
        coordinator.setCommand(command);
        coordinator.coordinate();
    }
}
