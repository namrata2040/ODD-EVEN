import java.util.*;
public class oddeven1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
            if(a%2==0){
                System.out.println("The number entered is Even");
                System.out.println("Even numbers till "+a+" are:");
                for(int i=0;i<=a;i++){
                    if(i%2==0){
                        System.out.print(i+", ");
                    }
                    
                }
          
                
            } else{
                System.out.println("The number entered is Odd");
                System.out.println("Odd numbers till "+a+" are:");
                for(int i=0;i<=a;i++){
                    if(i%2!=0){
                        System.out.print(i+", ");
                    }
                }
            }        

    }
}    
     


