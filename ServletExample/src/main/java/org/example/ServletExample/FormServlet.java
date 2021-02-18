package org.example.ServletExample;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "FormServlet", urlPatterns = "/calculateServlet")

public class FormServlet extends HttpServlet {
}
