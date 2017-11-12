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
    
    //constructor
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
    
    //Get
    public String getUsername(){ return this.Username;}
    public String getPassword(){ return this.Password;}
    public String getWorkingPosition(){ return this.WorkingPosition;}
    public String getName(){ return this.Name;}
    public String getIC(){ return this.IC;}
    public String getDOB(){ return this.DOB;}
    public String getGender(){ return this.Gender;}
    public String getAddress(){ return this.Address;}
    public String getHomePhone(){ return this.HomePhone;}
    public String getCellPhone(){ return this.CellPhone;}
    public String getEmail(){ return this.Email;}
    
    //Set
    public void setUsername(String Username){ this.Username = Username;}
    public void setPassword(String Password){ this.Password = Password;}
    public void setWorkingPosition(String WorkingPosition){ this.WorkingPosition = WorkingPosition;}
    public void setName(String Name){ this.Name = Name;}
    public void setIC(String IC){ this.IC = IC;}
    public void setDOB(String DOB){ this.DOB = DOB;}
    public void setGender(String Gender){ this.Gender = Gender;}
    public void setAddress(String Address){ this.Address = Address;}
    public void setHomePhone(String HomePhone){ this.HomePhone = HomePhone;}
    public void setCellPhone(String CellPhone){ this.CellPhone = CellPhone;}
    public void setEmail(String Email){ this.Email = Email;}
    
    //toString
    public String getOverallString(){
        String str = "Username : " + this.Username + "\n" +
                "Password : " + this.Password + "\n" +
                "WorkingPosition : " + this.WorkingPosition + "\n" +
                "Name : " + this.Name + "\n" +
                "IC : " + this.IC + "\n" +
                "DOB : " + this.DOB + "\n" +
                "Gender : " + this.Gender + "\n" +
                "Address : " + this.Address + "\n" +
                "HomePhone : " + this.HomePhone + "\n" +
                "CellPhone : " + this.CellPhone + "\n" +
                "Email : " + this.Email + "\n";
         return str;
    }
}
