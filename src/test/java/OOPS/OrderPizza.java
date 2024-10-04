package OOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderPizza {

    public static Double caliculatePizzaPrice(List<Toppings> toppings, List<PizzaBase> pizzaBases) {
        Double totalPrice = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Which base you want ?");
        String baseType = sc.next();

        for (PizzaBase base : pizzaBases) {
            if (baseType.equalsIgnoreCase(base.getBaseName())) {
                totalPrice += base.getBasePrice();
            }
        }

        for (Toppings topping : toppings) {
            boolean required;
            System.out.println("Do you want to add " + topping.getName() + "as toppings");
            required = sc.nextBoolean();

            if (required) {
                totalPrice += topping.getPrice();
            }
        }

        return totalPrice;
    }

    public static void main(String[] args) {
        Toppings t1 = new Toppings("tomotoes", 10.2);
        Toppings t2 = new Toppings("olives", 20.3);
        Toppings t3 = new Toppings("corn", 30.4);
        PizzaBase p1 = new PizzaBase("Soft", 10.2);
        PizzaBase p2 = new PizzaBase("Standard", 20.3);

        Double totalPrice = caliculatePizzaPrice(new ArrayList<Toppings>() {{
                                                     add(t1);
                                                     add(t2);
                                                     add(t3);
                                                 }},
                new ArrayList<PizzaBase>() {{
                    add(p1);
                    add(p2);
                }});

        System.out.println("Total pizza price is: "   +totalPrice);

        //how mang = 2
//        for (i=0; i< n; i++)
//            for (i=0; i< n; i++) {
//
//                Double cost = caliculatePizzaPrice(new ArrayList<Toppings>(){{ add(t1); add(t2); add(t3); }},
//                        new ArrayList<PizzaBase>(){{ add(p1); add(p2); }});
//    }
    }
}
