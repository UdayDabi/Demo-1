

import java.util.Scanner;

public class max_min {
    public static void main(String[]args){
        
        System.out.println("min max program is here");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int a=sc.nextInt();
        System.out.println("enter another nunmber:");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("the maximum number is:"+a);
        }
        else{
            System.out.println("the maximum number is:"+b);
        }

    }
   
}

    



