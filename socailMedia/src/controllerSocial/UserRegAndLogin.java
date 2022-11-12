package controllerSocial;

import modelSocial.FriendRequestPojo;
import modelSocial.UserPojo;

import java.util.*;


public class UserRegAndLogin {
   static ArrayList<UserPojo> userPojoArrayList = new ArrayList<>();
   static Stack<UserPojo> stackForProfile = new Stack<>();
   static Map<FriendRequestPojo,Boolean> mapForFriendRequest = new HashMap<>();

   String userName;
    Scanner scanner = new Scanner(System.in);
    public UserRegAndLogin(){
        hardcode();
    }
    public void regValidation(String name,String userName, String password, String email, byte age){
        for(UserPojo userPojo : userPojoArrayList){
            while(userPojo.getUserName().contains(userName)){
                System.out.println("User Name Already Exist");
                System.out.println("Please enter another UserName");
                userName = scanner.next();
            }
            }
        UserPojo userPojo = new UserPojo(name,userName,password,email,age);
        if(userPojo.getUserName().contains(userName)){
            userPojoArrayList.add(userPojo);
            System.out.println("Registered Successfully");
            profileSetup(userName);
            return;
        }

    }
    public void loginMethod(  String userName,String password){
        //FriendRequest friendRequest = new FriendRequest();
        for(UserPojo userPojo : userPojoArrayList){
              if(userPojo.getUserName().equals(userName)) {
                  System.out.println("User Name Matches");
                  if (userPojo.getPassword().equals(password)) {
                      System.out.println("Welcome User " + userName);
                      System.out.println("Your generated id is "+ FriendRequestPojo.getId());
                  }
                      else{
                          System.out.println("password is invalid");
                          return;
                      }
                      boolean loop = true;
                      while (true) {
                          System.out.println("1.Display all Users");
                          System.out.println("2.Add Friends");
                          System.out.println("3.Showing your profile");
                          int loginUserChoice = scanner.nextInt();
                          switch (loginUserChoice) {
                              case 1:
                                  display();
                                  break;
                              case 2:
                                 addFriends(userName);
                                  break;
                              case 3:
                                 displayProfile(userName);
                                  break;
                              case 4:
                                  loop = false;
                                  return;
                          }
                      }


                  }
              }
        }

    public void display(){
        System.out.println("Available Users in our app");
        for(int i = 0; i < userPojoArrayList.size();i++){
            System.out.println(userPojoArrayList.get(i).getUserName());
        }
    }
    public void hardcode(){
        userPojoArrayList.add(new UserPojo("vipin","vipin","vipin","vipin", (byte) 34));
        userPojoArrayList.add(new UserPojo("suren","suren","suren","suren", (byte) 34));
        userPojoArrayList.add(new UserPojo("vicky","vicky","vicky","vicky", (byte) 34));
        userPojoArrayList.add(new UserPojo("gopal","gopal","gopal","gopal", (byte) 34));
    }
     public void profileSetup(String userName){
         System.out.println("please set up your profile to continue");
         System.out.println();
         System.out.println();
         System.out.println("Enter Bio");
         String bio = scanner.next();
         System.out.println();
         System.out.println("Your First Feed");
         String firstFeed = scanner.next();
         UserPojo userPojo = new UserPojo(userName,firstFeed,bio);
         stackForProfile.push(userPojo);

     }

    public void displayProfile(String userName){
        for(UserPojo userPojo : stackForProfile){
            if(userPojo.getUserName().equals(userName)){
                System.out.println(stackForProfile.toString());
            }
        }

     }
     public void addFriends(String userName) {
         System.out.println("Enter the userName from above list to add as a friend");
         String toBeAddedUser = scanner.next();
         if (toBeAddedUser.equals(userName)) {
             System.out.println("You cannot add yourself as a friend");
             toBeAddedUser = scanner.next();
         }
         while (userPojoArrayList.contains(toBeAddedUser)) {
             System.out.println("User Found Performing Friend Request");
         }
         for (int i = 0; i < userPojoArrayList.size(); i++) {
             if (userPojoArrayList.get(i).getUserName().equals(toBeAddedUser)) {
                 FriendRequestPojo friendRequestPojo = new FriendRequestPojo(userPojoArrayList.get(i).getUserName(), userPojoArrayList.get(i).getBio(), userPojoArrayList.get(i).getName(), userPojoArrayList.get(i).getCurrentFeed());
                 mapForFriendRequest.put(friendRequestPojo, false);
             }
         }

     }


//    var payeeCustomer = customerDetails.get(payeeUser);
//        payeeCustomer.setMoney(payeeCustomer.getMoney()+amount);
//        customer.setMoney(customer.getMoney() - amount);
//        System.out.println("successfully transferred " + amount);

}
