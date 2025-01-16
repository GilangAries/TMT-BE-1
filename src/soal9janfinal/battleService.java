package soal9janfinal;

interface BattleService {
    void playerAttack(Player player, Boss boss);
    void bossAttack(Boss boss, Player player);
    boolean isGameOver(Player player, Boss boss);
} 

// BattleServiceImpl class implements BattleService
class BattleServiceImpl implements BattleService {
    private int turn = 1;

    @Override
    public void playerAttack(Player player, Boss boss) {
        boss.setHp(boss.getHp() + boss.getDefense() - player.getPower());
        boss.incrementHitCount();

        System.out.println("Turn : " + turn + " - " + player.getNama() + "(" + player.getHp() + ") hit " + boss.getNama() + "(" + boss.getHp() + ")");

        if (boss.getHitCount() == 5) {
            boss.setModifier(3); // Activate buff after 5 hits
            System.out.println(boss.getNama() + " memilikii buff");
        }

        turn++;
    }

    @Override
    public void bossAttack(Boss boss, Player player) {
        player.setHp(player.getHp() + player.getDefense() - (boss.getPower() * boss.getModifier()));

        System.out.println("Turn : " + turn + " - " + boss.getNama() + "(" + boss.getHp() + ") hit " + player.getNama() + "(" + player.getHp() + ")");

        if (boss.getModifier() == 3) {
            System.out.println(boss.getNama() + " telah menggunakan buff");
            boss.setModifier(1);
            boss.resetHitCount();
        }

        turn++;
    }

    @Override
    public boolean isGameOver(Player player, Boss boss) {
        if (player.getHp() <= 0 || boss.getHp() <= 0) {
            if (player.getHp() <= 0) {
                System.out.println(player.getNama() + " has been defeated. " + boss.getNama() + " wins!");
            } else {
                System.out.println(boss.getNama() + " has been defeated. " + player.getNama() + " wins!");
            }
            return true;
        }
        return false;
    }
}