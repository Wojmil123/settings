import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppSettings {
    AppSettings(JFrame frame){
        JDialog window = new JDialog(frame, "Settings", true);
        JPanel topPanel, centerPanel, centerPanel1, centerPanel2, bottomPanel;
        topPanel = new JPanel();
        setTopPanel(topPanel, window);
        centerPanel1 = new JPanel();
        setCenterPanel1(centerPanel1);
        centerPanel2 = new JPanel();
        setCenterPanel2(centerPanel2);
        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(centerPanel1);
        centerPanel.add(centerPanel2);
        bottomPanel = new JPanel();
        setBottomPanel(bottomPanel);
        window.add(topPanel, BorderLayout.NORTH);
        window.add(centerPanel, BorderLayout.CENTER);
        window.add(bottomPanel, BorderLayout.SOUTH);
        setWindow(window);
    }

    private void setWindow(JDialog dialog){
        dialog.setMinimumSize(new Dimension(400, 410));
        dialog.setVisible(true);
    }

    private void setTopPanel(JPanel panel, JDialog dialog){
        JButton reject, save;
        JLabel label = new JLabel("Dostępne ustawienia");
        reject = new JButton("Odrzuć");
        setRejectButton(reject, dialog);
        save = new JButton("Zachowaj");
        setSaveButton(save, dialog);
        panel.add(label);
        panel.add(reject);
        panel.add(save);
    }

    private void setRejectButton(JButton button, JDialog dialog){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });
    }

    private void setSaveButton(JButton button, JDialog dialog){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Saved");
                dialog.setVisible(false);
            }
        });
    }

    private void setCenterPanel1(JPanel panel){
        panel.setBorder(BorderFactory.createTitledBorder("Okno"));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JCheckBox c1 = new JCheckBox("Uruchom wyśrodkowane");
        JCheckBox c2 = new JCheckBox("Uruchom zmaksymalizowane");
        JCheckBox c3 = new JCheckBox("Zapamiętaj pozycję");
        JCheckBox c4 = new JCheckBox("Zapamiętaj rozmiar");
        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(c4);
    }

    private void setCenterPanel2(JPanel panel){
        panel.setBorder(BorderFactory.createTitledBorder("IDE"));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JComboBox languages = new JComboBox();
        JLabel label = new JLabel("Język interfejsu");
        languages.addItem("Polski");
        languages.addItem("English");
        languages.addItem("Deutsch");
        JCheckBox c1 = new JCheckBox("Zapamiętaj katalog przeglądania");
        JCheckBox c2 = new JCheckBox("Zapamiętaj otwarte pliki");
        panel.add(label);
        panel.add(languages);
        panel.add(c1);
        panel.add(c2);
    }

    private void setBottomPanel(JPanel panel){
        panel.setBorder(BorderFactory.createTitledBorder("GUI"));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JCheckBox c1 = new JCheckBox("Ukryj menu główne");
        JCheckBox c2 = new JCheckBox("Odpięty pasek narzędziowy");
        JCheckBox c3 = new JCheckBox("Zablokuj pasek narzędziowy");
        JCheckBox c4 = new JCheckBox("Tryb ciemny");
        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(c4);
    }
}
