package application;

import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        NumberAxis xAxis = new NumberAxis(2006, 2018, 10);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);

        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shangai ranking");

        Map<Integer, Integer> rankingData = new HashMap<>();

        rankingData.put(2007, 73);
        rankingData.put(2008, 68);
        rankingData.put(2009, 72);
        rankingData.put(2010, 72);
        rankingData.put(2011, 74);
        rankingData.put(2012, 73);
        rankingData.put(2013, 76);
        rankingData.put(2014, 73);
        rankingData.put(2015, 67);
        rankingData.put(2016, 56);
        rankingData.put(2017, 56);

        XYChart.Series<Number, Number> shangaiData = new XYChart.Series<>();
        shangaiData.setName("Shanghai");

        rankingData.forEach((year, rank) -> {
            shangaiData.getData().add(new XYChart.Data<>(year, rank));
        });

        lineChart.getData().add(shangaiData);

        Scene view = new Scene(lineChart, 600, 400);
        primaryStage.setScene(view);
        primaryStage.show();
    }

}
