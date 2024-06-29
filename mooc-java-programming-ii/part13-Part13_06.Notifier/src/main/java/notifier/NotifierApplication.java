package notifier;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) {

        VBox vBox = new VBox();
        TextField textField = new TextField();
        Button button = new Button("Pulsa el boton");
        Label label = new Label();

        button.setOnAction(actionEvent -> {
            label.setText(textField.getText());
        });

        vBox.setSpacing(10);
        vBox.getChildren().add(textField);
        vBox.getChildren().add(button);
        vBox.getChildren().add(label);

        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();


    }
    // The topmost is a text field (TextField), the middle one is a button (Button), and component on the bottom is a text component (Label). Lay out the components using the VBox class.
}
