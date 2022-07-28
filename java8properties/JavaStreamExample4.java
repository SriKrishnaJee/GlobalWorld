package java8properties;
import java.util.*;

import java.util.stream.Collectors;

class Products{

  int id;

  String name;

  float price;

  public Products(int id, String name, float price) {

    this.id = id;

    this.name = name;

    this.price = price;

  }

}

public class JavaStreamExample4 {

  public static void main(String[] args) {

    List<Products> productsList = new ArrayList<Products>();

    //Adding Products

    productsList.add(new Products(1,"HP Laptop",25000f));

    productsList.add(new Products(2,"Dell Laptop",30000f));

    productsList.add(new Products(3,"Lenevo Laptop",28000f));

    productsList.add(new Products(4,"Sony Laptop",28000f));

    productsList.add(new Products(5,"Apple Laptop",90000f));

    // max() method to get max Product price

   /* Products productA = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();

    System.out.println(productA.price);

    // min() method to get min Product price

    Products productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();

    System.out.println(productB.price);*/
    Set<Float> productPriceList =



    		   productsList.stream()

    		   .filter(product->product.price < 30000) // filter product on the base of price

    		   .map(product->product.price)

    		   .collect(Collectors.toSet()); // collect it as Set(remove duplicate elements)

    		  System.out.println(productPriceList);



  }

}
