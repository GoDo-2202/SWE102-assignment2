/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import context.ProductDao;
import entity.Category;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dinhg
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

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
        //get data from dao
        ProductDao dao = new ProductDao();
        List<Category> listC = dao.getCategory();
        List<Product> listP = dao.getAllProduct();
        try {
            int count = dao.getCount();
            int papeSize = 4;
            int endPape = 0;
            endPape = count / papeSize;
            if (count % papeSize != 0) {
                endPape++;
            }
            request.setAttribute("end", endPape);          
        } catch (Exception e) {
        }
//        try {
//            ProductDao dao = new ProductDao();
//            List<Category> listC = dao.getCategory();
//            String indexString = request.getParameter("index");
//            int index = Integer.parseInt(indexString);
//            int count = dao.getCount();
//            int papeSize = 4;
//            int endPape = 0;
//            endPape = count / papeSize;
//            if (count % papeSize != 0) {
//                endPape++;
//            }
//            List<Product> list = dao.getProduct(index, papeSize);
//            //set data to jsp
//            request.setAttribute("listC", listC);
//            request.setAttribute("listP", list);
//            request.setAttribute("end", endPape);            
//            request.getRequestDispatcher("Home.jsp").forward(request, response);
//        } catch (Exception e) {
//        }
        request.setAttribute("listC", listC);
        request.setAttribute("listP", listP);
        request.getRequestDispatcher("Home.jsp").forward(request, response);
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
