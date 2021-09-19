public class Main {
    public static void main(String[] args) {
        Champions yasuo = new Champions("Yasuo", 5, false, 0, 10);
        Champions zed = new Champions("Zed", 6, true, 8, 0);
        Champions irelia = new Champions("Irelia", 7, false, 8,2);
        Champions darius = new Champions("Darius", 6, true,2,6);

        zed.kills();
        yasuo.dies();

        irelia.isBlueSide();
        darius.isBlueSide();
    }
}
