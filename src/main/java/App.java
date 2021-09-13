import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many people? ");
        int n_people = Integer.parseInt(scanner.nextLine());
        System.out.print("How many pizzas do you have? ");
        int n_pizzas = Integer.parseInt(scanner.nextLine());
        System.out.print("How many slices per pizza? ");
        int slices_p_pizza = Integer.parseInt(scanner.nextLine());
        int total_slices = n_pizzas * slices_p_pizza;
        int slices_p_person = total_slices / n_people;
        if (slices_p_person % 2 != 0) {
            slices_p_person--;
        }
        int n_leftovers = total_slices - (slices_p_person * n_people);
        System.out.println(String.format("%s people with %s pizzas (%s slices)",
                n_people, n_pizzas, total_slices));
        System.out.println(String.format("Each person gets %s slices of pizza.\nThere are %s leftover slices.",
                slices_p_person, n_leftovers));
    }
}
