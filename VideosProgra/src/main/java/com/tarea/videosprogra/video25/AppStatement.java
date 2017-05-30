package com.tarea.videosprogra.video25;

/**
 *
 * @author toupa
 */
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class AppStatement {

	private Connection con = null;

	public void conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtestvideo", "root", "------");
			System.out.println("Conexión exitosa");
		} catch (Exception e) {
                    System.out.println(e);
			System.out.println("Error de conexión");
		}
	}
        public boolean leerStatement(Persona per) throws SQLException{
            boolean respuesta = false;
            try(Statement st = con.createStatement()){
                String sql = "select * from test where nombre = '"+ per.getNombre()+"' and pass = '"+per.getPass()+"'";
                System.out.println("Query: "+sql);
                ResultSet rs = st.executeQuery(sql);
                
                if(rs.next()){
                    System.out.println("existen datos");
                    respuesta= false;
                }else{
                    System.out.println("no existen datos");
                }
                System.out.println("consulta existosa");
            }
            
            return respuesta;
        }

	public void desconectar() throws SQLException {
		if (con != null) {
			con.close();
		}
	}
	
	

	public static void main(String[] args) throws SQLException {
		AppStatement app = new AppStatement();
		app.conectar();

		app.leerStatement(new Persona("patricio", "pato123"));

		app.desconectar();

	}

}
