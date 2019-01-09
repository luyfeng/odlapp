package domain;

public class Admin {

    private String uid;
    private String admin;
    private String password;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdmin() {
        return admin;
    }

    public String getPassword() {
        return password;
    }
}
