package org.example.BackEnd.Helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GettingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("src\\main\\resources\\n" + //
                        "ewestData.txt");
        String todo = "";
        while(scanner.hasNextLine()){
            todo = scanner.nextLine();
        }
        scanner.close();

        String[] id = {"ID", "Question", "AnswerC", "Answer", "Explanation" };
        int t = 0;

        ArrayList<Questions> Embeddings = new ArrayList<Questions>();
        String[] preguntas = todo.split("#########################################################");

        for(String x: preguntas){
            
            String [] individual= x.split("###");
            Questions question = new Questions(individual[0], individual[1], individual[2], individual[3], individual[4], individual[5]);
            
        }

        
    }
}
