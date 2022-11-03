package Product;

import java.util.Objects;

public class Product {

    private final String name;
    private int cost;
    private final int weight;

    public Product(String name, int cost, int weight) {
        if (name != null && !name.isBlank()&&!name.isEmpty()&&cost>0) {
            this.name = name;
            this.cost = cost;
            this.weight = weight;

        } else throw new RuntimeException("Поле не заполнено или меньше нуля");
    }

    public String getName() {
        return name;
    }


    public int getCost() {
        return cost;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return  Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return
                "Наименование='" + name + '\'' +
                ", Цена=" + cost +
                ", Вес=" + weight +
                '}'+ "\n";
    }
}
