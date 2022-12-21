package day42;

import java.util.ArrayList;
import java.util.List;

public class PizzaDemo {
	public static void main(String[] args) {
   Pizza dominos = new Pizza();
   dominos.setPrice(15.99);
   
   List<String> mytoppings = new ArrayList<>();
   mytoppings.add("cheese");
   mytoppings.add("chicken");
   mytoppings.add("viggie");
   mytoppings.add("mushroom");
  // mytoppings.add("onions"); // topping is not available
   
   dominos.setToppings(mytoppings);
   System.out.println(dominos.getPrice());
   System.out.println(dominos.getToppings());//new topping hassan
     	}
	
	}
