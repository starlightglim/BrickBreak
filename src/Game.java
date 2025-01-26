import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {
    // paddle properties
    int paddleX=350; //start xpos
    int paddleY=500; //start ypos
    int paddleW=100; //width
    int paddleH=15; //height

    public static void main(String[] args) {
       JFrame frame = new JFrame("Brick Breaker");
       Game game = new Game();
       frame.add(game);
       frame.setSize(800, 600); //window size
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
}