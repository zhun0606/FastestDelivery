/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhun0606
 */
public class Employee {
    private String Username;
    private String Password;
    private String WorkingPosition;
    private String Name;
    private String IC;
    private String DOB;
    private String Gender;
    private String Address;
    private String HomePhone;
    private String CellPhone;
    private String Email;
    
    public Employee(){}
    public Employee(String Username, String Password){ this.Username = Username; this.Password = Password;}
    public Employee(String Username, String Password, String WorkingPosition, String Name, String IC, String DOB, String Gender, String Address, String HomePhone, String CellPhone, String Email){
        this.Username = Username; 
        this.Password = Password;
        this.WorkingPosition = WorkingPosition;
        this.Name = Name;
        this.IC = IC;
        this.DOB = DOB;
        this.Gender = Gender;
        this.Address = Address;
        this.HomePhone = HomePhone;
        this.CellPhone = CellPhone;
        this.Email = Email;
    }
    
    
}
