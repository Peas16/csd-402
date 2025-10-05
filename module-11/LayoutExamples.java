/** Paul Fralix Assignment M11 CSD 402 10/05/2025
 * This program demonstrates two JavaFX layout panes: VBox and BorderPane.
 * Each layout is shown in a separate Stage window for clarity.
 */


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LayoutExamples extends Application {

    @Override
    public void start(Stage primaryStage) {
        showVBoxExample();
        showBorderPaneExample();
    }

    /**
     * Displays a VBox layout with a TextField and two Buttons stacked vertically.
     */
    private void showVBoxExample() {
        // Create VBox with spacing of 10 pixels between elements
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(15));

        // Create UI elements
        TextField textField = new TextField("Enter text here");
        Button playButton = new Button("Play");
        Button stopButton = new Button("Stop");

        // Add elements to VBox
        vbox.getChildren().addAll(textField, playButton, stopButton);

        // Create scene and stage
        Scene scene = new Scene(vbox, 300, 150);
        Stage vboxStage = new Stage();
        vboxStage.setTitle("VBox Layout Example");
        vboxStage.setScene(scene);
        vboxStage.show();
    }

    /**
     * Displays a BorderPane layout with TextFields in each region.
     */
    private void showBorderPaneExample() {
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(15));

        // Create TextFields for each region
        TextField top = new TextField("Top");
        TextField bottom = new TextField("Bottom");
        TextField left = new TextField("Left");
        TextField right = new TextField("Right");
        TextField center = new TextField("Center");

        // Assign nodes to BorderPane regions
        borderPane.setTop(top);
        borderPane.setBottom(bottom);
        borderPane.setLeft(left);
        borderPane.setRight(right);
        borderPane.setCenter(center);

        // Create scene and stage
        Scene scene = new Scene(borderPane, 400, 200);
        Stage borderPaneStage = new Stage();
        borderPaneStage.setTitle("BorderPane Layout Example");
        borderPaneStage.setScene(scene);
        borderPaneStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
