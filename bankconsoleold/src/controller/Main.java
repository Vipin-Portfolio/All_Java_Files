package controller;

import model.CustomerDetails;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("INVOICE APPLICATION");
        try {
            boolean loop = true;
            while (loop) {
                System.out.println("1.Register");
                System.out.println("2.Login");
                System.out.println("3.Exit");
                byte choice = scan.nextByte();
                switch (choice) {
                    case 1:
                        System.out.println(new AdminController().userReg());
                        break;
                    case 2:
                        int id = scan.nextInt();
                        new AdminController().login(id);
                        break;
                    case 3:
                        loop = false;
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}