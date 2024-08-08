package DB;

public enum Credentials {
    USER("root"),
    PASSWORD("root"),
    DBNAME("parqueadero1");

    private String arg;

    Credentials(String arg) {
        this.arg = arg;
    }

    public String getArg() {
        return arg;
    }
}
