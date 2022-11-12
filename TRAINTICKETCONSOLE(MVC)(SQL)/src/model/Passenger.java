package model;

public class Passenger {
    private String userName;
    private String password;
    private byte age;
    private String phoneNumber;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Passenger(String userName, String password, byte age, String phoneNumber,String gender){
        super();
        this.userName=userName;
        this.password=password;
        this.phoneNumber=phoneNumber;
        this.age=age;
        this.gender = gender;
    }
    public Passenger(){

    }

    @Override
    public String toString() {
        return "Passenger{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Gender='" + gender + '\'' +
                '}';
    }
}
