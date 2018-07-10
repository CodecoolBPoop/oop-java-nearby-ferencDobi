import java.util.Arrays;

public class NearbyElements {
    private static int[][] multi = new int[][]{
        { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
        { 1, 3, 5, 7 },
        { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };

    public static int[] nearby(int x, int y, int range) {
        int lastIndex = multi[x].length - 1;
        int itemsBefore = (y < range) ? y : range;
        int itemsAfter = (lastIndex - y < range) ? lastIndex - y : range; 
        int[] items = new int[itemsBefore + itemsAfter];

        for (int i = 0, idx = y - itemsBefore; i < items.length; i++) {
            items[i] = multi[x][(idx >= y) ? ++idx : idx++];
        }

        return items;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nearby(0, 2, 2))); // [2, 0, 1241, 12]
        System.out.println(Arrays.toString(nearby(1, 0, 1))); // [3]
        System.out.println(Arrays.toString(nearby(1, 3, 5))); // [1, 3, 5]
        System.out.println(Arrays.toString(nearby(0, 6, 1))); // [5, 1110]
    }
}