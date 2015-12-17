import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener {
    private Container pane;
    private JButton FC;
    private JButton CF;
    private JTextField inputTemp;
    private JLabel convertedTemp;

    public TempConversionWindow() {
	this.setTitle("Temperature Conversion");
	this.setSize(500, 500);
	this.setLocation(100, 100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	FC = new JButton("Fahrenheit to Celcius");
	FC.addActionListener(this);
	FC.setActionCommand("convertToCelcius");

	CF = new JButton("Celcius to Fahrenheit");
	CF.addActionListener(this);
	CF.setActionCommand("convertToFahrenheit");

	inputTemp = new JTextField(10);

	convertedTemp = new JLabel(" ");

	pane.add(FC);
	pane.add(CF);
	pane.add(inputTemp);
	pane.add(convertedTemp);
    }

    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	if (event.equals("convertToCelcius")) {
	    String inputtedTemp = inputTemp.getText();
	    String newTemp = String.valueOf(tempConvert.FtoC(Integer.parseInt(inputtedTemp)));
	    convertedTemp.setText(newTemp);
	}
	if (event.equals("convertToFahrenheit")) {
	    String inputtedTemp = inputTemp.getText();
	    String newTemp = String.valueOf(tempConvert.CtoF(Integer.parseInt(inputtedTemp)));
	    convertedTemp.setText(newTemp);
	}
    }
}

