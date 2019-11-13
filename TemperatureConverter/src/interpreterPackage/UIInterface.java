package interpreterPackage;

import java.awt.event.ActionListener;

public interface UIInterface {
	
	public void setText(String text);
	public void clearTextFieldAndTextArea();
	public void addActionListeners(ActionListener listener);
	public String getTextField();
	public void displayErrorMessage(String string);
	public void dispose();
}
