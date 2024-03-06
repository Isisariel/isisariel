import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class programa extends JFrame implements ActionListener {
    private JButton button1;
    private JTextField textField;
    private JLabel label;

    public programa() {
        setTitle("Exemplo de Programa GUI");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        button1 = new JButton("Clique aqui");
        button1.addActionListener(this);
        panel.add(button1);

        textField = new JTextField(15);
        panel.add(textField);

        label = new JLabel("Texto:");
        panel.add(label);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            String text = textField.getText();
            label.setText("Texto: " + text);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new programa();
            }
        });
    }
}