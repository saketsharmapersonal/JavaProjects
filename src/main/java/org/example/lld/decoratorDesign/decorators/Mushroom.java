package org.example.lld.decoratorDesign.decorators;

import org.example.lld.decoratorDesign.pizzaType.BasePizza;

public class Mushroom extends ToppingDeorator{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
