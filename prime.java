import java.util.Scanner;
class prime
{
    public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
      System.out.print("enter the number");
      int num=obj.nextInt();
      for(int i=2;i<num;i++){
        if(num % i==0){
            System.out.print("is not prime");
            break;
        }
      }
    }
    }
