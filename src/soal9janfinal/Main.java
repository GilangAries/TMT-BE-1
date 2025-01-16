package soal9janfinal;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Alpha", 100, 10, 5);
        Boss boss = new Boss("Dracula", 100, 10, 5, 1);

        BattleService battleService = new BattleServiceImpl();

        // Main game loop
        while (true) {
            battleService.playerAttack(player, boss);
            if (battleService.isGameOver(player, boss)) break;

            battleService.bossAttack(boss, player);
            if (battleService.isGameOver(player, boss)) break;
        }
    }
}