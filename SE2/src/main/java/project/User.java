package project;

public class User {
    private String name;
    private String username;
    private String password;
    private String MeterN;
    public User(String name, String username, String password, String MeterN) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.MeterN=MeterN;
    }
    

    public String getMeterN() {
        return MeterN;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

//    @Override
//    public String toString() {
//    return "User{" + "name='" + name + '\'' + ", username='" + username + '\'' + '}';
//    }
}