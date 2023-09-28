import com.workintech.ProductForSale.Bread;
import com.workintech.ProductForSale.Chocolate;
import com.workintech.ProductForSale.Coke;
import com.workintech.ProductForSale.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale bread = new Bread("Ekmek",4,"Büyük",400);
        ProductForSale chocolate = new Chocolate("çikolata",10,"Büyük","Bitter");
        ProductForSale coke = new Coke("Kola",14,"Büyük","Pepsi");
        ProductForSale[] products = {bread,chocolate,coke};


        listProducts(products);
        System.out.println(products.length);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            product.showDetails();
        }
    }
}