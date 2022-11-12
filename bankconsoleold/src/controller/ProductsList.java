package controller;

import model.Category;
import model.Products;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ProductsList {
    private static long productId = 1;
    ArrayList<Products> products = new ArrayList<>();
   Map<Category,Products> category = new TreeMap<>();
   Products product = new Products((int) ++productId,"Biscuit",100);
    Products product1 = new Products((int) ++productId,"Soap",150);
    Products product2 = new Products((int) ++productId,"Powder",85);
    Products product3 = new Products((int) ++productId,"Rice",190);
    Products product4 = new Products((int) ++productId,"Masala",60);

    public void listingProducts()
    {
        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        System.out.println("Available Products " + products);
    }
    public void listingCategory()
    {

    }

}
