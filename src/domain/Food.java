package domain;

import java.io.Serializable;

public class Food implements Serializable {
    private int foodid;
    private String foodname;
    private double foodprice;
    private int foodcount;

    public Food() {
    }

    public Food(int foodid) {
        this.foodid = foodid;
    }

    public Food(int foodid, String foodname, double foodprice, int foodcount) {
        this.foodid = foodid;
        this.foodname = foodname;
        this.foodprice = foodprice;
        this.foodcount = foodcount;
    }

    public int getFoodId() {
        return foodid;
    }
    
    public void setFoodId(int foodid) {
        this.foodid = foodid;
    }
    
    public String getFoodName() {
        return foodname;
    }

    public void setFoodName(String foodname) {
        this.foodname = foodname;
    }
    
    public double getFoodPrice() {
        return foodprice;
    }

    public void setFoodPrice(double foodprice) {
        this.foodprice = foodprice;
    }
    
    public int getFoodcount(){
        return foodcount;
    }

    public void setFoodcount(int foodcount){
        this.foodcount = foodcount;
    }
    
    @Override
    public String toString() {
        return String.format("%-5s %-40s %.2f %d", foodid, foodname, foodprice, foodcount);
}
}
