
package control;

import da.FoodDA;
import domain.Food;


public class MaintainFood{

    private final FoodDA fdDA;

    public MaintainFood() {
        fdDA = new FoodDA();
    }

    public Food selectRecord(int foodid) {
        return fdDA.getRecord(foodid);
    }

     public void addRecord(Food food) {
        fdDA.addRecord(food);
    }
     
    public void updateRecord(Food food){
         fdDA.updateRecord(food);
     }
     
     public void deleteRecord(Food food){
         fdDA.deleteRecord(food);
     }
    
}
