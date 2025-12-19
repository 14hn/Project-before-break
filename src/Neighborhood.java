import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.*;

public class Neighborhood {

    public Neighborhood(){
        JFrame frame = new JFrame(); // creates JFrame object
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setFocusable(true);

        JPanel panel = new JPanel();
        JLabel up = new JLabel();
        JLabel down = new JLabel();
        JLabel left = new JLabel();
        JLabel right = new JLabel();
        JLabel interact = new JLabel();
        JLabel inv = new JLabel();


        // sets the lables text after adding them to the panel
        panel.add(up);
        up.setText("up: 0");
        panel.add(down);
        down.setText("down: 0");
        panel.add(left);
        left.setText("left: 0");
        panel.add(right);
        right.setText("right: 0");
        panel.add(interact);
        interact.setText("interact: 0");
        panel.add(inv);
        inv.setText("inv: 0");


        // adds a key listener to the jframe
        frame.addKeyListener(new KeyListener(){

            // varribles for keeping track of key presses
            int upCount = 1;
            int downCount = 1;
            int leftCount = 1;
            int rightCount = 1;
            int interactCount = 1;
            int invCount = 1;

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch(keyCode) { //if else statments for player input, VK_"Key" is used to ensure anyform of up arrow work
                    case KeyEvent.VK_UP: // if pressed key is up arrow do
                        up.setText("up: " + Integer.toString(upCount++)); // changes label text
                        break;
                    case KeyEvent.VK_DOWN: // if pressed key is down arrow do:
                        down.setText("down: " + Integer.toString(downCount++)); // changes label text
                        break;
                    case KeyEvent.VK_LEFT: // if pressed key is left arrow do:
                        left.setText("left: " + Integer.toString(leftCount++)); // changes label text
                        break;
                    case KeyEvent.VK_RIGHT: // if pressed key is right arrow do:
                        right.setText("right: " + Integer.toString(rightCount++)); // changes label text
                        break;
                    case KeyEvent.VK_Z:
                        interact.setText("interact: " + Integer.toString(interactCount++));
                        break;
                    case KeyEvent.VK_X:
                        inv.setText("inv: " + Integer.toString(invCount++));
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }});

        frame.add(panel);
    }
    public static void main(String[] args) throws Exception {
        new Neighborhood();
        Location emptySpace = new Location();
        ArrayList<Location> playArea = new ArrayList<>();

        ArrayList<Location> row = new ArrayList<>();
        for (int i = 0; i >= 5; i++){
            row.add(emptySpace);
        }
        for (int i = 1; i >= 5; ){
            playArea.addAll(row);
        }
        
    }
}
