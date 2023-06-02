package test.learnJdbc;

public class Mysql_user {
    private String url = "jdbc:mysql://127.0.0.1:3306/db?useSSL=false";
    private String username = "root";

    private String password = "admin";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
