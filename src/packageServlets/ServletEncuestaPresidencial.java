/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageServlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import packageBeans.EncuestaBeans;
import packageServicios.Servicios;

/**
 *
 * @author Neuschwanstein
 */
@WebServlet(name = "ServletEncuestaPresidencial", urlPatterns = {"/ServletEncuestaPresidencial"})
public class ServletEncuestaPresidencial extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletEncuestaPresidencial</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletEncuestaPresidencial at " + request.getContextPath() + "</h1>");
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
        PrintWriter out = response.getWriter();
        
        int idCandidato = Integer.parseInt(request.getParameter("opcion"));
        EncuestaBeans bean = new EncuestaBeans();
        bean.setIdCandidato(idCandidato);
        
        try{
        Servicios servicio = new Servicios();
        servicio.registrarVotos(bean);
           
        
        
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Clasico Hola mundo!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Se registro la votacion");
        out.println("<a href= \"index.jsp\" >Regresar</a>");
        out.println("</body>");
        out.println("</html>");
        
        
        //out.println("voto ="+idCandidato+"<br>");
        }catch(Exception e){
        out.println("Error al registrar "+ e.toString());
        }
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
