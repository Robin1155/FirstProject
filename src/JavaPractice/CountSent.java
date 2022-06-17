package JavaPractice;

import java.util.Scanner;

public class CountSent {
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("Output is: " + a);
        int count=0,countblnk=0;
        for(int i=0;i<a.length();i++){
            char temp=a.charAt(i);
            if(temp!=' ') {
                count++;
            }
            else{
                countblnk++;
            }
        }
        System.out.println("Total number of characters: " + count);
    }
}
