package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призовная кампания
*/

public class Solution {
    public static void main(String[] args) {
      
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();
        
        if(age >= 18 && age <= 28)
        {
                System.out.println(name + ", явитесь в военкомат");
            }
            console.close();
    }
}
