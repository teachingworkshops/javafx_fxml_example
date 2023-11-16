
package application;

import javafx.event.ActionEvent;
import javafx.scene.control.ProgressIndicator;
import javafx.fxml.FXML;

/**
* TODO: add all the code and comments!
*/
public class MainController {
	boolean direction = true;
	ProgressIndicator p;
	double progress;

	 @FXML 
	 protected void handleSubmitButtonAction(ActionEvent event) {
		 	
		 progress = p.getProgress();
		 progress= (direction?progress+0.05:progress-0.05);
		 if(progress>1) {
			 direction = !direction;
			 progress=1;
		 }
		 if(progress<0) {
			 direction = !direction;
			 progress=0;
		 }
		 p.setProgress(progress);
		 System.out.printf("COMP1050 is R.A.D. (Rapid Application Development)! %n%.2f%n",progress);
		 
		 }
	    
}
