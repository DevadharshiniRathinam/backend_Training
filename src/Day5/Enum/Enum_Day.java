package Day5.Enum;
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Enum_Day {
    public static void main(String[] args) {
        Day today = Day.SATURDAY;

        switch (today) {
            case SATURDAY:
                System.out.println("It's a weekend.");
                break;
            case SUNDAY:
                System.out.println("It's a weekend.");
                break;
            default:
                System.out.println("It's a weekday.");
                break;
        }
    }
}
