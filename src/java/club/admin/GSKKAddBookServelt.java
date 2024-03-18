/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package club.admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import club.business.Book;
import club.data.BookIO;
import java.util.*;

/**
 *
 * @author gabed
 */
@WebServlet(name = "GSKKAddBookServelt", urlPatterns = {"/GSKKAddBook"})
public class GSKKAddBookServelt extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            ServletContext sc = getServletContext();
            String path = sc.getRealPath("/WEB-INF/books.txt");
            String url = "";
            
            String errorMessage = "";
            
            Book addBook = new Book();
            
            // Get all inputs
            String code = request.getParameter("code");
            String description = request.getParameter("description");
            String quantityString = request.getParameter("quantity");
            int quantity = 0;
            
            // Check if quantity is null
            if(quantityString.equals("") || quantityString == null){
                quantityString = "0";
            }
            
            try{
                // Parses quantity string into int
                quantity = Integer.valueOf(quantityString);
            } catch (Exception ex){
                request.getRequestDispatcher("GSKKError.jsp").forward(request, response);
                throw new java.lang.NumberFormatException("For input string: '"+ quantityString + "'");
            }
            
            // Checks code is not empty
            if(code.equals("") || code == null){
                errorMessage += "Book code is required.<br>";
            }
            // Checks description is longer than 3 characters
            if(description.length() <= 3){
                errorMessage += "Description must have at least 3 characters.<br>";
            }
            // Checks if quantity is positive number
            if(quantity <= 0){
                errorMessage += "Quantity must be a positive number.<br>";
            }
            
            // Sets up Book object
            addBook.setCode(code);
            addBook.setDescription(description);
            addBook.setQuantity(quantity);
            
            if(errorMessage.equals("")){
                // If there are no errors, the book is inserted into books.txt
                BookIO.insert(addBook, path);
                // And URL is set to the display books servlet
                url = "/GSKKDisplayBooks";
            } else {
                // Error message and book object are set as attributes
                request.setAttribute("errormsg", errorMessage);
                request.setAttribute("book", addBook);
                // And url is set to Add Book page
                url = "GSKKAddBook.jsp";
            }
            
            request.getRequestDispatcher(url).forward(request, response);
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
