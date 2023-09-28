package com.workintech.ProductForSale;

public class Chocolate extends ProductForSale{

    private String chocolateType = "Bitter";

    public Chocolate(String type, int price, String description , String chocolateType) {
        super(type, price, description);
        this.chocolateType=chocolateType;
    }

    public String getChocolateType() {
        return chocolateType;
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName() + " isimli çikolata " + getChocolateType() +" dir.");
    }


}
