package controller;

import model.CustomerDetails;
import view.LoginView;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AdminController {
    Scanner scan = new Scanner(System.in);
    private static long id = 1000;
    static Map<Integer, CustomerDetails> customerMap = new TreeMap<>();
    static {
        CustomerDetails customerDetails = new CustomerDetails("suren", "9876543210", "chennai", ++id);
        CustomerDetails customerDetails1 = new CustomerDetails("gopal", "8765544121", "tiruppur", ++id);
        CustomerDetails customerDetails2 = new CustomerDetails("vicky", "6789012335", "coimbatore", ++id);
        AdminController.customerMap.put((int)customerDetails.getId(),customerDetails);
        AdminController.customerMap.put((int)customerDetails1.getId(),customerDetails);
        AdminController.customerMap.put((int)customerDetails2.getId(),customerDetails);
    }

    protected String userReg()
    {
        System.out.println("Enter Name");
        String name = scan.next();
        System.out.println("Enter Number");
        String phoneNumber = scan.next();
        System.out.println("Enter city");
        String city = scan.next();
        CustomerDetails customerDetails = new CustomerDetails(name,phoneNumber,city,++id);
        customerMap.put((int) customerDetails.getId(),customerDetails);
        return customerDetails.toString();
    }
    protected void login(int id)
    {
        if(customerMap.containsKey(id))
        {
            System.out.println("Login Successfully");
            new view.LoginView().listingCategory();
        }
        else
            System.out.println("Details Not Found");
    }
}
