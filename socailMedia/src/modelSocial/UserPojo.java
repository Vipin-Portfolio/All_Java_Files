package modelSocial;

import java.util.Stack;

public class UserPojo {
    private String name;
    private  String userName;
    private  String password;
    private String userEmail;
    private String Bio;
    private String currentFeed;
    private byte age;

    public byte getAge() {
        return age;
    }

    private void setAge(byte age) {
        this.age = age;
    }

    public UserPojo(String name, String userName,String password, String userEmail, Byte Age){
          setName(name);
          setPassword(password);
          setUserEmail(userEmail);
          setAge(age);
          setUserName(userName);
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "userName='" + userName + '\'' +
                ", Bio='" + Bio + '\'' +
                ", currentFeed='" + currentFeed + '\'' +
                '}';
    }

    public UserPojo(String userName, String Bio, String currentFeed){
        setBio(Bio);
        setCurrentFeed(currentFeed);
        setUserName(userName);
   }


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public  String getUserName() {
        return userName;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    public  String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    private void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getBio() {
        return Bio;
    }

    private void setBio(String bio) {
        Bio = bio;
    }

    public String getCurrentFeed() {
        return currentFeed;
    }

    private void setCurrentFeed(String currentFeed) {
        this.currentFeed = currentFeed;
    }
}