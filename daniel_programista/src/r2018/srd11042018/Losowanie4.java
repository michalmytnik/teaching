package r2018.srd11042018;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Losowanie4 {
        private static final int NUMBERS = 6;
        private static final int MAX_NUMBER = 49;

        public static void main(String[] args) {
            Set<Integer> winningNumbers = createWinningNumbers();
            Set<Integer> ticket = getTicket();
            System.out.println();

            Set<Integer> intersection = new TreeSet<>(ticket);
            intersection.retainAll(winningNumbers);

            System.out.println("Your ticket numbers are " + ticket);
            System.out.println("The winning numbers are " +
                    winningNumbers);
            System.out.println();
            System.out.println("You had " + intersection.size() +
                    " matching numbers.");
            if (intersection.size() > 0) {
                double prize = 100 * Math.pow(2, intersection.size());
                System.out.println("The matched numbers are " +
                        intersection);
                System.out.println("Your prize is $" + prize);
            }
        }

        private static Set<Integer> createWinningNumbers() {
            Set<Integer> winningNumbers = new TreeSet<>();
            Random r = new Random();
            while (winningNumbers.size() < NUMBERS) {
                int number = r.nextInt(MAX_NUMBER) + 1;
                winningNumbers.add(number);
            }
            return winningNumbers;
        }

        private static Set<Integer> getTicket() {
            Set<Integer> ticket = new TreeSet<>();
            Scanner console = new Scanner(System.in);
            System.out.println("Type your " + NUMBERS +
                    " unique lotto numbers: ");
            while (ticket.size() < NUMBERS) {
                int number = console.nextInt();
                ticket.add(number);
            }
            return ticket;
        }
    }

