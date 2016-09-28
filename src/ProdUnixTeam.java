public class ProdUnixTeam implements UnixTeam {

    @Override
    public void backup() {
        System.out.println("PERFORMING PROD CODE BACKUP");
    }

    @Override
    public void installScripts() {
        System.out.println("INSTALLING PROD SCRIPTS ");
    }

    @Override
    public void verifyPermissions() {
        System.out.println("VERIFYING PROD PERMISSIONS");
    }

    @Override
    public void stopScripts() {
        System.out.println("EXECUTE PROD STOP SCRIPTS");
    }

    @Override
    public void startScripts() {
        System.out.println("EXECUTE PROD START SCRIPTS");
    }

    @Override
    public void sanityCheck() {
        System.out.println("PERFORM PROD SANITY CHECK");
    }

    @Override
    public void rollback() {
        System.out.println("PERFORM PROD ROLLBACK");
    }
}
