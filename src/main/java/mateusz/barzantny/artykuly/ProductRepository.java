package mateusz.barzantny.artykuly;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> productList = new ArrayList<>();

    public ProductRepository() {
        this.productList.add(new Product("Kawa", Category.FOOD, 24.99));
        this.productList.add(new Product("Krzeslo", Category.OTHER, 50.99));
        this.productList.add(new Product("Plyn do naczyn", Category.HOME, 7.99));
        this.productList.add(new Product("Piwo", Category.FOOD, 3.49));
        this.productList.add(new Product("Koc", Category.HOME, 89.99));
        this.productList.add(new Product("Maslo", Category.FOOD, 7.99));
        this.productList.add(new Product("Robot Kuchenny", Category.HOME, 1490.90));
        this.productList.add(new Product("Klocki Hamulcowe", Category.OTHER, 70.30));
        this.productList.add(new Product("Mleko", Category.FOOD, 3.49));
        this.productList.add(new Product("Kasza", Category.FOOD, 2.70));
    }

    public String getProduct() {
        String result = "";
        double sum = 0;

        for (Product prod : productList) {
            result += prod.toString() + "<br/>";
            sum += prod.getPrice();
        }


        return result + "<br/>" + "Suma cen produktow to " + sum;
    }

    public String getProdCategory(Category productCat) {
        String result = "";
        double sum = 0;
        for (Product prod : productList) {
            if (prod.getCategory().equals(productCat)) {
                result += prod.toString() + "<br/>";
                sum += prod.getPrice();
            }
        }

        return result + "suma cen produktw: "+sum+ "zl";
    }

}
