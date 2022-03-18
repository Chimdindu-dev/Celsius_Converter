import javax.swing.*;

public class CelsiusConverterSwing extends JFrame {
    private JPanel mainPanel;

    public CelsiusConverterSwing(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

    }

    public static void main(String[] args) {
        JFrame test = new CelsiusConverterSwing("Celsius Converter");
        test.setVisible(true);
    }

}


