import java.util.Scanner;
 
public class Main{
    
    
    
    static void Payroll(){
        // Payroll section goes here
        
        Scanner empcred_user = new Scanner(System.in);
        Scanner jobtime = new Scanner(System.in);
        
        Scanner paymonth = new Scanner(System.in);
        
        Scanner overtimeinput = new Scanner(System.in);
        
        System.out.println("PAYROLL\n======================= \n Input Employee Name:");
        String ECread1 = empcred_user.nextLine();
        
        System.out.println("Employee " + ECread1 + ". \nYou have worked for 160 hours this month. \n Select if Part time(P) or Full time(F). \n P \n F");
        char JTread1 = jobtime.next().charAt(0);
        JTread1 = Character.toUpperCase(JTread1);
        double regularvalue = 160;
        double insurance = 0.05;
        switch(JTread1){
            case 'P':
                System.out.println("Part time\n======================= \nEnter Hourly Rate:");
                // Part time = No overtime check
                double MOsalP = paymonth.nextDouble();
                double regularvalueP = regularvalue * MOsalP;
                System.out.println("Your Hourly Rate is: $" + MOsalP +"/hr \nYour current regular pay is $" + regularvalueP);
                
                //insurance time

                    double grosspayPT = regularvalueP * insurance;
                    System.out.println("Employee has 5% insurance cut, total gross pay is: $" + grosspayPT);
                    
                    System.out.println("\n\nGenerated PAYSLIP \n=======================\n\n");
                    System.out.println("EMPLOYEE ID: 5512356        EMPLOYEE NAME: " + ECread1);
                    System.out.println("DESIGNATION: IT Associate");
                    System.out.println("Regular Pay: $" + regularvalueP);
                    System.out.println("Net Salary Amount: $" + grosspayPT);
                    System.out.println("Prepared By: hrguy");
                
                
                break;
                
            case 'F':
                System.out.println("Full time\n======================= \nEnter Hourly Rate:");
                // Full time = Yes overtime check
                double MOsalF = paymonth.nextDouble();
                System.out.println("Your Hourly Rate is: $" + MOsalF);
                
                boolean OTlooped = true;
                while(OTlooped){
                System.out.println("\n======================= \nOvertime?");
                String OTread = overtimeinput.nextLine();
                OTread = OTread.toUpperCase();
                if (OTread.equals("YES")){
                    //ask hours
                    
                    System.out.print("Input amount of overtime hours: ");
                    int OTread_H = overtimeinput.nextInt();
                    
                    // multiply by 2
                    
                    double overtimevalue = OTread_H * MOsalF * 2;
                    double regularvalueFY = regularvalue * MOsalF;
                    System.out.println("Your Hourly Rate is: $" + MOsalF +"/hr \nYour current regular pay is $" + regularvalueFY);
                    System.out.println("Current overtime pay is $" + overtimevalue);
                    
                    
                    //insurance time

                    double grosspayOTY = regularvalueFY + overtimevalue * insurance;
                    System.out.println("Employee has 5% insurance cut, total gross pay is: $" + grosspayOTY);
                    
                    System.out.println("\n\nGenerated PAYSLIP \n=======================\n\n");
                    System.out.println("EMPLOYEE ID: 5512356        EMPLOYEE NAME: " + ECread1);
                    System.out.println("DESIGNATION: IT Associate");
                    System.out.println("Regular Pay: $" + regularvalueFY + "         Overtime Pay: $" + overtimevalue);
                    System.out.println("Net Salary Amount: $" + grosspayOTY);
                    System.out.println("Prepared By: hrguy");
                    
                    
                    
                    
                    //done
                    OTlooped = false;
                } else if (OTread.equals("NO")){
                double regularvalueF = regularvalue * MOsalF;
                System.out.println("Your Hourly Rate is: $" + MOsalF +"/hr \nYour current regular pay is $" + regularvalueF);
                    //proceed
                    
                    //insurance time

                    double grosspayOTN = regularvalueF * insurance;
                    System.out.println("Employee has 5% insurance cut, total gross pay is: $" + grosspayOTN);
                    
                    System.out.println("\n\nGenerated PAYSLIP \n=======================\n\n");
                    System.out.println("EMPLOYEE ID: 5512356        EMPLOYEE NAME: " + ECread1);
                    System.out.println("DESIGNATION: IT Associate");
                    System.out.println("Regular Pay: $" + regularvalueF);
                    System.out.println("Net Salary Amount: $" + grosspayOTN);
                    System.out.println("Prepared By: hrguy");
                    
                    
                    //done
                    OTlooped = false;
                } else {
                    System.out.println("Not a valid input, options are YES or NO");
                }
                }
                break;
            
            default:
                System.out.println("Wrong option");
                break;
            
        }
        
    }
    
    
    
    public static void main (String args[]){
        
        boolean looped = true;
        
        // Login section goes here
        
        // reloops login prompt until correct
        while(looped){
            Scanner HRlogU = new Scanner(System.in);
            Scanner HRlogP = new Scanner(System.in);
            // declare scanners ^
            System.out.print("Username: ");
            String HRuser = HRlogU.nextLine();
            System.out.print("Password: ");
            String HRpass = HRlogP.nextLine();
            // ask for login credentials input
            
            // basic if else login
            if (HRpass.equals("swapang") && HRuser.equals("hrguy")){
                
                boolean loggedloop = true;
                
                while(loggedloop){
                
                Scanner HRselect = new Scanner(System.in);
                
                System.out.println("Welcome, " + HRuser + ". What would you like to do? \n - PAYROLL \n - LOGOUT");
                String HRsel = HRselect.nextLine();
                HRsel = HRsel.toUpperCase();
                // makes sure it's always caps
                
                
                    if (HRsel.equals("PAYROLL")){
                    Payroll();
                    loggedloop = false;
                    
                    //proceed
                    
                }else if (HRsel.equals("LOGOUT")){
                    System.out.println("Logging out.");
                    loggedloop = false;
                    // end
                }else {
                    System.out.println("Not an option.");
                }
                }
                
                looped = false;
            } else {
                System.out.println("Incorrect login credentials.");
            }
            
        }
        //
        
        
    }
    
    
    
}