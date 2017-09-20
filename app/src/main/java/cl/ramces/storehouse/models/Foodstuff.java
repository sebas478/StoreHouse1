package cl.ramces.storehouse.models;

public class Foodstuff {

    private int quantity, limit, base;
    private String food;

    public Foodstuff() {
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getLimit() {
        return this.limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getFood() {
        return this.food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
