/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day22_discussion;

//payment
//person 
//
public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("Ryann", "ryann@gmail.com", "ryann231","Admin","It");
        System.out.println(admin.getRoleInfo());
        System.out.println("Dept Name : " + admin.deptName);
        
        StandardUser User = new StandardUser("buhayan", "buhayan@gmail.com", "buhayan132", "Standard user","Joysis tech voc");
        System.out.println(User.getRoleInfo());
        
        System.out.println("Company Name : " + User.companyName);
    }
}
