import java.util.Scanner;
public class mini_project {
    public static void main(String[] args){
      //mini project
      Scanner sc = new Scanner(System.in);
      int myNumber= (int)(Math.random()*100);
      int userNumber =0;
      do{
        System.out.println("guess my number:");
        userNumber = sc.nextInt();
        if(userNumber==myNumber){
            System.out.println("hoohuuu...congluatoin");
            break;
        }
        else if(userNumber> myNumber){
            System.out.println("your number is tooo large");
        }
        else {
            System.out.println("your number is small");
        }
      }while(userNumber >=0);
      System.out.println("my number was:" + myNumber);
    }
    
}
