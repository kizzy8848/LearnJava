import OOP.override.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * @author kizzy
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        var s=new String();
        //calculateTheSumOfTheFirstNNaturalNumbers();
        System.out.println(0.0/0);

        printArray();

        Student ss = new Student();
        ss.run();

    }

    /**
     * @author kizzy
     * 计算前n个自然数之和
     */
    public static void calculateTheSumOfTheFirstNNaturalNumbers(){
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n*(n+1)/2);
    }

    public static void printArray(){
        int[][] ns= {{1,2,3},{2,3,4}};
        System.out.println(Arrays.deepToString(ns));

    }

}