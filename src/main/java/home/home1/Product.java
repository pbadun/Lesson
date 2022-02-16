package home.home1;

public class Product {

    private Double weight;
    private int age;

    public Product() {
    }

    public Product(Double weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Product{" +
                " weight=" + weight +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (age != product.age) return false;
        return weight != null ? weight.equals(product.weight) : product.weight == null;
    }

    @Override
    public int hashCode() {
        int result = weight != null ? weight.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
