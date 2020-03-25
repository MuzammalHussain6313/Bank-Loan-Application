package UserinterfaceLayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("Deshboard.fxml"));
            primaryStage.setTitle("SILKOPS Application");
            primaryStage.setScene(new Scene(root, 1199, 715));
            primaryStage.show();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}


