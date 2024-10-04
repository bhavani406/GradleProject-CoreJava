package OOPS;

public class PizzaBase {
    private String baseName;
    private Double basePrice;

    public PizzaBase(String baseName, Double basePrice) {
        this.baseName = baseName;
        this.basePrice = basePrice;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }
}
