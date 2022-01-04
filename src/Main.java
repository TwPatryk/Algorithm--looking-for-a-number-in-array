import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //filling an array with random numbers
        Random random = new Random();
        int [] arr = new int [5];

        for (int i = 0; i< arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        boolean wynik = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 10 that you want to find: ");
        int wyszuk = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == wyszuk) {
                wynik = true;
            }
        }
        if (wynik == true) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}
