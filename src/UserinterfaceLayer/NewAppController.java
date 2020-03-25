package UserinterfaceLayer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class NewAppController
{

    @FXML
    private TextArea address;

    @FXML
    private TextField name;

    @FXML
    private TextField fathername;

    @FXML
    private TextField CNIC;

    @FXML
    private TextField phoneNumber;

    @FXML
    private TextField accountNumber;

    @FXML
    private DatePicker DOB;

    @FXML
    private TextArea jobDetail;

    @FXML
    private TextField yearlyIncom;

    @FXML
    private TextField refranceName;

    @FXML
    private TextField refrancePhone;

    @FXML
    private TextField duration;

    @FXML
    private TextField amount;

    @FXML
    private Button reject;

    @FXML
    private Button accept;

    @FXML
    private Button nextApplication;

    @FXML
    void gotToNextApplication(ActionEvent event) {

    }

    public void cancelApplication(javafx.event.ActionEvent actionEvent)
    {
    }

    public void submittApplication(javafx.event.ActionEvent actionEvent)
    {
    }
}
