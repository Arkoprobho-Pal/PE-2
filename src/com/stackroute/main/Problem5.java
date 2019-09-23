package com.stackroute.main;

import java.util.Scanner;

public class Problem5 {

    public  static void main(String[] args)
    {

        String StudentNum="7";
        String digits="10 33 55 44 22 55 12";
        int StudentSize = 0;
        try {
             StudentSize=Integer.parseInt(StudentNum);

        }catch (NumberFormatException e){
            System.out.println("Invalid Input");
            //return null;
            System.exit(0);
        }
        String[] NumValue=digits.split(" ");
        float[] NumArr=new float[StudentSize];
        for(int i=0;i<StudentSize;i++){
            try {
                NumArr[i]=Float.parseFloat(NumValue[i]);
                if(NumArr[i]<0 || NumArr[i]>100){
                    System.out.println("Invalid Input, Value should be in between 0 to 100");
                    //return null;
                    System.exit(0);
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid Input");
                //return null;
                System.exit(0);
            }
        }
        float sum=0;
        float max=NumArr[0],min=NumArr[0];
        for(float a:NumArr) {
            sum+=a;
            if(a>max){
                max=a;
            }
            if (a<min){
                min=a;
            }
            //System.out.print(" " + a);
        }
        float avg=sum/StudentSize;
       // return NumArr;
        System.out.println("The average is "+avg);
        System.out.println("The minimum is "+min);
        System.out.println("The maximum is "+max);

    }
}
