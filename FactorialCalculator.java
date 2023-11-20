import java.util.Scanner;


public class FactorialCalculator {
    
    static void factorial(int val){
        int fct = val;
        System.out.print(val + "! = " );
        for (int rep = 1; rep <= val; rep++){
            
            System.out.print(rep);
            if(rep <= (val - 1)){
                System.out.print(" x ");
                fct *= rep;
                //
            }
        }
        
        System.out.println("\nThe factorial of " + val + " is: " + fct);
    }
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("<------ Factorial Calculator ------>");
        while (true){
        System.out.print("Enter a positive integer: ");
        int num = read.nextInt();
        
        if (num >= 0){
            //proceed
            factorial(num);
        } else {
            System.out.println("Error: Negative value or invalid input.");
            break;
        }
        
        }
        
    }
}
