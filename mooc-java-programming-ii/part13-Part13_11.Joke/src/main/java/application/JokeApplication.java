package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {
		launch(JokeApplication.class);
    }

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane layout = new BorderPane();
		HBox menu = new HBox();
		menu.setPadding(new Insets(20, 20, 20, 20));
		menu.setSpacing(10);

		Button jokeButton = new Button("Joke");
		Button answerButton = new Button("Answer");
		Button explanationButton = new Button("Explanation");

		menu.getChildren().addAll(jokeButton, answerButton, explanationButton);

		layout.setTop(menu);


		StackPane jokeView = createView("What do you call a bear with no teeth?");
		StackPane answerView = createView("A gummy bear.");
		StackPane explanationView = createView("The joke plays on the wordplay between \"gummy bear\" and \"gummy bear.\"");

		jokeButton.setOnAction((event) -> layout.setCenter(jokeView));
		answerButton.setOnAction((event) -> layout.setCenter(answerView));
		explanationButton.setOnAction((event) -> layout.setCenter(explanationView));

		layout.setCenter(jokeView);

		Scene scene = new Scene(layout);

		stage.setScene(scene);
		stage.show();
		



	}

	private StackPane createView(String text){
		StackPane layout = new StackPane();
		layout.setPrefSize(300, 180);
		layout.getChildren().add(new Label(text));
		layout.setAlignment(Pos.CENTER);

		return layout;
	}
}
