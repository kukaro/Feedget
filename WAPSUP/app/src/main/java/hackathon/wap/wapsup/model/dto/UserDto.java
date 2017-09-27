package hackathon.wap.wapsup.model.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

    String userName, userEmail, userPassword;

    public UserDto() {
    }

    public UserDto(String userEmail, String userPassword, String userName) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPassword = userPassword;
    }


    public String getUserName() {
        return this.userName;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

}
