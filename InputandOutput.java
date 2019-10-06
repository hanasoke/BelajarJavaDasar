
import java.util.Scanner;


public class InputandOutput {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("Input Your Name: ");
        String name = inputUser.nextLine();
        
        System.out.print("Input Your Age: ");
        int age = inputUser.nextInt();
        
        System.out.println("Your Name is "+name);
        System.out.println("Your Age is "+age);
    }
    
}
