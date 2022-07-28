package java8properties;
import java.util.ArrayList;

import java.util.List;

import java.util.stream.Stream;

class Product5{

  int id;

  String name;

  float price;

  public Product5(int id, String name, float price) {

    super();

    this.id = id;

    this.name = name;

    this.price = price;

  }

}

public class LambdaExpressionFilterDemo{

  public static void main(String[] args) {

    List<Product5> list=new ArrayList<Product5>();
    
    list.add(new Product5(1,"Samsung 2n",19000f));

    list.add(new Product5(3,"Iphone 6S",65000f));
    
    list.add(new Product5(2,"Sony Xperia",25000f));

    list.add(new Product5(5,"Redmi4 ",26000f));

    // using lambda to filter data

    Stream<Product5> filtered_data = list.stream().filter(p -> p.price > 20000);

    // using lambda to iterate through collection

    filtered_data.forEach(

        product5 -> System.out.println(product5.id+" "+product5.name+": "+product5.price)

    );

  }

}







