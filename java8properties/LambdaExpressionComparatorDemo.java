package java8properties;
import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

class Product0{

  int id;

  String name;

  float price;

  public Product0(int id, String name, float price) {

    super();

    this.id = id;

    this.name = name;

    this.price = price;

  }

}

public class LambdaExpressionComparatorDemo{

  public static void main(String[] args) {

    List<Product0> list=new ArrayList<Product0>();

    //Adding Products

    list.add(new Product0(1,"HP Laptop",25000f));

    list.add(new Product0(3,"Keyboard",300f));

    list.add(new Product0(2,"Dell Mouse",150f));

    System.out.println("Sorting on the basis of name...");

    // implementing lambda expression

    Collections.sort(list,(p1,p2)->{

    return p1.name.compareTo(p2.name);

    });

    for(Product0 p:list){

      System.out.println(p.id+" "+p.name+" "+p.price);

    }

  }

}









