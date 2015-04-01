/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesbar;

import java.util.Scanner;

/**
 *
 * @author MingJie
 */
public class Salesbar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("please enter how many sales of five stores. ");

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first store's sales of the day.");
        int store1 = scan.nextInt();
        int storesales = store1/100;
        for (int i = 0; i < storesales; i++) {
            
            System.out.print("* ");
        }
        System.out.println("");

        System.out.println("enter the second store's sales of the day.");
        int store2 = scan.nextInt();
        int storesales2= store2/100;
        for (int j = 0; j < storesales2; j++) {
            System.out.print("* ");
        }
        System.out.println("");

        System.out.println("enter the third store's sales of the day.");
        int store3 = scan.nextInt();
        int storesales3= store3/100;
        for (int j = 0; j < storesales3; j++) {
            System.out.print("* ");
        }
        System.out.println("");

        System.out.println("enter the fourth store's sales of the day.");
        int store4 = scan.nextInt();
        int storesales4= store4/100;
        for (int j = 0; j < storesales4; j++) {
            System.out.print("* ");
        }
        System.out.println("");

        System.out.println("enter the fifth first store's sales of the day.");
        int store5 = scan.nextInt();
        int storesales5 = store5/100;
        for (int j = 0; j < storesales5; j++) {
            System.out.print("* ");
        }
        System.out.println("");

    }

}
