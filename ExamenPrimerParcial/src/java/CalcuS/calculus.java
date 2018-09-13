
package CalcuS;

import   java.io.*;
import   javax.servlet.*;
import   javax.servlet.http.*;

public class calculus extends HttpServlet{
    
    public   void   doPost(HttpServletRequest   req,   HttpServletResponse res)
    throws   ServletException,   IOException
    {
    double   num1,result;
    int   operacion;

    ServletOutputStream   out   =   res.getOutputStream();

    num1   =   Double.parseDouble(req.getParameter("num1"));
    operacion = Integer.parseInt(req.getParameter("operacion"));

    result   =   calcular(num1,operacion);

    out.println("<html>");
    out.println("<head><title>.:CalculadoraServlet:.</title></head>");
    out.println("<body>");
    if(operacion==1){
        out.println("<h1><center>lA CONVERSION DE PESOS A DOLARES ES:</center></h1>");
        out.println("<h2>   <b><center>"+  result   +"</center></b></h2>");
    }else
    {
        out.println("<h1><center>lA CONVERSION DE PESOS A YENES ES:</center></h1>");
        out.println("<h2>   <b><center>"+  result   +"</center></b></h2>");
    }
    out.println("</body>");
    out.println("</html>");
    out.close();
    }

    public   double   calcular(double   num1, int   operacion)
    {
    double   result   =   0;

        switch   (operacion)
        {
        case   1:
           
            return   num1   /   20;
            
        case   2:
            return   num1   *   20;
        }

    return   result;
    }
}
