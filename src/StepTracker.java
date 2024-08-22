import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepTracker {
    private int limit;
    private int totalSteps;
    private int days;
    private int activeDays;
    public StepTracker(int limit) {
        days = 0;
        activeDays = 0;
        totalSteps = 0;
        this.limit = limit;
    }
    public int getTotalSteps() {
        return totalSteps;
    }
    public int getActiveDays() {
        return activeDays;
    }
    public int getDays() {
        return days;
    }
    public int getStepsForActiveDay() {
        return limit;
    }
    public void addDailySteps(int steps) {
        totalSteps += steps;
        days++;

        if (steps >= limit) activeDays++;
    }
    public double averageSteps() {
        if (totalSteps == 0) return 0.0;
        return (double) totalSteps / days;
    }
    public int activeDays() {
        return activeDays;
    }
}
