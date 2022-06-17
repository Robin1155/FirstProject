package JavaPractice;

import java.util.Scanner;

public class WholeRev {
    public static void main(String[] args) {
        int a,b,c,d;
        String e,f,g;
        System.out.println("Enter your first name");
        Scanner sc=new Scanner(System.in);
        e=sc.next();

        System.out.println("Enter your last name: ");
        Scanner sc1=new Scanner(System.in);
        f=sc1.next();

        System.out.println("Enter your age:");
        Scanner sc2=new Scanner(System.in);
        a=sc2.nextInt();

        System.out.println("My name is "+e + " "+f + " and I am " +a+" years old" );
    }
}
