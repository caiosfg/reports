package src;

import src.Finance;
import java.util.Scanner;

public class teste {
    public static void main(String[] args){
        System.out.println("REPORTS DAILY");
        
        Finance finance = new Finance("Yahoo", "Site", 8);
        System.out.println(finance);

        System.out.println("PRESS S OR N :");
        Scanner scan = new Scanner(System.in);
        
        String choice;
        choice = scan.nextLine();
    }
}