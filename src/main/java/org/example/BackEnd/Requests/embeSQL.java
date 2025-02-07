package org.example.BackEnd.Requests;


import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class embeSQL {
    public static void embeSQL(String pregunta) {
        String url = "https://hacknet-colsanjose.openai.azure.com/";
        String urlDB = "jdbc:postgresql://hacknet.cncguc2ysbs8.us-east-1.rds.amazonaws.com:5432/HACKNETDB";
        String path = "src\\main\\resources\\n" + //
                        "ewestData.txt";

        // Coneccion con la base de Datos
        Properties props = new Properties();
        //FALTA USER Y PASSWORD
        Connection conn;
        try {
            conn = DriverManager.getConnection(urlDB, props);
            Statement st = conn.createStatement();
            st.executeQuery("Insert into DATA (ID, Question, AnswerC, Answer, Explanation, Embedding)");
        } catch (SQLException e) {
            System.out.println("no funciono brou");
            e.printStackTrace();
        }
    }
}
