
package control;

import da.LoginDA;
import domain.User;

public class MaintainLogin{

    private final LoginDA loginDA;

    public MaintainLogin() {
        loginDA = new LoginDA();
    }

    public User selectRecord(String userid) {
        return loginDA.getRecord(userid);
    }

     public void addRecord(User login) {
        loginDA.addRecord(login);
    }
     
    public void updateRecord(User login){
         loginDA.updateRecord(login);
     }
     
     public void deleteRecord(User login){
         loginDA.deleteRecord(login);
     }
    
}