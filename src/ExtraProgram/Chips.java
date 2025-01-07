package ExtraProgram;

public class Chips {
        public static int minCostToMoveChips(int[] position) {
            int evenCount = 0, oddCount = 0;
            for (int pos : position) {
                if (pos % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            return Math.min(evenCount, oddCount);
        }

        public static void main(String[] args) {
            int[] position = {1, 2, 3};
            System.out.println("Minimum cost to move chips: " + minCostToMoveChips(position));
        }
}
