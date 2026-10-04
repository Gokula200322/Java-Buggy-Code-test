package BuggyPackage1;

import java.util.List;

public class BuggyCode1 {
    public static double average(List<Integer> readings) {
        int sum = 0;
        for (int r : readings) {
            sum += r;
        }
        return sum / readings.size();
    }

    public static boolean hasDuplicates(List<Integer> readings) {
        for (int i = 0; i < readings.size(); i++) {
            for (int j = i + 1; j < readings.size(); j++) {
                if (readings.get(i) == readings.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int highest(List<Integer> readings) {
        int max = 0;
        for (int r : readings) {
            if (r > max) {
                max = r;
            }
        }
        return max;
    }
}
