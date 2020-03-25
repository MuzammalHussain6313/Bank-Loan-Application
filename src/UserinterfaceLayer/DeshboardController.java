package UserinterfaceLayer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DeshboardController
{
    @FXML
    private AnchorPane mainAnchorPane;

    public void reviewNewApp(ActionEvent actionEvent) throws IOException
    {
        try
        {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("ReviewApp.fxml"));
            mainAnchorPane.getChildren().setAll(pane);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void createNewApp(ActionEvent actionEvent) throws IOException
    {
        try
        {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("NewApp.fxml"));
            mainAnchorPane.getChildren().setAll(pane);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
