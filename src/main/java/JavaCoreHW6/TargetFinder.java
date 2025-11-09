package JavaCoreHW6;

import java.util.Arrays;

class TargetFinder {

    public int[] findTarget(int[] aiCoords, int [][] targets) {
        int[] nearest = null;
        double minDistance = Double.MAX_VALUE;

        for (int[] target : targets) {
            double distance = Math.sqrt(
                    Math.pow(target[0] - aiCoords[0], 2) +
                    Math.pow(target[1] - aiCoords[1], 2)
            );
            if (distance < minDistance) {
                minDistance = distance;
                nearest = target;
            }
        }
        return nearest;
    }
}
class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}