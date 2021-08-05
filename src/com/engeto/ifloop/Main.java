package com.engeto.ifloop;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Number> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) System.out.println("FizzBuzz");
           else if (i % 3 == 0) System.out.println("Fizz");
           else if (i % 5 == 0) System.out.println("Buzz");
           else System.out.println(i);



        }



    }
}
