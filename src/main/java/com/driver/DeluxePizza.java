package com.driver;

public class DeluxePizza extends Pizza {
    boolean extraCheese;
    boolean extraToppings;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        this.extraCheese= true;
        this.extraToppings= true;

        super.addExtraCheese();
        super.addExtraToppings();
    }
}
