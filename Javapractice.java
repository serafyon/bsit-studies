import java.util.Scanner;
/**
 *
 * @author LAB6 - PC41
 */
public class Javapractice {

    static void wordreverse(){
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter words to reverse:");
        String[] words = read.nextLine().split(" ");
        
        System.out.println("You wrote: ");
        for (int rep = 0; rep < words.length; rep++){
            System.out.print(words[rep] + " ");
        }
        
        //Make first word letter switch caps
        String first = words[0].substring(0,1).toUpperCase();
        String last = words[words.length - 1].substring(0,1).toLowerCase();
        
        
        System.out.println("\nThe reversed text is: ");
        for (int count = words.length; count > 0; count--){
            System.out.print(words[count - 1] + " ");

        }
    }
    
    static void wordsearch(){
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter any sentence you'd like: ");
        String[] words = read.nextLine().split(" ");
        
        System.out.print("Enter the word you're looking for: ");
        String query = read.nextLine();
        int find = 0;
        for (int rep = 0; rep < words.length; rep++){
            if (query.equalsIgnoreCase(words[rep])){
                ++find;
                System.out.println("Found a match for " + query + "!\nCount: " + find);
            }
            
            if (rep == words.length - 1){
                System.out.println("Finished!");
                break;
            }
        }
        
    }
    
    static void numreverse(){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your numbers:");
        
        String[] nums = read.nextLine().split("");
        int[] t_nums = new int[nums.length];
        // string convert to int
        for(int rep = 0; rep < nums.length; rep++ ){
            t_nums[rep] = Integer.parseInt(nums[rep]);
           
        }
        for(int count = t_nums.length; count > 0; count--){
            System.out.print(t_nums[count - 1]);
        }
        
    }
    
    static void starthi(){
        Scanner read = new Scanner(System.in);
        System.out.print("Hi!");
        
        String[] words = read.nextLine().split(" ");
        
        if(words[0].equalsIgnoreCase("hi")){
            System.out.println("True");
        }else
        { System.out.println("False");
        
        
        }
    }
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the code you'd like to try: ");
        System.out.println("""
                           wordreverse
                           wordsearch
                           numreverse
                           exit
                           """);
        while (true){
            String flag = read.nextLine().toLowerCase();
            
            switch(flag){
                case "wordreverse" -> {
                    wordreverse();
                    break;
                }
                case "wordsearch" -> {
                    wordsearch();
                    break;
                }
                case "numreverse" -> {
                    numreverse();
                    break;
                }
                case "starthi" -> {
                    starthi();
                    break;
                }
                
                case "exit" -> {
                    break;
                }
                
                default -> System.out.println("Cannot find this code, try again?");
            }
        }
        
        
    }
}
