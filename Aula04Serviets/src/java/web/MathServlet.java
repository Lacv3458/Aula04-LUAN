/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "MathServlet", urlPatterns = {"/math.html"})
public class MathServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MathServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4><a href='index.html'>Voltar</a></h4>");
            out.println("<h1>Servlet MathServlet at " + request.getContextPath() + "</h1>");
            double n1 = 0, n2 = 0;
            String o = "+";
            try{
            n1 = Double.parseDouble(request.getParameter("n1"));
            n2 = Double.parseDouble(request.getParameter("n2"));
            o = request.getParameter("operacao");
            }catch(Exception ex){
                out.println("<div style='color:red'> "
                        + "Parametro Invalido"
                        + "</div>");
            }
            out.println("<form>\n" +
"            Quantidade:\n" +
"            <input type=\"number\" name=\"n1\" value=\"0\"/>\n" +
"\n" +
"<input type=\"radio\" name=\"operacao\" id=\"adicao\" value=\"+\" checked><label for=\"adicao\">Adi????o</label>\n" +
"<input type=\"radio\" name=\"operacao\" id=\"subtracao\" value=\"-\"> <label for=\"subtracao\">Subtra????o</label>\n" +
"<input type=\"radio\" name=\"operacao\" id=\"multiplicacao\" value=\"*\"> <label for=\"multiplicacao\">Multiplica????o</label>  \n" +
"<input type=\"radio\" name=\"operacao\" id=\"divisao\" value=\"/\"> <label for=\"divisao\">Divis??o</label> \n" +
"    \n" +
"            <input type=\"number\" name=\"n2\" value=\"0\"/>\n" +
"            <input type=\"submit\" name=\"calcular\" value=\"=\"/>\n" +
"        </form><br>");
            if (o.contains("+")) {

                   out.println(n1+" + "+n2+" = "+(n1+n2));
               }
            if (o.contains("*")) {

                   out.println(n1+" X "+n2+" = "+(n1*n2));
               } 
            if (o.contains("/")) {  

                   out.println(n1+" / "+n2+" = "+(n1/n2));
               } 
            if (o.contains("-")) {  

                   out.println(n1+" - "+n2+" = "+(n1-n2));
               } 
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
