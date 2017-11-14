
package control;

import da.LoginDA;
import domain.Login;

public class MaintainLogin{

    private final LoginDA loginDA;

    public MaintainLogin() {
        loginDA = new LoginDA();
    }

    public Login selectRecord(String userid) {
        return loginDA.getRecord(userid);
    }

     public void addRecord(Login login) {
        loginDA.addRecord(login);
    }
     
    public void updateRecord(Login login){
         loginDA.updateRecord(login);
     }
     
     public void deleteRecord(Login login){
         loginDA.deleteRecord(login);
     }
    
}