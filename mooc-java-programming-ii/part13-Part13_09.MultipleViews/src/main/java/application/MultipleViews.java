package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // First view
        BorderPane borderPaneVBox = new BorderPane();
        // Second View
        VBox vBoxView = new VBox();
        // Third View
        GridPane gridPaneView = new GridPane();


        Scene firstScene = new Scene(borderPaneVBox);
        Scene secondScene = new Scene(vBoxView);
        Scene thirdScene = new Scene(gridPaneView);

        // First View Elements
        Button toTheSecondButton = new Button("To the second view!");
            toTheSecondButton.setOnAction(event -> {
                stage.setScene(secondScene);

            });
        // Second View Elements
        Button toTheThirdButton = new Button("To the third view!");
            toTheThirdButton.setOnAction(event -> {
                stage.setScene(thirdScene);
            });
        Label secondViewLabel = new Label("Second view!");
        // Third View Elements
        Label thirdViewLabel = new Label("Third view!");
        Button toTheFirstButton = new Button("To the first view!");
        toTheFirstButton.setOnAction(event -> {
            stage.setScene(firstScene);
        });

        // First view
        borderPaneVBox.setTop(new Label("First view!"));
        borderPaneVBox.setCenter(toTheSecondButton);
        // Second View
        vBoxView.getChildren().add(toTheThirdButton);
        vBoxView.getChildren().add(secondViewLabel );
        // Third View
        gridPaneView.add(thirdViewLabel, 0, 0);
        gridPaneView.add(toTheFirstButton, 1, 1);


        stage.setScene(firstScene);
        stage.show();


    }
//    The layout of the first view is done with the help of the BorderPane class. At the top there is the text "First view!". The center of the view contains a button with the text "To the second view!". By pressing that button the application swithces to the second view.

//    The layout of the second view is done with the help of the VBox class. The first element in the layout is a button with the text "To the third view!" in it — by pressing the button the application switches to the third view. The button is followed by the text "Second view!".

//    The third view uses the GridPane class for its layout. At the coordinates (0, 0) there is a text that reads "Third view!". At coordinates (1, 1) there is a button with the text "To the first view!". Pressing this button brings back the first view.

}
