import java.io.PrintWriter;

public class Chan2 {
    protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        String nm = (String)request.getAttribute("name");
        Integer sal = (Integer)request.getAttribute("sal");
        Integer id = (Integer)request.getAttribute("id");
        PrintWriter pw = response.getWriter();
        pw.println("Data from Chain1");
        pw.println("Name: " + nm);
        pw.println("Salary: " + sal);
        pw.println("ID: " + id);
    }
}