public class Champions {
    String name;
    int killCount,
        deathCount;
    double level;
    boolean blueSide;

    public Champions(String name, double level, boolean blueSide, int killCount, int deathCount) {
        this.name = name;
        this.level = level;
        this.blueSide = blueSide;
        this.killCount = killCount;
        this.deathCount = deathCount;
    }


    int kills() {
        killCount++;
        System.out.println("The champion have been slain. "+name+" got "+killCount+" kills.");
        return killCount;
    }

    int dies() {
        deathCount++;
        System.out.println("" + name + " died " + deathCount + " times.");
        return deathCount;
    }

    void isBlueSide() {
        if (blueSide)
            System.out.println(name+" is blue side.");
        else
            System.out.println(name+" is red side.");
    }
}
