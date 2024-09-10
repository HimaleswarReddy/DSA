package apna.strings;

public class ShortestPath {
    public static void main(String[] args) {
        String dir = "WNEENESENNN";
        System.out.println(shortesPath(dir));
    }

    public static int shortesPath(String str) {
        int x = 0;
        int y = 0;
        // E = x + 1
        // W = x - 1
        // N = y + 1
        // S = y - 1

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            } else if (str.charAt(i) == 'N') {
                y++;
            } else {
                y--;
            }
        }
        int distance = (int)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }
}
