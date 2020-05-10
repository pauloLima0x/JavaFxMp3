package Teste;

public class MainFx {
    public static void main(String[] args) {
       // Main.main(args);
         String AUDIO_URL = MainFx.class.getResource(
                 "Foreign_Sand.mp3").toString();
         System.out.println(AUDIO_URL);

    }
}