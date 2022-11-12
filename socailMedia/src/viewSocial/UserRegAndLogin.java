package viewSocial;

import modelSocial.UserPojo;

import java.util.Scanner;

public class UserRegAndLogin {
    Scanner scanner = new Scanner(System.in);
    public void regAndLoginValidation(){
        controllerSocial.UserRegAndLogin userRegAndLogin = new controllerSocial.UserRegAndLogin();
        boolean loop = true;
        while(true) {
        System.out.println("1.New User");
        System.out.println("2.Login");
        System.out.println("3.Exit");
        System.out.println("Enter your choice");
      int userChoice = scanner.nextInt();


            switch (userChoice) {
                case 1:
                    System.out.println("FACEBOOK");
                    System.out.println("Enter Name");
                    String name = scanner.next();
                    System.out.println("Enter your age");
                    byte age = scanner.nextByte();
                    System.out.println("Enter  your Email");
                    String email = scanner.next();
                    System.out.println("Enter your UserName");
                    String userName = scanner.next();
                    System.out.println("Enter your Password");
                    String password = scanner.next();
                    userRegAndLogin.regValidation(name,userName,password,email,age);

                    break;
                case 2:
                    userRegAndLogin.loginMethod( userName = scanner.next(),password = scanner.next());
                    break;
                case 3:
                    loop=false;
                    System.out.println("Thank You!");
                    return;
            }

            }
        }

}
