package modul5;

/**
 * Created by Дмитрий.
 */
public class ValueFinder {
    public static int maxValueFinder(int massive[]) {
        int maxValue = 0;
        for (int first : massive
                ) {
            if (first > maxValue) {
                maxValue = first;
            }
        }
        return maxValue;
    }

    public static int minValueFinder(int massive[]) {
        int minValue = 0;
        for (int first : massive
                ) {
            if (first < minValue) {
                minValue = first;
            }
        }
        return minValue;
    }
}
