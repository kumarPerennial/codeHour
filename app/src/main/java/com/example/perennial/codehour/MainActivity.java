package com.example.perennial.codehour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tv = findViewById(R.id.tv);
        int index = findSum("aWk60#ase2>");
        tv.setText(""+alphabet[index-1]);


    }


    private int findSum(String inputValue){
        int sum = 0;
        for (char c : inputValue.replaceAll("\\D", "").toCharArray())
        {
            System.out.println("Digits occured in String: "+c);
            int digit = c - '0';//0 is ascii value of 48
            sum += digit;
            /*
             * Note: If didnt minus 48 then compiler will take ascii value of each digit
             * and then answer would 162
             * thats why we converted character into int by subtracting 48
             * */
        }
        System.out.println("Sum of all digits in String: "+sum);
        return sum;
    }


    private void findPrimeNumberBetween(int n,int m){
        printNumber(n,m);
    }

    public static void printNumber(int number,int number1) {
        printNextNumber(number,number1);
    }

    private static void printNextNumber(int nextNumber,int nextNumbe1) {
        if(nextNumber <= nextNumbe1) {
            System.out.println(nextNumber);
            nextNumber++;
            printNumber(nextNumber,nextNumbe1);		//Note: calls first method again
        }else {
            System.exit(0);
        }
    }
}
