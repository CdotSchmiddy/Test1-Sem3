package test1sem3;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class LaunchLiquidSoap extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("SoapOptions.fxml"));
        
        Parent parent = loader.load();
        
        Scene scene = new Scene(parent);
        
        primaryStage.setTitle("SoapOptions");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}