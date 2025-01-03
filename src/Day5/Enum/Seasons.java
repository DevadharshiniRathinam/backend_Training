package Day5.Enum;

enum Season {
    WINTER, SPRING, SUMMER, FALL;

    public double getAverageTemperature() {
        if (this == WINTER) return 0.0;
        if (this == SPRING) return 15.0;
        if (this == SUMMER) return 30.0;
        if (this == FALL) return 10.0;
        return -1.0; // Default case
    }
}

public class Seasons {
    public static void main(String[] args) {
        for(Season season : Season.values()) {
            System.out.println(season + " average temperature: " + season.getAverageTemperature() + "°C");
        }
    }
}

