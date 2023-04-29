import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    MainWindow(){
        JFrame window = new JFrame("MainWindow");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setSize(700, 400);
        JPanel panel = new JPanel();
        JButton button = new JButton("Preferences");
        setButtonValues(button, window);
        panel.add(button);
        window.add(panel);
    }

    public void setButtonValues(JButton button, JFrame frame){
        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("preferences");
                new AppSettings(frame);
            }
        });
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
