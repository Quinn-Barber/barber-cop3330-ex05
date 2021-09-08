package org.example;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("What is the first number?");
        Scanner firsts = new Scanner(System.in);
        int firstn = firsts.nextInt();
        System.out.println("What is the second number?");
        int secondn = firsts.nextInt();
        int add, minus, multiply, divide;
        add = firstn + secondn;
        minus = firstn - secondn;
        multiply = firstn * secondn;
        divide = firstn / secondn;
        System.out.println(firstn + " + " + secondn + " = " + add + "\n" + firstn + " - " + secondn + " = " + minus + "\n" + firstn + " * " + secondn + " = " + multiply + "\n" + firstn + " / " + secondn + " = " + divide);
    }
}
