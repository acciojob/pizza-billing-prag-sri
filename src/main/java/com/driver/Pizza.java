package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean extraCheese= false;
    boolean extraToppings= false;
    boolean bag;
    boolean billGenerated= false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price= 300;
            this.bill= "Base Price Of The Pizza: 300";
        }
        else
        {
            this.price= 400;
            this.bill= "Base Price Of The Pizza: 400";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese)
        {
            price= price+80;
            extraCheese= true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppings && isVeg)
        {
            price= price+70;
            extraToppings= true;
        }
        else if(!extraToppings && !isVeg)
        {
            price= price+120;
            extraToppings= true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!bag)
        {
            price= price+20;
            bag= true;
        }
    }

    public String getBill(){
        // your code goes here

        if(!billGenerated)
        {
            if(extraCheese)
                bill= bill+"\nExtra Cheese Added: 80";

            if(extraToppings && isVeg)
                bill= bill+"\nExtra Toppings Added: 70";
            else if(extraToppings && !isVeg)
                bill= bill+"\nExtra Toppings Added: 120";

            if(bag)
                bill= bill+"\nPaperbag Added: 20";

            bill= bill+"\nTotal Price: "+price+"\n";

            billGenerated= true;

        }
        return this.bill;

    }
}
