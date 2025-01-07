package ExtraProgram;

public class Highest {
        public static int highestAltitude(int[] gain) {
            int currentAltitude = 0;
            int highestAltitude = 0;

            for (int g : gain) {
                currentAltitude += g;
                highestAltitude = Math.max(highestAltitude, currentAltitude);
            }

            return highestAltitude;
        }

        public static void main(String[] args) {
            int[] gain = {-5, 1, 5, 0, -7};
            System.out.println("Highest altitude: " + highestAltitude(gain));
        }
    }

