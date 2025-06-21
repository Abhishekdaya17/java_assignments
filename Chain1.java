public class Chain1 {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nm = request.getParameter("nm");
        ServletContext ctx = getServletContext();
        RequestDispatcher rd = ctx.getRequestDispatcher("/Chain2");
        request.setAttribute("name", nm);
        request.setAttribute("sal", 90999);
        request.setAttribute("id ", 10001);
        rd.forward(request, response);
    }
}
