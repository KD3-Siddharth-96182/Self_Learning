
 enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    public boolean isWeekday() {
        return !isWeekend();
    }
}


public class Tester {
	public static void main(String[] args) {

        Day d = Day.SATURDAY;

        System.out.println("Day: " + d);
        System.out.println("Is Weekend: " + d.isWeekend());
        System.out.println("Is Weekday: " + d.isWeekday());
    }
}
