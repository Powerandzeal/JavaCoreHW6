package Reciepe;

import Product.Product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import Product.ProductList;


public class Recipe {

    private String nameOfReciepe;
    private int sumCostOfRecipes;

    private final Map<Product,Integer> products = new HashMap<Product, Integer>();

    public Recipe(String nameOfReciepe) {
        this.nameOfReciepe = nameOfReciepe;
        this.sumCostOfRecipes = 0;
        System.out.println("Создаем новый рецепт "+ nameOfReciepe);

    }
    public void addProduct (Product product, int quanity) throws RuntimeException {

        if (products.containsKey(product)) {
            throw new RuntimeException("Продукт уже добавлен");
        }
        products.put(product,quanity);
        sumCostOfRecipes = (sumCostOfRecipes + product.getCost())*quanity  ;
    }


    public String getNameOfReciepe() {
        return nameOfReciepe;
    }

    public void setNameOfReciepe(String nameOfReciepe) {
        this.nameOfReciepe = nameOfReciepe;
    }

    public int getSumCostOfRecipes() {
        return sumCostOfRecipes;
    }

    public void setSumCostOfRecipes(int sumCostOfRecipes) {
        this.sumCostOfRecipes = sumCostOfRecipes;
    }



    @Override
    public String toString() {
        return "Название рецепта='" + nameOfReciepe + '\'' +
                ", Общая стоимость=" + sumCostOfRecipes +
                ", Продукты="+"\n" + products +
                '}';
    }
}
