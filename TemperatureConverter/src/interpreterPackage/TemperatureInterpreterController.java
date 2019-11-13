package interpreterPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureInterpreterController {

	private Interpreter interpreter;
	private UI ui;
	
	public TemperatureInterpreterController(Interpreter interpreter, UI ui) {
		this.interpreter = interpreter;
		this.ui = ui;
		this.ui.addActionListeners(new MyActionListener());
	}
	
	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			String dataFromTextField;
			String result;
			
			if(event.getSource() == ui.convert) {
				try {
				dataFromTextField = ui.getTextField();
				result = interpreter.interpret(dataFromTextField);
				if(result == null) {
					ui.setText("  You entered an invalid input. Try again." + "\n");
				} else {
					ui.setText(result);
				}
				} catch(NumberFormatException e) {
					ui.displayErrorMessage("Invalid input!");
				}
			} else if(event.getSource() == ui.clear) {
				ui.clearTextFieldAndTextArea();
			} else if(event.getSource() == ui.exit) {
				ui.dispose();
			}
		}
	}
	
}
