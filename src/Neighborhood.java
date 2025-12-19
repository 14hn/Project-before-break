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

        // adds a key listener to the jframe
        frame.addKeyListener(new KeyListener(){

            // varribles for keeping track of key presses
            int upCount = 0;
            int downCount = 0;
            int leftCount = 0;
            int rightCount = 0;
            int interactCount = 0;

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
                    case KeyEvent.VK_E:
                        interact.setText("interact: " + Integer.toString(interactCount++));
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

        ArrayList<Neighborhood> playArea = new ArrayList<>();
        ArrayList<Neighborhood> row1 = new ArrayList<>();
        ArrayList<Neighborhood> row2 = new ArrayList<>();
        ArrayList<Neighborhood> row3 = new ArrayList<>();
        ArrayList<Neighborhood> row4 = new ArrayList<>();
        ArrayList<Neighborhood> row5 = new ArrayList<>();

    }
}
