
public interface UnixTeam {
    void backup();
    void installScripts();
    void verifyPermissions();
    void stopScripts();
    void startScripts();
    void sanityCheck();
    void rollback();
}
