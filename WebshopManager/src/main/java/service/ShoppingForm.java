//package service;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class Shopping
// */
//@WebServlet(urlPatterns = {"/Form"})
//public class ShoppingForm extends HttpServlet {
//	private static final long serialVersionUID = 1L;
////       
////    /**
////     * @see HttpServlet#HttpServlet()
////     */
////    public ShoppingForm() {
////        super();
////        // TODO Auto-generated constructor stub
////    }
////    
////	/**
////	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
////	 */
////	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////		// TODO Auto-generated method stub
////		response.getWriter().append("Served at: ").append(request.getContextPath());
////	}
////
////	/**
////	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
////	 */
////	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////		response.setContentType("text/html;charset=UTF-8");
////        try (PrintWriter out = response.getWriter()) {
////            
////            /* TODO output your page here. You may use following sample code. */
////            out.println("<!DOCTYPE html>");
////            out.println("<html>");
////            out.println("<head>");
////            out.println("<title>Servlet DiscountProduct</title>");
////            out.println("</head>");
////            out.println("<body>");
////            out.println(
////                    "<form action=\"Shopping\" method=\"post\"> \n"
////                    + "Salami: <input type=\"text\" name=\"Salami\"><br> \n"
////                    + "Rubber duck: <input type=\"text\" name=\"Rubber duck\"><br> \n"
////                    + "Cucumber: <input type=\"text\" name=\"Cucumber\"><br> \n"
////                    + "Chestnut: <input type=\"text\" name=\"Chestnut\"><br> \n"
////                    + "<input type=\"submit\" value=\"Go!\"> \n"
////                    + "</form>");
////            out.println("</body>");
////            out.println("</html>");
////        }
////
////	}
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet DiscountProduct</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println(
//                    "<form action=\"Shopping\" method=\"post\"> \n"
//                    + "Salami: <input type=\"text\" name=\"salami\"><br> \n"
//                    + "Rubber duck: <input type=\"text\" name=\"rubberduck\"><br> \n"
//                    + "Cucumber: <input type=\"text\" name=\"cucumber\"><br> \n"
//                    + "Chestnut: <input type=\"text\" name=\"chestnut\"><br> \n"
//                    + "<input type=\"submit\" value=\"Get them!\"> \n"
//                    + "</form>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//      
//        
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//}

package service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Orsi
 */
@WebServlet(urlPatterns = {"/Form"})
public class ShoppingForm extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DiscountProduct</title>");
            out.println("</head>");
            out.println("<body>");
            out.println(
                     "<form action=\"Shopping\" method=\"post\"> \n"
                    + "Salami: <input type=\"text\" name=\"salami\"><br> \n"
                    + "Rubber duck: <input type=\"text\" name=\"rubberduck\"><br> \n"
                    + "Cucumber: <input type=\"text\" name=\"cucumber\"><br> \n"
                    + "Chestnut: <input type=\"text\" name=\"chestnut\"><br> \n"
                    + "<input type=\"submit\" value=\"Go!\"> \n"
                    + "</form>");
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
