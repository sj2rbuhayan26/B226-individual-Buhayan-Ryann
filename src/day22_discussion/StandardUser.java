/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day22_discussion;


public class StandardUser extends User{
    String companyName;

    public StandardUser(String name, String email, String password, String userRole, String companyName) {
        super(name, email, password, userRole, companyName);
        
       this.companyName = companyName;
    }
   

    public String getCompanyName() {
        return companyName;
    }
    
    
}
