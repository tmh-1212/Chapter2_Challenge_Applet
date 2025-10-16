
package chapter2_challenge_applet;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class BouncingTextApplet extends Applet implements Runnable {
    private Thread animationThread;
    private String text = "GOOD LUCK!!!"; 
    private int x = 0;
    private int speed = 5;
    private double angle = 0; // For sine wave
    private final int amplitude = 30; // Height of the curve
    private final int frequency = 10; // Controls wave smoothness

    public void init() {
        setSize(500, 200);
        setBackground(Color.BLACK);
    }

    public void start() {
        if (animationThread == null) {
            animationThread = new Thread(this);
            animationThread.start();
        }
    }

    public void stop() {
        animationThread = null;
    }

    public void run() {
        while (Thread.currentThread() == animationThread) {
            x += speed;
            if (x > getWidth()) {
                x = -getFontMetrics(getFont()).stringWidth(text);
            }

            angle += 0.1; // Increment angle for sine wave
            repaint();

            try {
                Thread.sleep(50); // Smoother animation
            } catch (InterruptedException e) {
                // Handle if needed
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        int y = (int)(getHeight() / 2 + Math.sin(angle) * amplitude);
        g.drawString(text, x, y);
    }
}
