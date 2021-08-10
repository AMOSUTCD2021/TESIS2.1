/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Barrio;

/**
 *
 * @author Francisca Gómez
 */
@WebServlet(name = "barrio", urlPatterns = {"/barrio"})
public class barrio extends HttpServlet {

    Barrio b = new Barrio();
    Barrio bbd = new Barrio();
    int r;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        if (accion.equals("Guardar")) {
            String descrip = request.getParameter("descriptxt");
            int ciudad = Integer.valueOf(request.getParameter("drop_ciu"));
            int length = descrip.length();
            if (length == 0) {
                request.getRequestDispatcher("mensaje.jsp").forward(request, response);
            } else {
                b.setDescripcion_barrio(descrip);
                b.setId_ciudad(ciudad);
                r = bbd.registrarBarrio(b);
                if (r == 0) {
                    request.getRequestDispatcher("registradoReferenciales.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("errorGeneral.jsp").forward(request, response);
                }
            }
        }
        
        if (accion.equals("Buscar")) {
            String buscar = request.getParameter("buscartxt");
            int length = buscar.length();

            b = b.buscarBarrio(buscar);
            request.setAttribute("Barrio", b);
            request.getRequestDispatcher("barrio.jsp").forward(request, response);
                                  

        }
        if (accion.equals("Barrio")) {
            String buscar = request.getParameter("buscartxt");
            int length = buscar.length();

            b = b.buscarBarrio(buscar);
            request.setAttribute("Barrio", b);
            request.getRequestDispatcher("barrio.jsp").forward(request, response);
                                  

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
