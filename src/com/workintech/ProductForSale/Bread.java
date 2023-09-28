package com.workintech.ProductForSale;

public class Bread extends ProductForSale{
    private  int gr = 400;
    public Bread(String type, int price, String description,int gr) {
        super(type, price, description);
        this.gr = gr;
    }

    public int getGr() {
        return gr;
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName() + " isimli ekmek " + getGr() +" gr.");
    }
}
