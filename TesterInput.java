package Toko;

import java.util.Scanner;

public class TesterInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Mau CD/DVD?");
        String pilihan = in.nextLine();

        System.out.println("Name: ");
        String nama = in.nextLine();
        System.out.println("Number: ");
        int number = in.nextInt();
        System.out.println("Quantity: ");
        int quantity = in.nextInt();
        System.out.println("Price: ");
        double price = in.nextDouble();
        // Reset Scanner
        in.nextLine();

        if (pilihan.equalsIgnoreCase("CD")) {
            System.out.println("Artist: ");
            String artist = in.nextLine();
            System.out.println("Label: ");
            String label = in.nextLine();
            System.out.println("Total Song? ");
            int numSong = in.nextInt();
            CD c1 = new CD(number, nama, quantity, price, artist, numSong, label);
            c1.print();
        } else if (pilihan.equalsIgnoreCase("DVD")) {
            System.out.println("Leght: ");
            int length = in.nextInt();
            System.out.println("Studio: ");
            String studio = in.nextLine();
            System.out.println("Rating: ");
            String rating = in.nextLine();
            DVD dvd1 = new DVD(number, nama, quantity, price, length, rating, studio);
            dvd1.print();
        }
        in.close();
    }
}
