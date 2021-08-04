/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GestorBD;
import model.Prestamo;

/**
 *
 * @author Alvaro
 */
@WebServlet(name = "muestraPrestamo", urlPatterns = {"/muestraPrestamo"})
public class muestraPrestamo extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        String cod = request.getParameter("codigo");
        try {
            ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
            Prestamo prestamo;
            GestorBD gestorBD = new GestorBD();
            prestamos = gestorBD.leerTodos(cod);
            if (prestamos != null) {
                request.setAttribute("Prestamo", prestamos);
                request.getRequestDispatcher("/listaPrestamos.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/noHayRegistros.jsp").forward(request, response);
            }
        } finally {
            out.close();
        }
    }
    /*
    PrintWriter out = response.getWriter();
            try {
                ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();                        
                GestorBD gestorBD = new GestorBD();
                prestamos = gestorBD.leerTodosP();
                if (prestamos != null){
                    request.setAttribute("Prestamo", prestamos);
                    request.getRequestDispatcher("/resultadoPrestamo.jsp").forward(request, response);                            
                }else
                  request.getRequestDispatcher("/error.jsp").forward(request, response);                             
                }   
         finally{
                out.close();
            }
    */

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
