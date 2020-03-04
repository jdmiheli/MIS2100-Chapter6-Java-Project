package Mihelich.Jacob.Chapter6.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField numeratorTextField;
	private JTextField denominatorTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		numeratorTextField = new JTextField();
		numeratorTextField.setBounds(12, 51, 116, 22);
		frame.getContentPane().add(numeratorTextField);
		numeratorTextField.setColumns(10);
		
		JLabel NumeratorLabel = new JLabel("Numerator");
		NumeratorLabel.setBounds(12, 26, 116, 16);
		frame.getContentPane().add(NumeratorLabel);
		
		denominatorTextField = new JTextField();
		denominatorTextField.setBounds(12, 115, 116, 22);
		frame.getContentPane().add(denominatorTextField);
		denominatorTextField.setColumns(10);
		
		JLabel DenominatorLabel = new JLabel("Denominator");
		DenominatorLabel.setBounds(12, 86, 116, 16);
		frame.getContentPane().add(DenominatorLabel);
		
		JLabel Result = new JLabel("Result");
		Result.setBounds(12, 157, 408, 16);
		frame.getContentPane().add(Result);
		
		JButton CalculateButton = new JButton("Calculate");
		CalculateButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//store value of the numerator text field in a variable 
				double numerator = Double.parseDouble(numeratorTextField.getText());
				//store value of denominator text field in a variable
				double denominator = Double.parseDouble(denominatorTextField.getText());
				
				//try catch statement. catches division by 0
				try {
					//instantiate SimpleMath class into new variable
					SimpleMath mathObject = new SimpleMath();
					Double result = mathObject.divide(numerator, denominator);
					Result.setText(result.toString());
				} catch (ArithmeticException e) {
					Result.setText("Cannot divide by 0");
				}
			}
		});
		CalculateButton.setBounds(22, 186, 97, 25);
		frame.getContentPane().add(CalculateButton);
	}
}
