import java.util.Arrays;

public class NearbyTester {
    public static void main(String[] args) {
        int[][] multi = new int[][]{
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
        };

        NearbyElements nearbyFinder = new NearbyElements(multi);

        System.out.println(Arrays.toString(nearbyFinder.nearby(0, 2, 2))); // [2, 0, 1241, 12]
        System.out.println(Arrays.toString(nearbyFinder.nearby(1, 0, 1))); // [3]
        System.out.println(Arrays.toString(nearbyFinder.nearby(1, 3, 5))); // [1, 3, 5]
        System.out.println(Arrays.toString(nearbyFinder.nearby(0, 6, 1))); // [5, 1110]
    }
}
