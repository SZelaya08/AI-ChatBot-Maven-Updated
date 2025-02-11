// package org.example.BackEnd.Setup;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.util.Properties;

// import org.example.BackEnd.Helpers.Questions;

// public class insert {
//     // insert into DATA (ID, Question, AnswerC, Answer, Explanation, Embedding)
//     // st.executeQuery("insert into DATA (ID, Question, AnswerC, Answer,
//     // Explanation, Embedding) (\r\n" + //
//     // " Values ("+preguntas.ID")\r\n" + //
//     // ");");
//     String urlDB = "jdbc:postgresql://hacknet.cncguc2ysbs8.us-east-1.rds.amazonaws.com:5432/HACKNETDB";

// public void insert(Questions question, Embedding embedding){
//   // Coneccion con la base de Datos
//         Properties props = new Properties();
//         props.setProperty("user", "hacknet_colsanjose");
//         props.setProperty("password", "235711");
//         //FALTA USER Y PASSWORD
//         //
//         Connection conn;
//         try {
//             conn = DriverManager.getConnection(urlDB, props);
//             Statement st = conn.createStatement();
//             st.executeQuery("insert into DATA (ID, Question, AnswerC, Answer, Explanation, Embedding) (\r\n" + //
//         "    Values ("+question.ID+""+question.Question+""+question.AnswerC+""+question.Answer+""+question.Explanation+""+Embedding+")\r\n" + //
//         ");");
//                     System.out.println("Se creo la tabla exitosamente");
//         } catch (SQLException e) {
//             System.out.println("No se puedo crear la tabla");
//             e.printStackTrace();
//         }
//         // https://jdbc.postgresql.org/documentation/use/

// }
// }
