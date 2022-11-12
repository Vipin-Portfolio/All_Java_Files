package view;

import controller.UserDAO;
import model.Passenger;

import java.util.Scanner;

enum Gender {
    MALE(1), FEMALE(2);

    private int ageCode;

    Gender(int ageCode) {
        this.ageCode = ageCode;
    }

    public int getAgeCode() {
        return ageCode;
    }
}
public class UserRegistration {
    UserDAO userDAO = new UserDAO();
    Scanner scanner = new Scanner(System.in);
    public void registration() {
        try {
            boolean outerLoop = true;
            while(outerLoop) {
                System.out.println("Enter your name");
                String userName = scanner.next();
                System.out.println("Enter your password");
                String password = scanner.next();
                System.out.println("Enter your age");
                byte age = scanner.nextByte();
                System.out.println("Enter your phoneNumber");
                String phone = scanner.next();
                System.out.println("Enter your Gender");
                String gender = scanner.next();
                Passenger passenger = new Passenger(userName,password,age,phone,gender);
                userDAO.registration(passenger);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


