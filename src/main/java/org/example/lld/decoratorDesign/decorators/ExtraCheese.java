package org.example.lld.decoratorDesign.decorators;

import org.example.lld.decoratorDesign.piizzaType.BasePizza;

public class ExtraCheese extends ToppingDeorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+10;
    }
}
