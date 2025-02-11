package org.example;

import org.example.BackEnd.FrameBuilder;
import org.example.BackEnd.Embeddings.EmbeddingsRequests;
import org.example.BackEnd.Setup.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        // FrameBuilder in = new FrameBuilder(); // Se accede a la funcion que construye el frame
        // in.frameSetup(); //se llama a la funcion
        

        //Table table = new Table();
        //table.createTable();

        EmbeddingsRequests ie = new EmbeddingsRequests();
        ie.embeddingsRequest("hola mundo");
        //System.out.println(ie.embeddingsRequest());
       
      


        
        
    }


}