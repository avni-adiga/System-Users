/**
 * Write a description of class UserRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserRunner {
    public static void main (String [] args) {
    
        User u1 = new User("Babbage", "@CmptrMkr", "Master");
        System.out.println(u1);
        u1.login("c", "d");
        System.out.println(u1);
        u1.login("Babbage", "@CmptrMkr");
        System.out.println(u1);
        u1.logout();
        System.out.println(u1);
        User u2 = new User("Lovelace", "1stProgrmr!", "Admin");
        u2.login("Lovelace", "1stProgrmr!");
        System.out.println(u2);
        
    }
}