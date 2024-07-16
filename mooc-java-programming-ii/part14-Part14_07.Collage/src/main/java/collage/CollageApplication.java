package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        Pane pane = new Pane();
        pane.getChildren().add(imageGenerator(sourceImage, 0, 0));
        pane.getChildren().add(imageGenerator(sourceImage, 2, 0));
        pane.getChildren().add(imageGenerator(sourceImage, 0, 2));
        pane.getChildren().add(imageGenerator(sourceImage, 2, 2));
        pane.getChildren().add(imageGenerator(sourceImage, 2, 2));

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static ImageView imageGenerator(Image sourceImage, int xCoord, int yCoord) {
        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        int yCoordinate = 0;
        while (yCoordinate < height) {
            int xCoordinate = 0;
            while (xCoordinate < width) {

                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double red = 1.0 - color.getRed();
                double green =1.0 - color.getGreen();
                double blue = 1.0 - color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);
                int startXPoint = 0;
                int startYPoint = 0;
                if (xCoord != 0) {
                    startXPoint = (int) width / xCoord;
                } else {
                    startXPoint = 0;
                }
                if (yCoord != 0) {
                    startYPoint = (int) height / yCoord;
                } else {
                    startYPoint = 0;
                }
                imageWriter.setColor((int) xCoordinate / 2 + startXPoint, yCoordinate / 2 + startYPoint, newColor);

                xCoordinate++;
            }

            yCoordinate++;
        }
        ImageView image = new ImageView(targetImage);
        return image;

    }

    public static void main(String[] args) {
        launch(args);
    }

}
