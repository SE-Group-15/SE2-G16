package project;

public class User {
    private String name;
    private String username;
    private String password;
    private String MeterN;
    private String type;
    public User(String name, String username, String password, String MeterN,String type) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.MeterN=MeterN;
        this.type=type;
    }
    

    public String getMeterN() {
        return MeterN;
    }

    //email
    public String getUsername() {
        return username;
    }
        public String getname() {
        return name;
    }
        
        public String getType() {
        return type;
    }

    public String getPassword() {
        return password;
    }

//    @Override
//    public String toString() {
//    return "User{" + "name='" + name + '\'' + ", username='" + username + '\'' + '}';
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMeterN(String MeterN) {
        this.MeterN = MeterN;
    }
}