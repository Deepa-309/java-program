 import java.util.Scanner;

 class leapyear  
 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = obj.nextInt();
        if (year % 100 == 0) 
        { 
            if (year % 400 == 0) 
            {
                System.out.println("it is a leap year.");
            } 
            else 
            {
                System.out.println("it is not a leap year.");
            }
        } 
        else 
        { 
            if (year % 4 == 0) {
                System.out.println("it is a leap year.");
            } 
            else 
            {
                System.out.println("it is not a leap year.");
            }
        }

    }
}