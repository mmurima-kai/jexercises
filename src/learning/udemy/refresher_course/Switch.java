package learning.udemy.refresher_course;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.println("Please enter a command");
            String text = input.nextLine();
            switch (text) {
                case "start":
                    System.out.println("Machine Started");
                    break;
                case "stop":
                    System.out.println("Machine Stopped");
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
                } 
            }
            /*
            finally {
                input.close();
            }
            */
        }
}