// Servlet para manejar la consulta: ConsultaUsuarioServlet.java
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ConsultaServlet")
public class ConsultaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String palabra = request.getParameter("palabra");
        System.out.println("salida "+palabra);
        
        boolean paso;
        String resultado="";    
         
        try {
             HttpSession session = request.getSession();
             
             //Reviso si la palabra esta en la base de datos
            
            conectar conectar = new conectar();
            
            Connection con = conectar.getConexion();
            
            //hay conexión
            if (con !=null){
                
                try {
                    String sql = "SELECT * FROM bloquecito WHERE palabra like ?";
                    PreparedStatement statement = con.prepareStatement(sql);
                    statement.setString(1, palabra);
                    ResultSet resultSet = statement.executeQuery();
                    if (resultSet.next()) {
                        // esta entonces se busca el resultados
                        resultado = resultSet.getString("resultado");
                        
                            
                    } else {
                        // no esta, se almacena
                        paso = BloquesABC.puedo_obtener_palabra(palabra);
                        String sqlin = "INSERT INTO bloquecito (palabra, resultado,fecha) VALUES (?, ?,NOW())";

                        PreparedStatement statement2 = con.prepareStatement(sqlin);

                                // Establecer los valores para los parámetros en la declaración SQL
                        statement2.setString(1, palabra.toUpperCase() );
                        statement2.setString(2, String.valueOf(paso));

                        resultado = String.valueOf(paso);
                        // Ejecutar la consulta insert
                        statement2.executeUpdate();
                            
                    }
                    //cierro la conex
                    con.close();
                
                } catch (Exception e) {
                       System.out.println("Excepcion "+e.getMessage());
                }
                
            }
            
            session.setAttribute("bloques", resultado);
            session.setAttribute("palabra", palabra);
             
            response.sendRedirect("resultado.jsp");
                        
            
        } catch (Exception e) {
            throw new ServletException("Error en la consulta de usuario", e);
        }
    }
}
