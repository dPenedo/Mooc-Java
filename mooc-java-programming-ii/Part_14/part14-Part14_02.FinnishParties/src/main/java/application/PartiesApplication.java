package application;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String filePath = "partiesdata.tsv";
        NumberAxis xAxis = new NumberAxis(1968, 2008, 5);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        xAxis.setLabel("Result");
        yAxis.setLabel("Year");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        Map<String, Map<Integer, Double>> values = new HashMap<>();

        try {
            List<String[]> lines = Files.lines(Paths.get(filePath))
                    .map(row -> row.split("\t"))
                    .collect(Collectors.toList());

            // leer los años de la primera linea, header
            String[] header = lines.get(0);
            for (int row = 1; row < lines.size(); row++) {
                String party = lines.get(row)[0];
                Map<Integer, Double> partyResult = new HashMap<>();
                for (int col = 1; col < lines.get(row).length; col++) {
                    if (!lines.get(row)[col].equals("-")) {
                        partyResult.put(Integer.parseInt(header[col]), Double.parseDouble(lines.get(row)[col]));
                    }
                }
                values.put(party, partyResult);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        values.keySet().stream().forEach(party -> {
            XYChart.Series<Number, Number> data = new XYChart.Series<>();
            data.setName(party);
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data<>(pair.getKey(), pair.getValue()));
            });
            lineChart.getData().add(data);
        });
        Scene scene = new Scene(lineChart, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
