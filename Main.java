package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rn =new Random();
        int comp= rn.nextInt(3);

        System.out.println("Choose the number for\n STONE (0): \n PAPER (1): \n SCISSORS (2):");
        int you= sc.nextInt();

        if (comp==0){
            System.out.println("Computer select STONE(0)");
        }
        else if (comp==1){
            System.out.println("Computer select PAPER(1)");
        }
        else {
            System.out.println("Computer select SCISSORS(2)");
        }


        if(comp==you){
            System.out.println("Draw");
        }
        else if (comp==0){
            if (you==1){
                System.out.println("You win");
            }
            else {
                System.out.println("You loose");
            }
        }
        else if (comp==1){
            if (you==0){
                System.out.println("You loose");
            }
            else {
                System.out.println("You win");
            }
        }
        else {
            if (you==0){
                System.out.println("You win");
            }
            else {
                System.out.println("You loose");
            }
        }










    }
}
