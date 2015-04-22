package blankboard;

import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author ADarkHero
 */
public class BlankBoard extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double displaywidth = screenSize.getWidth();
        double displayheight = screenSize.getHeight();
        
        Scene scene = new Scene(root, displaywidth, displayheight);
        
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
