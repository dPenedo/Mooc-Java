package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {
    public static void main(String[] args) {

        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();

        NumberAxis xAxis = new NumberAxis(0, 110, 5);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        layout.setCenter(lineChart);

        // Ahorros mensuales
        BorderPane firstBorderPane = new BorderPane();
        Label monthlyLabel = new Label("Monthly savings");
        Slider savingsSlider = new Slider(25, 250, 25);
        // Label savingsSliderLabel = new Label("Money saved of the month savings");
        Integer valueOfSavingSlider = (int) savingsSlider.getValue();
        savingsSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            valueOfSavingSlider.intValue();
        });
        Label savingsSliderLabel = new Label("Money saved per month: " + valueOfSavingSlider);
        firstBorderPane.setLeft(monthlyLabel);
        firstBorderPane.setCenter(savingsSlider);
        firstBorderPane.setRight(savingsSliderLabel);

        // Tasa de interés anual
        BorderPane secondBorderPane = new BorderPane();
        Label interestLabel = new Label("Yearly interest rate");
        Slider interestSlider = new Slider(0, 10, 0);
        Label interestSliderLabel = new Label("Interest rate of the year");
        secondBorderPane.setLeft(interestLabel);
        secondBorderPane.setCenter(interestSlider);
        secondBorderPane.setRight(interestSliderLabel);

        VBox borderPaneContainer = new VBox();
        borderPaneContainer.setPadding(new Insets(20, 20, 20, 20));
        borderPaneContainer.setSpacing(10);

        borderPaneContainer.getChildren().add(firstBorderPane);
        borderPaneContainer.getChildren().add(secondBorderPane);
        layout.setTop(borderPaneContainer);

        Scene view = new Scene(layout, 400, 300);

        stage.setScene(view);
        stage.show();
    }

}