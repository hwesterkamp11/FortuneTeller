import javax.swing.*;
import java.awt.*;

public class FortuneTellerFrame extends JFrame{
    public FortuneTellerFrame() {
        setTitle("Fortune Teller");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = createTopPanel();
        JPanel middlePanel = createMiddlePanel();
        JPanel bottomPanel = createBottomPanel();

        add(topPanel, BorderLayout.NORTH);
        add(middlePanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel createTopPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon("images/fortuneteller.jpg");
        JLabel label = new JLabel("Fortune Teller", icon, JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setFont(new Font("Serif", Font.BOLD, 48));

        panel.add(label, BorderLayout.CENTER);
        return panel;
    }

    private JPanel createMiddlePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setFont(new Font("SansSerif", Font.PLAIN, 16));
        JScrollPane scrollPane = new JScrollPane(textArea);

        panel.add(scrollPane, BorderLayout.CENTER);
        return panel;
    }

    private JPanel createBottomPanel() {
        
    }
}
