import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {
    // Game variables will go here later

    public static void main(String[] args) {
       JFrame frame = new JFrame("Brick Breaker");
       Game game = new Game();
       frame.add(game);
       frame.setsize(800, 600); //window size
    }
}