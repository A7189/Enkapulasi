package enkapulasi;

public class user {

    private String username;
    private String password;
    private int id;
    private boolean status; // true : menikah, false ; bm

    public user(String username, String password, int id, boolean status) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.status = status;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}
