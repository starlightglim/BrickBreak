import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class Game extends JPanel implements KeyListener{


// paddle properties
int paddleX=350;  //start xpos
int paddleY=500;  //start ypos
int paddleW=100;  //width
int paddleH=15;  //height

@Override
public void paintComponent(Graphics g) {
    super.paintComponent(g); // Clear the screen
    System.out.println("paintComponent called");
    g.setColor(Color.BLUE);
    g.fillRect(paddleX, paddleY, paddleW, paddleH); // Draw paddle
}


    
public static void main(String[] args) {
    JFrame frame = new JFrame("Brick Breaker");
    Game game = new Game();
    frame.add(game);
    frame.setSize(800, 600); //window size
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
       
    }
    
}