package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/api/*")
public class RestServlet extends HttpServlet {

    private String readRequestBody(HttpServletRequest req) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = req.getReader()) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        }
        return sb.toString();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("application/json");
        resp.getWriter().write("{\"method\": \"GET\", \"message\": \"Hello from GET!\"}");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("application/json");
        String body = readRequestBody(req);
        // Csak visszaküldjük amit kaptunk + egy kis infó
        String jsonResponse = String.format(
            "{\"method\": \"POST\", \"received\": %s, \"message\": \"Data received via POST\"}", 
            body.isEmpty() ? "\"no data\"" : body);
        resp.getWriter().write(jsonResponse);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("application/json");
        String body = readRequestBody(req);
        String jsonResponse = String.format(
            "{\"method\": \"PUT\", \"received\": %s, \"message\": \"Resource updated\"}",
            body.isEmpty() ? "\"no data\"" : body);
        resp.getWriter().write(jsonResponse);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("application/json");
        resp.getWriter().write("{\"method\": \"DELETE\", \"message\": \"Resource deleted\"}");
    }
}
