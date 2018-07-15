public class NearbyElements {
    private int[][] multi;

    public NearbyElements(int[][] multi) {
        this.multi = multi;
    }

    public int[] nearby(int x, int y, int range) {
        int lastIndex = multi[x].length - 1;
        int itemsBefore = (y < range) ? y : range;
        int itemsAfter = (lastIndex - y < range) ? lastIndex - y : range; 
        int[] items = new int[itemsBefore + itemsAfter];

        for (int i = 0, j = y - itemsBefore; i < items.length; i++) {
            items[i] = multi[x][(j >= y) ? ++j : j++];
        }

        return items;
    }
}
