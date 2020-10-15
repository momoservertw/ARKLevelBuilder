public class main {
    public static void main(String[] args) {
        person();
    }

    private static void person() {
        int level = 94;
        long exp = 1000000;
        int maxLevel = 348;
        long addExp = 50000;

        for (int i = level; i <= maxLevel; i++) {
            System.out.print(i + ";" + Math.round(exp) + ";50" + "\n");
            exp += addExp;
        }
    }

    private static void dino() {
        int level = 63;
        long exp = 500000;
        int maxLevel = 326;
        long addExp = 100000;

        for (int i = level; i <= maxLevel; i++) {
            System.out.print(i + ";" + Math.round(exp) + "\n");
            exp += addExp;
        }
    }
}
