/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Proveedor;

/**
 *
 * @author Francisca Gómez
 */
@WebServlet(name = "proveedor", urlPatterns = {"/proveedor"})
public class proveedor extends HttpServlet {

    
    Proveedor prov = new Proveedor();
    Proveedor prvbd = new Proveedor();
    int r;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
//        if (accion.equals("Guardar")) {            
//            String nom = request.getParameter("nombretxt");
//            String ape = request.getParameter("apellidotxt");
//            String ci = request.getParameter("citxt");
//            String cargo = request.getParameter("cargotxt");
//            String email = request.getParameter("emailtxt");
//            String tel = request.getParameter("teltxt");
//            String dir = request.getParameter("dirtxt");
//            String estado = request.getParameter("customRadio");
//            String usu = request.getParameter("usuario");
//            int barrio = Integer.valueOf(request.getParameter("drop_bar"));
//            int length = nom.length();
//            int length2 = ape.length();
//            int length3 = ci.length();
//            int length4 = cargo.length();
//            int length5 = email.length();
//            int length6 = tel.length();
//            int length7 = dir.length();
//            if (length == 0||length2 == 0||length3 == 0||length4 == 0||length5 == 0||length6 == 0||length7 == 0) {
//                request.getRequestDispatcher("mensaje.jsp").forward(request, response);
//            } else {
//                prov.setNom_fun(nom);
//                prov.setApe_fun(ape);
//                prov.setCi_fun(ci);
//                prov.setCargo_fun(cargo);
//                prov.setEmail_fun(email);
//                prov.setTel_fun(tel);
//                prov.setDir_fun(dir);
//                prov.setEstado_fun(estado);
//                prov.setNom_usu_mod(usu);
//                prov.setId_barrio(barrio);
//                r = prvbd.registrarProveedor(prov);
//                if (r == 0) {
//                    request.getRequestDispatcher("registradoReferenciales.jsp").forward(request, response);
//                } else {
//                    request.getRequestDispatcher("errorGeneral.jsp").forward(request, response);
//                }
//            }
//        }
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
