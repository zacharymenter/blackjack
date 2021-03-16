import javax.swing.*;

public class Main {

    public static final int SIZE_X = 1280;
    public static final int SIZE_Y = 720;

    public static void main(String[] args) {

        Game game = new Game();
        game.startGame();

        JFrame frame = new JFrame("yeet time");

        frame.setSize(SIZE_X, SIZE_Y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        MyPanel panel = new MyPanel(game);

        frame.add(panel);

        panel.setVisible(true);
        frame.setVisible(true);

        frame.repaint();
        panel.repaint();


        while (true) {
            panel.repaint();
        }

    }

}