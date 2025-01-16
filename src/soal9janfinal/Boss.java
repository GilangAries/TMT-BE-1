package soal9janfinal;

public class Boss extends Player {
    private int modifier;
    private int hitCount = 0;

    public Boss(String name, int hp, int power, int defense, int modifier) {
        super(name, hp, power, defense);
        this.modifier = modifier;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void incrementHitCount() {
        this.hitCount++;
    }

    public void resetHitCount() {
        this.hitCount = 0;
    }
}
