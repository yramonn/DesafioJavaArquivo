package com.sovos;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Read Files
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class ManipularArquivos {
    public void TryCatch() {

        try {
            File myObj = new File("Java.txt");
            if (myObj.createNewFile()) {
                System.out.println("Arquivo criado com sucesso!  " + myObj.getName());
            } else {
                System.out.println("Arquivo já existe!");
            }
        } catch (IOException e) {
            System.out.println("Deu ruim!");
            e.printStackTrace();
        }
    }

    public void Escrever() {
        try {
            FileWriter myWriter = new FileWriter("Java.txt");
            myWriter.write("O palmeiras não tem mundial\n" +
                    "Palmeiras não tem mundial\n" +
                    "Não tem copinha, não tem mundial\n" +
                    "Não tem copinha, não tem mundial");
            myWriter.close();
            System.out.println("Arquivo escrito com sucesso");
        } catch (IOException e) {
            System.out.println("Deu ruim!");
            e.printStackTrace();
        }
    }

    public void Ler() {
        try {
            File myObj = new File("Java.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Deu ruim!");
            e.printStackTrace();
        }
    }

    public void Cantar() {
        final JFXPanel fxPanel = new JFXPanel();
        String uriString = new File("src/java.mp3").toURI().toString();
        Media pick = new Media(uriString);
        MediaPlayer player = new MediaPlayer(pick);
        player.play();

    }

}
