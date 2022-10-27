/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = myObj.next();

        System.out.print("Hi " + name + "! ");

        if (name.equals("Bob") || name.equals("Alice")) {
            System.out.println("There you are!");
        } else {
            System.out.println("I was looking for Alice or Bob...");
        }
    }
}
