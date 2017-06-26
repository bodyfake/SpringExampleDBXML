package arduino.mongoDBXML.model;

/**
 * Created by bodyfake on 26.06.2017.
 */
public class User {

    private String UserName;
    private String password;
    private String emailAdress;

    public User(String userName, String password) {
        this.UserName = userName;
        this.password = password;
    }


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }



}
