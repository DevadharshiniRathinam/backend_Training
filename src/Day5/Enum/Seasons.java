package Day5.Enum;

enum Season {
    WINTER, SPRING, SUMMER, FALL;
}

public class Seasons {
    public static void main(String[] args) {
        for(Season season : Season.values()) {
            System.out.println(season + " average temperature:" + "°C");
        }
    }
}

