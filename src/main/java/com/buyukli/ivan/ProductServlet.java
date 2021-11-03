package com.buyukli.ivan;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
        resp.getWriter().printf("<h1>Id: 1 | Title: Milk | Cost: 1 Euro<h1>");
        resp.getWriter().printf("<h1>Id: 2 | Title: Bread | Cost: 89 Cent<h1>");
        resp.getWriter().printf("<h1>Id: 3 | Title: Oil | Cost: 1.23 Euro<h1>");
        resp.getWriter().printf("<h1>Id: 4 | Title: Carrot | Cost: 1.89 Euro<h1>");
        resp.getWriter().printf("<h1>Id: 5 | Title: Meat | Cost: 4 Euro<h1>");
        resp.getWriter().printf("<h1>Id: 6 | Title: Watter | Cost: 29 Cent<h1>");
        resp.getWriter().printf("<h1>Id: 7 | Title: Tomato | Cost: 1.12 Euro<h1>");
        resp.getWriter().printf("<h1>Id: 8 | Title: Cucumber | Cost: 1.05 Euro<h1>");
        resp.getWriter().printf("<h1>Id: 9 | Title: Cigarettes | Cost: 6.32 Euro<h1>");
        resp.getWriter().printf("<h1>Id: 10 | Title: Wine | Cost: 5.45 Euro<h1><h1>");
        resp.getWriter().printf("<body><html>");
        resp.getWriter().close();
    }
}
