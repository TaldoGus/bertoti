package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("close")) {
                conversor.desligarServidor();
                break;
            } else {
                String prompt = conversor.converter(input);
                System.out.println("Prompt MySQL: " + prompt);
            }
        }
        scanner.close();
    }
}
