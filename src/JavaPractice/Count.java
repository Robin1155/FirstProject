package JavaPractice;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int stringlength=name.length();
        System.out.println("Length: "+ stringlength);
    }
}
