package hackerrank_30days_Code;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;
public class Day_02 {

    
    static void solve(double meal_cost, int tip_percent, int tax_percent) {


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double meal_cost = input.nextDouble();
        int tip_percent = input.nextInt();
        int tax_percent = input.nextInt();
        input.close();

        int totalCost = (int)Math.round (meal_cost+
                                         meal_cost*tip_percent/100+
                                         meal_cost*tax_percent/100);

        System.out.println(totalCost);

    }
}
