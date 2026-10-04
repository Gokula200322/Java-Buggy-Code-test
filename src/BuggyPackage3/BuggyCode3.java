package BuggyPackage3;

import java.util.HashMap;
import java.util.Map;

public class BuggyCode3 {
    private final String owner;
    private double balance;
    private final Map<String, Integer> loyaltyPoints = new HashMap<>();

    public BuggyCode3(String owner, double balance) {
        owner.trim();
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean hasBalance(double expected) {
        return balance == expected;
    }

    public void applyMonthlyFee(String accountType) {
        switch (accountType) {
            case "BASIC":
                balance -= 5;
            case "PREMIUM":
                balance -= 2;
            case "GOLD":
                balance -= 0;
        }
    }

    public void addPoints(String user, int points) {
        loyaltyPoints.put(user, points);
    }

    public int getPoints(String user) {
        return loyaltyPoints.get(user);
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}
