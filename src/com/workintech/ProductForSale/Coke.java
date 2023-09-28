package com.workintech.ProductForSale;

public class Coke extends ProductForSale{
    private String name = "Pepsi";
    public Coke(String type, int price, String description ,String name) {
        super(type, price, description);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName() + " isimli Kola " + getName() +"dir");
    }
}
