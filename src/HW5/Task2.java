package HW5;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        String roman ="MMMCMXCIX";
        int[] arab = new int[roman.length()];
        int arabNumber =0;
        for (int i=0;i<roman.length();i++){
            if (roman.charAt(i)=='M'){
                arab[i]=1000;
            }else if (roman.charAt(i)=='D'){
                arab[i]=500;
            }else if (roman.charAt(i)=='C'){
                arab[i]=100;
            }else if (roman.charAt(i)=='L'){
                arab[i]=50;
            }else if (roman.charAt(i)=='X'){
                arab[i]=10;
            }else if (roman.charAt(i)=='V'){
                arab[i]=5;
            }else {
                arab[i]=1;
            }
        }

        for (int i=arab.length-1;i>=0;i--){
            if (i!=arab.length-1&&(arab[i]<arab[i+1])){
                arabNumber=arabNumber-arab[i];
            }else{
                arabNumber=arabNumber+arab[i];
            }
        }
        System.out.println(arabNumber);
    }
}
