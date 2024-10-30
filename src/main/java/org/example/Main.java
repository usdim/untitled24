package org.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("глюков нет ");
        List<Product> arr = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split("\\s+");

                String name = parts[0];
                String price = (parts[1]);
                String article = parts[2];

                arr.add(new Product(name, price, article));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

//        try {
//            Scanner scan1 = new Scanner(new File("test.txt"));
//            for (int i = 0; i <4; i++) {
//                String[] file = scan1.nextLine().split("\\s+");
//                System.out.println(i);
//                String  n =  file[0];
//                String  p =  file[1];
//                String  a =  file[2];
//                System.out.println(n+""+p+""+a);
//                arr.add(new Product(n, p, a));
//
//            }
//
//        } catch (IOException e) {
//            System.out.println("ошибка");
//        }


        System.out.println(arr);

     String regex = "[a-z]*";
     arr.stream().filter(x-> x.art.matches(regex)).forEach(System.out::println);
     //boolean res = art.matches(regex);
     //System.out.println(res);



    }
}

class Product {

    String name;
    String price;
    String art;

    public Product(String name, String price, String art) {
        this.name = name;
        this.price = price;
        this.art = art;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", art='" + art + '\'' +
                '}';
    }
}
