package soal9janfinal;

class Player {
    private String name;
    private int hp;
    private int power;
    private int defense;

    public Player(String name, int hp, int power, int defense) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.defense = defense;
    }

    public String getNama() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public int getDefense() {
        return defense;
    }
}