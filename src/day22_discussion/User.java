package day22_discussion;

public class User {

    // blueprint 
    int id;
    String name;
    String email;
    String password;
    String userRole;

    // alt + insert
//    public User() {
//    }

    //parametered constructor
    public User(String name, String email, String password, String userRole, String companyName) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
    }
    public String getRoleInfo(){
        return "Name : " + name + "User Role : " + userRole;
    }

//    public String getUserRole() {
//        return userRole;
//    }
//
//    public void setUserRole(String userRole) {
//        this.userRole = userRole;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

}
