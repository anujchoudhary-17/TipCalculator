package prog24178.fx;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
 
public class FXMLTipCalculatorController implements Initializable {
     
    @FXML
    private TextField  txtBillAmt, txtTipPercent;
    
    @FXML
    private Label lblBill;
    
    Bill bill;
     
    @FXML
    public void calculateTip(ActionEvent event) { 
    	double billAmount = Double.parseDouble(txtBillAmt.getText());
    	double tipPercent = Double.parseDouble(txtTipPercent.getText());
    	bill = new Bill(billAmount, tipPercent);
    	lblBill.setText(bill.toString());
    	
    }

     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     
}