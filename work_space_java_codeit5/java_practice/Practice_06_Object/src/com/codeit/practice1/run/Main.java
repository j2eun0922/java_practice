package com.codeit.practice1.run;
import com.codeit.practice1.model.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setpName("아이폰");
        product.setPrice(10000000);
        product.setBrand("애플");

        System.out.println(product.toString());
    }
}
