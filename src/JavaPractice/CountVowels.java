package JavaPractice;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        int cnta=0,cnte=0,cnti=0,cnto=0,cntu=0;
        System.out.println("Enter a string: ");
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        for(int i=0;i<a.length();i++){
            char temp=a.charAt(i);
            if(temp=='a'){
                cnta++;}
                else if(temp=='e'){
                    cnte++;}
                    else if(temp=='i'){
                        cnti++;}
                        else if (temp=='o'){
                            cnto++;}
                            else if(temp=='u'){
                                cntu++;}
        }
        System.out.println("Count of a: " +cnta);
        System.out.println("Count of e: " +cnte);
        System.out.println("Count of i: " +cnti);
        System.out.println("Count of o: " +cnto);
        System.out.println("Count of u: " +cntu);
    }
}
