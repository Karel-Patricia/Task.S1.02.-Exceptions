package main;

import exceptions.EmptySaleException;
import model.Product;
import model.Sale;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Product food = new Product("potato", 12);
        Product food1 = new Product("apple", 2);

        Sale sale = new Sale();

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        sale.setProducts(food);
        sale.setProducts(food1);

        try {
            int totalPrice = sale.calculateTotal();
            System.out.println("Total venta: " + totalPrice);
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        // Prueba IndexOutOfBoundsException
        List<String> List = new ArrayList<>();

        try {
            List.get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
