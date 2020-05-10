package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;


public class Main extends Application {
   /* private String AUDIO_URL = getClass().getResource(
            "Foreign_Sand.mp3").toString(); */
   private String AUDIO_URL = new File(
           "/Music/Foreign_Sand.mp3").toURI().toString();


    @Override
    public void start(Stage primaryStage) throws Exception{

        AudioClip clip = new AudioClip(AUDIO_URL);
        clip.play();
        StackPane raiz = new StackPane();
        raiz.getChildren().add(new Text("Playing a song "));
        Scene cena = new Scene(raiz, 600, 100);
        primaryStage.setTitle("Playing a song in java fx");
        primaryStage.setScene(cena);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
