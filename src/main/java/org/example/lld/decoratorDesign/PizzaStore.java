package org.example.lld.decoratorDesign;

import org.example.lld.decoratorDesign.decorators.ExtraCheese;
import org.example.lld.decoratorDesign.decorators.Mushroom;
import org.example.lld.decoratorDesign.piizzaType.BasePizza;
import org.example.lld.decoratorDesign.piizzaType.Farmhouse;

public class PizzaStore {
    public static void main(String[] args) {
        BasePizza pizza = new Farmhouse();
        System.out.println("Base Pizza $" + pizza.cost());

        pizza = new ExtraCheese(pizza);
        System.out.println("BasePizza with Extra Cheese  $" + pizza.cost());

        pizza = new Mushroom(pizza);
        System.out.println("Base Pizza with Mushroom $" + pizza.cost());
    }
}
