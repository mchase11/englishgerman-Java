/* Madison Chase
   Discussion 4
   English - German
*/

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/englishgerman"})
public class englishgerman extends HttpServlet {
    
    //Array String to fill table
    String[] englishtoGerman = {"Hello", "Hallo", "How are you?", 
                                "Wie geht es Ihnen?", "What is your name?", "Wie hei&szlig;en Sie?",
                                "My name is", "Ich hei&szlig;e","Yes", "Ja", "No", "Nein",
                                "Thank you", "Danke", "Please", "Bitte", "You're Welcome", "Bitte Sch&ouml;n"};
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //Beginning of html code
            out.println("<!DOCTYPE html>");
            //Title of page
            out.println("<html>");
            out.println("<head>");
            //Title of page
            out.println("<title>English - German </title>"); 
            out.println("</head>");
            //Start of body with background color
            out.println("<body>");
            out.println("<center>");
            //Start o table with a table border size of 1 and border color is added
            //and set to be black
            out.println("<table border=2 bordercolor=black>");
            //Background was
            out.println("<tr bgcolor=pink><td><h3><center>English</center></h3></td>");
            out.println("<td><h3><center>German</center></h3></td></tr>");
            //For loop to fill table
            for (int i=0; i<englishtoGerman.length; i++) {
                out.println("<tr bgcolor=silver><td>"+englishtoGerman[i]+"</td>");
                //Used to go to the next string in the array to fill second column
                i++;
                out.println("<td>"+(englishtoGerman[i])+"</td></tr>");
                      
            }
            out.println("</table>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
