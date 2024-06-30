package textstatistics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();

        TextArea textArea = new TextArea();
        HBox indicadores = new HBox();
        indicadores.setSpacing(10);
        String caracters = "Letters: 0";
        Label charsLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestLabel = new Label("The longest word is: ");
        indicadores.getChildren().add(charsLabel);
        indicadores.getChildren().add(wordsLabel);
        indicadores.getChildren().add(longestLabel);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            charsLabel.setText("Letters: " + characters);
            String[] parts = newValue.split(" ");
            int words = parts.length;
            wordsLabel.setText("Words: " + words);
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            longestLabel.setText("The longest word is: " + longest);
        });


        layout.setBottom(indicadores);
        layout.setCenter(textArea);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }
}
