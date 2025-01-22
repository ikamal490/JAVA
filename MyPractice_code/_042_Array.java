package MyPractice_code;

import java.util.Scanner;

/*
    Problem: WAP to find out whether a given number is present in an array or not.
 */
public class _042_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = {34,45,30,89,74,85};
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        boolean isInArray = false;
        for(int i=0; i<=values.length-1; i++){
            if(num==values[i]){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println(num+" is present in this array ");
        }
        else{
            System.out.println(num+" is not present in this array ");
        }
        }
    }

