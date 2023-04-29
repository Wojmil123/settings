import javax.swing.*;

public class MainWindow {
    MainWindow(){
        JFrame window = new JFrame("MainWindow");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setSize(600, 400);
        JPanel panel = new JPanel();
        JButton button = new JButton("Settings");
        panel.add(button);
        window.add(panel);
    }


    public static void main(String[] args) {
        new MainWindow();
    }
}
