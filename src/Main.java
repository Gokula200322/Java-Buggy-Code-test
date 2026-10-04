import BuggyPackage1.BuggyCode1;
import BuggyPackage2.BuggyCode2;
import BuggyPackage3.BuggyCode3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BuggyCode1 ===");
        List<Integer> readings = List.of(1000, 7, 1000, -4);
        System.out.println("Average (expected 500.75): " + BuggyCode1.average(readings));
        System.out.println("Has duplicates (expected true): " + BuggyCode1.hasDuplicates(readings));
        System.out.println("Highest of negatives (expected -2): " + BuggyCode1.highest(List.of(-5, -2, -9)));

        System.out.println("\n=== BuggyCode2 ===");
        BuggyCode2 inv = new BuggyCode2();
        inv.add(new BuggyCode2.Product("A", 0), 10.0);
        inv.add(new BuggyCode2.Product("B", 5), 20.0);
        inv.add(new BuggyCode2.Product("C", 3), 30.0);
        inv.add(new BuggyCode2.Product("D", 9), 40.0);
        System.out.println("Price of B (expected 20.0): " + inv.lookupPrice("B", 5));
        System.out.println("Top 2 stocked (expected 2 items): " + inv.topStocked(2));
        try {
            inv.removeOutOfStock();
            System.out.println("After removal: " + inv.getProducts());
        } catch (Exception e) {
            System.out.println("removeOutOfStock crashed: " + e);
        }

        System.out.println("\n=== BuggyCode3 ===");
        BuggyCode3 acc = new BuggyCode3("  Goku  ", 0);
        System.out.println("Owner (expected 'Goku'): '" + acc.getOwner() + "'");
        acc.deposit(0.1);
        acc.deposit(0.2);
        System.out.println("Balance is 0.3 (expected true): " + acc.hasBalance(0.3));
        acc.deposit(100);
        acc.applyMonthlyFee("BASIC");
        System.out.println("Balance after BASIC fee (expected 95.3): " + acc.getBalance());
        try {
            System.out.println("Points for unknown user (expected 0): " + acc.getPoints("nobody"));
        } catch (Exception e) {
            System.out.println("getPoints crashed: " + e);
        }
    }
}