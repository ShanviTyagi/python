import java.security.cert.PKIXReason;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
public static void printJava(){
  System.out.println("hello java");
}
public static void printName(String name){
        System.out.println(name);
}
public static void printSum(int a,int b){
  System.out.println(a+b);
}
    public  static void main(String[] args){
        System.out.println("hello world");
         /*  int phone=123456;
        //non-primitive type
        String name="benna";
        System.out.println(name.length());
        System.out.println(name);
        System.out.println(phone);
        //cocatenate        
        String name1 = "Aman";
        String name2 = "akku";
        String name3 = "beena";
        String name4 = name1 +" and "+name2;
        System.out.println(name4);
        //charAt
        String name7="Aman";
        System.out.println(name7.charAt(0));
        //length
        System.out.println(name7.length());
        //replace
        String name6=name1.replace('a','b');
        System.out.println(name6);*/
        //substring
        /*String name9="Aman and Akku";
        System.out.println(name9.substring(0,4));
        int age=30;
        int physics=97;
        int chem=98;
        int eng=90;
        int[] marks = new int[3]; //new use for non permitvity data type
        marks[0]=98;
        marks[1]=87;
        marks[2]=99;
        /*System.out.println(marks[2]);
        //length
        System.out.println(marks.length);*/
        //sort*/
        /*System.err.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        int[] marks4={97,98,95};
        int[][] finalmarks={{87,98,99},{76,90,56}};
        System.out.println(finalmarks[0][0]);
        //casting
        double price=100.00;
        double finalprice=price +18;
        System.out.println(finalprice);      
        int p= 100;
        int fp = p+(int)18.18;
        System.out.println(fp);
        //constant
        int age=32;
        int age=33;*/
        /*final float PI=3.14F; //due to final pi value is constant not changelable without final we can chnage the value of pi
        //operators

        /*int a =1; //double a=1;
        int b=2;  //double b=2;
        int div=a/b; //double div =a/b
        int modulo = a%b;
        System.out.println(modulo);// output is 0.5*/
        int numb=1;
       // numb++;   //numb= numb+1;,numb++ is uniary operator
       /*  System.out.println(numb++);//1
        System.out.println(++numb);//3
        System.out.println(numb);//2 //3
        System.out.println(--numb);//2
        //maths
        //5,6 print maximum number use the function of math max
        System.out.println(Math.min(5,6));
        //random function return 0.0 to 0.1 return any random funcion
        System.out.println((int)(Math.random()*100)); */
        //how to take INPUT
        /*  Scanner sc = new Scanner(System.in);
        System.out.println("Input your a:");
        int a = sc.nextInt();
        System.out.println(a);*/
        int a=2;
        double pi=3.14;
        System.out.println("area of circle is: " + pi*a*a);
        
        /*for(int x=0;x<=10;x++)
        System.out.println("this is x: " +x);
        int p=30;
        int q=20;
        if(p<q)
        System.out.println("p is less than y");
        p=p*2;
        if(p<q)
        System.out.println("p is eual to q ");
        p=p*2;
        if(p<q)
        System.out.println("p is greater than q");*/
       /* char ch=88;
        char ch1='y';
        System.out.println("ch and ch1");
        System.out.print("ch and ch1 is");
        System.out.println(ch+ " "+ ch1);
        int c=3;
        int b=5;
        double e= Math.sqrt(c*c + b*b);
        System.out.println("hypotenous is: " + e);*/
        //how to take input
       /*  Scanner scanner = new Scanner(System.in);
        System.out.println("input your age");
        int age = scanner.nextInt();
        System.out.println(age);*/
        //camporsion operator
        //a==b
        //a!=b
        //condtion statement
        boolean isSunUp= true;
        if(isSunUp == true)
        System.out.println("day");
        else
        System.out.println("night");
        //logical opeartor;
        //&&
        int a1= 30;
        int b= 50;
        //if(a1<20 && b>60)
        //System.out.println("both less than 80");
        //||
          if(a1==30 || b==80) 
          System.out.println("hello"); 
          //switch case codition statement
          /*int day =5;  
          switch(day){
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            default :
            System.out.println("thrus.... sunday");
            //loops
            for(int i=1; i<=10;i=i+1){
                System.out.println("the table of 2 is: "+2*i);
            }
            //while
            int i =100;
            while(i>=1){
               System.out.println(i);
               i--;
            }
            //do while loop
            int j=100;
            do{
                System.out.println(j);
                j--;
            }while(j>=1);
          }*/
         /*  Scanner sc=new Scanner(System.in);
          int number=0;
          do{
            System.out.println("input a number:");
            number = sc.nextInt();
            System.out.print("here is your number : ");
            System.out.println(number);

          }while(number >=0);
          System.out.println("the end");*/
          //break and continue
          /*int i=0;
          while(true)
          {
            if(i==3)
            {
              i=i+1;
            continue;
             //i=i+1;
            }
            System.out.println(i);
            i=i+1;
            if(i>5)
            {
              break;//0,1,2,3,4,5
            }
          }*/
          //try - catch in expection handling
          /*int[] marks={97,98,67};
          try{
            System.out.println(marks[5]); 
          }catch(Exception expection){

            //do something after catching
          }
        
          System.out.println("the name is aman");*/
          //method
          
          printJava();
          printSum(3,7);
          printName("Aman");

    }
}
  

