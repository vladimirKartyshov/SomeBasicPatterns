package memento;

public class MementoGame {

    public static void main(String[] args) {

        Game game = new Game();
        game.set("LVL 1", 50000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("LVL 2", 100000);
        System.out.println(game);

        System.out.println("Загружаемся");
        game.load(file.getSave());
        System.out.println(game);

    }
}
