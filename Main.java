import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int q=s.nextInt();
      int r;
      int sum=0;
      int counter=0;
      while(q!=0)
        {
          r=q%10;
          System.out.println(r);
          counter++;
          sum=sum+r;
          q=q/10;
        }
      System.out.println("addition of all the digits are "+ sum); 
      System.out.println("total number of digits are " + counter); 
    }
}
