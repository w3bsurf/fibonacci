package fibonacci;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Fibonacci Joonas Hakkarainen 19.01.2020
 */
public class Fibonacci {

    /* Produce a fibonacci sequence as a list */
    public List<Integer> countFibonacci(int start, int length) {
        List<Integer> fList = new ArrayList<>();
        int n1 = 0, n2 = 1, n3;

        for (int i = 1; i <= length; i++) {
            if (i >= start) {
                fList.add(n2);
            }
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        return fList;
    }

    /* Write a fibonacci sequence from a list into a file */
    public void fibonacciToFile(int start, int length) {

        if (verifyInput(start, length) == false) {
            return;
        }

        List<Integer> fList = countFibonacci(start, length);
        length = fList.size();
        FileWriter file = null;

        try {
            file = new FileWriter("fibonacci.txt");
            for (int i = 0; i < length; i++) {
                file.write(fList.get(i) + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /* Check that length and start number are valid inputs */
    public boolean verifyInput(int start, int length) {
        if (length > 0 && start >= 0 && start <= length) {
            return true;
        } else {
            return false;
        }
    }

    /* Take input from user for start number and sequence length */
    public SequenceRange inputRange() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting number for sequence");
        int start = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the length of sequence to count");
        int length = Integer.parseInt(scan.nextLine());
        scan.close();
        return new SequenceRange(start, length);
    }
}