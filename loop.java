import java.util.Scanner;
class loop
{

    public static void main(String args[]) 
    {
        
        Scanner obj = new Scanner(System.in);
        
        int sum = 0;
        int i=1;
        System.out.println("enter the value num");
        int num = obj.nextInt();
        while(i<=num)
        {
  
        if(i % 2 == 0)
        {
            sum+=i;
            
        }
        i++;
        }
        System.out.println(sum);
    }
}