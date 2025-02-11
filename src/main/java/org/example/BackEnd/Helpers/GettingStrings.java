package org.example.BackEnd.Helpers;
import java.util.ArrayList;
import java.util.Scanner;

public class GettingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("src\\main\\resources\\n" + //
                        "ewestData.txt");
        String todo = "";
        while(scanner.hasNextLine()){
            todo = scanner.nextLine()+todo;
        }
        scanner.close();

        

        ArrayList<Questions> Embeddings = new ArrayList<Questions>();
        String[] preguntas = todo.split("#########################################################");
        String concatenado = "";
        //Para meter separar las preguntas y despues llamar la funcion que conecta con la base de datos
        for(String x: preguntas){
            
            String [] individual= x.split("###");
            Questions question = new Questions(individual[0], individual[1], individual[2], individual[3], individual[4], individual[5]);
            //Para el embedding
            for(String q : individual){
                concatenado = q+concatenado;   
            }
            
        }

        
    }
}
