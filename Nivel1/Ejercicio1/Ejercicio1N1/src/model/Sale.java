package model;

import exceptions.EmptySaleException;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private int totalPrice;

    public Sale() {
        this.products = new ArrayList<Product>();
    }

    public void setProducts(Product product) {
        products.add(product);
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int calculateTotal() throws EmptySaleException{
        totalPrice = 0;

        if (products.isEmpty()){
            throw new EmptySaleException("Para hacer una venta primero debes añadir productos");
        }
        for (Product product : products){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
