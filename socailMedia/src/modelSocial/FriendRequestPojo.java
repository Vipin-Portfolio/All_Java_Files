package modelSocial;

public class FriendRequestPojo {
    private String userName;
    private String bio;
    private String name;
    private String personalFeed;
    private static int id = 2022000;

    public static int getId() {
        return ++id;
    }

    private static void setId(int id) {
        FriendRequestPojo.id = id;
    }

    public FriendRequestPojo(String userName, String bio, String name, String PersonalFeed){
        setUserName(userName);
        setBio(bio);
        setName(name);
        setPersonalFeed(personalFeed);
        setId(id);
    }

    @Override
    public String toString() {
        return "FriendRequestPojo{" +
                "userName='" + userName + '\'' +
                ", bio='" + bio + '\'' +
                ", name='" + name + '\'' +
                ", personalFeed=" + personalFeed +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBio() {
        return bio;
    }

    private void setBio(String bio) {
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getPersonalFeed() {
        return personalFeed;
    }

    private void setPersonalFeed(String personalFeed) {
        this.personalFeed = personalFeed;
    }

}
