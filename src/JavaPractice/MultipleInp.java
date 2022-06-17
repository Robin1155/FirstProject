package JavaPractice;

import java.util.Scanner;

public class MultipleInp {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();


        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("The numbers in the array are:");
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
