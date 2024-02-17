/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package GSKK.controller;

import GSKK.model.Member;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kihoon
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String programName = request.getParameter("programName");
        int levelOfYear = Integer.parseInt(request.getParameter("levelOfYear"));
        
        
        Member member = new Member();
        member.setFullName(fullName);
        member.setEmail(email);
        member.setPhone(phone);
        member.setProgramName(programName);
        member.setLevelOfYear(levelOfYear);
       
        System.out.println(fullName);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(programName);
        System.out.println(levelOfYear);
        
        request.setAttribute("member", member);
        request.getRequestDispatcher("/GSKKDisplayMember.jsp").forward(request, response);
    }

}
