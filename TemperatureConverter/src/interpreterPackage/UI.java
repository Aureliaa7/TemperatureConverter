package interpreterPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UI extends JFrame implements UIInterface {
	
	private JPanel panel;
	JButton convert, clear, exit;
	private JTextField textField;
	private JLabel label;
	private JTextArea textArea;
	
	public UI() {
		super("Temperature Convertor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		Insets insets;
		
		panel = new JPanel();
		panel.setLayout(null);
		label = new JLabel("Enter the temperature you want to convert");
		panel.add(label);
		textField = new JTextField(20);
		panel.add(textField);
		convert = new JButton("Convert");
		panel.add(convert);
		clear = new JButton("Clear");
		panel.add(clear);
		exit = new JButton("Exit");
		panel.add(exit);
		textArea = new JTextArea(20, 20);
		panel.add(textArea);
		
		insets = panel.getInsets();
		Dimension size = label.getPreferredSize();
		label.setBounds(8+insets.left, 90+insets.top, size.width, size.height);
		
		panel.setBackground(Color.cyan);		
		
		size = textField.getPreferredSize();
		textField.setBounds(280+insets.left, 80+insets.top, size.width+20, size.height+15);
		
		size = convert.getPreferredSize();
		convert.setBounds(350+insets.left, 115+insets.top, size.width+20, size.height+20);
		convert.setBackground(Color.GREEN);
		
		size = clear.getPreferredSize();
		clear.setBounds(60+insets.left, 300+insets.top, size.width+40, size.height+20);
		clear.setBackground(Color.yellow);
		
		size = exit.getPreferredSize();
		exit.setBounds(360+insets.left, 300+insets.top, size.width+50, size.height+20);
		exit.setBackground(Color.magenta);
		
		size = textArea.getPreferredSize();
		textArea.setBounds(550+insets.left, 30+insets.top, 400, 400);
		textArea.setBackground(Color.lightGray);
		textArea.setEditable(false);
		this.setContentPane(panel);
		Insets insets2 = this.getInsets();
		this.setSize(1040+insets2.left+insets2.right, 450+insets2.top+insets2.bottom);
		
	}
	
	public void setTextField(String string) {
		textField.setText(string);
	}
	
	public String getTextField() {
		return textField.getText();
	}
	
	public void addActionListeners(ActionListener listener) {
		convert.addActionListener(listener);
		clear.addActionListener(listener);
		exit.addActionListener(listener);
	}
	
	 // Open a popup that contains the error message passed
	public void displayErrorMessage(String errorMessage){
	        JOptionPane.showMessageDialog(this, errorMessage);
	}

	// put the text in TextArea
	public void setText(String text) {
		textArea.append(text + "\n");
	}

	// clear the textArea and the textField
	public void clearTextFieldAndTextArea() {
		textField.setText(null);
		textArea.setText(null);
	}
		
}
