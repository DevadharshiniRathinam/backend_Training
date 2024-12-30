package Day2.OopsBasic;

import java.util.Scanner;

public class Car {
    public void display(String brands,String model, int price)
    {
        System.out.println("Brands: " + brands);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public void discount(int price)
    {
        System.out.println("10% Discounted price: " + (price-(price/10)));
    }
    public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      String brands= s.nextLine();
      String model= s.nextLine();
      int price= s.nextInt();
      Car c= new Car();
      c.display(brands,model,price);
      c.discount(price);
    }
}
