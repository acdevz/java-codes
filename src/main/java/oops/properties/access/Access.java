package oops.properties.access;

public class Access {
    private int hash;
    public String name;
    protected String code;
    int state = 1;

    public Access(int hash, String name, String code) {
        this.hash = hash;
        this.name = name;
        this.code = code;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public static void main(String[] args) {
        Access acs = new Access(6567, "Acs", "ACS6567");
    }
}

