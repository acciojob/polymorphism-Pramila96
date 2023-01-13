package com.driver;

public class Main {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        int z=1;
        Product p=new Product();
       int first= p.product(x,y);
        System.out.println(first);
        System.out.println(p.product(x,y,z));
        double prod=p.product(x,y);
        System.out.println(prod);
    }
public static class Product {
    public int product(int x, int y) {
        return x * y;
    }

    public int product(int x, int y, int z) {
        return x * y * z;
    }

    public double product(double x, double y) {
        return x * y;
    }
}
}