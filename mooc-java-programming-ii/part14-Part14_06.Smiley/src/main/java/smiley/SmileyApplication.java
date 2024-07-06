package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        ColorPicker colorPalette = new ColorPicker();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        paintingLayout.setRight(colorPalette);

        paintingCanvas.setOnMouseDragged((event) -> {
            double xLocation = event.getX();
            double yLocation = event.getY();
            painter.setFill(colorPalette.getValue());
            painter.fillOval(xLocation, yLocation, 4, 4);
        });
        drawSmiley(painter);

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }

    public void drawSmiley(GraphicsContext painter) {
        painter.setFill(Color.WHITE);
        painter.setStroke(Color.BLACK);
        painter.setLineWidth(20);
        painter.strokeLine(200, 60, 210, 60);
        painter.setStroke(Color.BLACK);
        painter.setLineWidth(20);
        painter.strokeLine(400, 60, 410, 60);
        painter.setStroke(Color.BLACK);
        painter.setLineWidth(20);
        // painter.strokeLine(120, 300, 580, 300);

        double startX = 120;
        double startY = 300;
        double endX = 580;
        double endY = 300;
        double controlX = (startX + endX) / 2;
        double controlY = 350; // Ajusta este valor para definir la "panza" hacia abajo

        painter.beginPath();
        painter.moveTo(startX, startY);
        painter.quadraticCurveTo(controlX, controlY, endX, endY);
        painter.stroke();
        // painter.fillArc(200, 300, 300, 20, 90, 200, ArcType.ROUND);
        // painter.strokeArc(200, 300, 500, 120, 90, 200, ArcType.ROUND);

    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
