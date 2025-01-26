import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
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
    frame.addKeyListener(game); // listener added
    game.setFocusable(true); // allow panel focus
       
    }


@Override 
public void keyPressed(KeyEvent e){
    int key = e.getKeyCode();
    if (key == KeyEvent.VK_LEFT && paddleX > 0){
        paddleX -= 20; //left
    }

    if (key == KeyEvent.VK_RIGHT && paddleX < (getWidth()- paddleW)){
        paddleX += 20; //right
    }
    repaint();

}

@Override public void keyTyped(KeyEvent e) {}
@Override public void keyReleased(KeyEvent e) {}    
    
}

