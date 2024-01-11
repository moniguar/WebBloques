import DAO.DaoBloquecito;
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
import DTO.Bloquecito;
import DTO.Bloquecito;
import DAO.IMP.DaoBloquecitoImp;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ListadoServlet")
public class ListadoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String message="";
        try {
            
            HttpSession session = request.getSession();
             
            List<Bloquecito> list = null;
                StringBuilder sql = new StringBuilder();
                sql.append("SELECT ")
                        .append("id,")
                        .append("palabra,")
                        .append("resultado,")
                            .append("fecha")
                        .append(" FROM bloquecito");
                try  {

                    conexion.DBConnection conectar = new conexion.DBConnection();

                    Connection con = conectar.getConnection();

                    PreparedStatement ps = con.prepareStatement(sql.toString());
                    ResultSet rs = ps.executeQuery();
                    list = new ArrayList<>();
                    while (rs.next()) {
                        Bloquecito bloquecito = new Bloquecito();
                        bloquecito.setId(rs.getInt(1));
                        bloquecito.setPalabra(rs.getString(2));
                        bloquecito.setResultado(rs.getString(3));
                        bloquecito.setFecha(rs.getString(4));
                        list.add(bloquecito);
                    }
                } catch (SQLException e) {
                    message = e.getMessage();
                }

            session.setAttribute("list", list);
            System.out.println("list "+list);
            response.sendRedirect("listado.jsp");
                        
            
        } catch (Exception e) {
            throw new ServletException("Error en la consulta de usuario", e);
        }
    }
}
