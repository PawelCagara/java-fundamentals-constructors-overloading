package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {
    /*
        Implement the following methods:

        1. add, which accepts two floats and returns a float (both floats added together)


        2. add, which accepts two doubles and returns a double (both doubles added together)

        3. subtract, which accepts two floats and returns a float (first float minus second float)

        4. subtract, which accepts a String and a char and returns a string with all instances of the provided char removed

        5. multiply, which accepts two ints and returns an int (first int multiplied by second int)

        6. multiply, which accepts a string and an int, and returns a string containing the provided string
        as many times as the provided int separated by a comma. E.g.
        multiply("Hello", 3) -> "Hello,Hello,Hello"

        7. multiply, which accepts an array of Strings that each contain a number, and an int
        The method should return an array of ints that contain the value of multiplying each String number by the provided int
        E.g.
        multiply(["2", "7", "3"], 3) -> [6, 21, 9]
     */

    @Override
    public float add(float a, float b) {
        return a+b;
    }

    @Override
    public double add(double a, double b) {
        return a+b;
    }
    public float subtract(float a, float b)
    {
        return a-b;
    }
    public String subtract(String a, char b)
    {
        String result= "";
        result+=b;
         return a.replaceAll(result,"");
    }
    public int multiply(int a,int b)
    {
        return a*b;
    }
    public String multiply(String a,int b)
    {
        a+=",";
        a=a.repeat(b);
        return a.substring(0,a.length()-1);
    }

    @Override
    public int[] multiply(String[] a, int b) {
        int[] result = new int[a.length];

        for(int i=0;i<a.length;i++)
        {
            result[i]=Integer.parseInt(a[i]) * b;
        }
        return result;
    }
}
