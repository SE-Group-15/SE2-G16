package project;

import java.util.ArrayList;

public class Account {
    private static Account instance;
    private ArrayList<User> users;

    private Account() {
        users = new ArrayList<>();
    }

    public static Account getInstance() {
        if (instance == null) {
            instance = new Account();
        }
        return instance;
    }

    public void registerUser(String name, String username, String password, String MeterN, String type) {
        users.add(new User(name, username, password , MeterN, type));
    }
    
    public void UpdateProfile(String newname, String newusername, String MeterN, String confirm){
        for(User user : users) {
            if(user.getMeterN().equals(confirm)){
                user.setName(newname);
                user.setUsername(newusername);
                user.setMeterN(MeterN);
            }
        }
    }

    public boolean verifyLogin(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
        }
    public String UserData(){
    
    for (User user : users) {
           return user.getMeterN();
        }
        return null;
    }
    
     public String gettype(){
    
    for (User user : users) {
           return user.getType();
        }
        return null;
    }
    
        public String getName(){
    
    for (User user : users) {
           return user.getname();
        }
        return null;
    }
     public String Username1(){
    
    for (User user : users) {
           return user.getUsername();
        }
        return null;
    }
    // Return null if no matching user is found
}

    
