package domain;

import java.io.Serializable;

public class Food implements Serializable {
    private int foodId;
    private String foodName;
    private double foodPrice;
    private int foodCount;

    public Food() {
    }

    public Food(int foodId) {
        this.foodId = foodId;
    }

    public Food(int foodId, String foodName, double foodPrice, int foodCount) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodCount = foodCount;
    }

    public int getFoodId() {
        return foodId;
    }
    
    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }
    
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    
    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }
    
    public int getFoodCount(){
        return foodCount;
    }

    public void setFoodcount(int foodCount){
        this.foodCount = foodCount;
    }
    
    @Override
    public String toString() {
        return String.format("%-5s %-40s %.2f %d", foodId, foodName, foodPrice, foodCount);
}
}
