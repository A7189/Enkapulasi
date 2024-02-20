
package enkapulasi;

public class Enkapulasi {


    public static void main(String[] args) {
         user aji = new user("selatan","esteh",1,false);

    aji.setUsername("trek");
    aji.setPassword("esteh");
    aji.setID(1);
    aji.setStatus(false);
    
    System.out.println("Username: " + aji.getUsername());
    System.out.println("Password: " + aji.getPassword()); 
    System.out.println("ID: " + aji.getID());
    System.out.println("Status: " + aji.isStatus());
}
}