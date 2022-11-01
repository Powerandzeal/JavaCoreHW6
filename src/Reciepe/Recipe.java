package Reciepe;

import Product.Product;

import java.util.HashSet;
import java.util.Set;

public class Recipe {

    private String nameOfReciepe;
    private int sumCostOfRecipes;

    private final Set<Product> products = new HashSet<>();

    public Recipe(String nameOfReciepe) {
        this.nameOfReciepe = nameOfReciepe;
        this.sumCostOfRecipes = 0;
        System.out.println("Создаем новый рецепт "+ nameOfReciepe);

    }
    public void addProduct (Product product) throws RuntimeException {

        if (products.contains(product)) {
            throw new RuntimeException("Продукт уже добавлен");
        }
        products.add(product);
        sumCostOfRecipes = sumCostOfRecipes + product.getCost();
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
