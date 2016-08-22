package entity;

/**
 * Created by Spock on 8/21/2016.
 */
public class User {
    private int userId;
    private String userName;
    private String userPassword;
    private String userPhone;
    private Double userAccount;
    private int useScore;

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Double getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(Double userAccount) {
        this.userAccount = userAccount;
    }

    public int getUseScore() {
        return useScore;
    }

    public void setUseScore(int useScore) {
        this.useScore = useScore;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userAccount=" + userAccount +
                ", useScore=" + useScore +
                '}';
    }
}
