package com.tarea.videosprogra.video27;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

/**
 *
 * @author toupa
 */
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

    public boolean leerStatement(Persona per) throws SQLException {
        boolean respuesta = false;
        try (Statement st = con.createStatement()) {
            String sql = "select * from test where nombre = '" + per.getNombre() + "' and pass = '" + per.getPass() + "'";
            System.out.println("Query: " + sql);
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                System.out.println("existen datos");
                respuesta = false;
            } else {
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

    public void modificarBatchStatement(Persona per) throws SQLException {
        long ini = System.currentTimeMillis();
        try {
            con.setAutoCommit(false);

            for (int i = 0; i < 10000; i++) {
                Statement st = con.createStatement();
                String sql = "UPDATE test SET nombre = '" + per.getNombre() + "', pass = '" + per.getPass() + "'";
                int numeroFilas = st.executeUpdate(sql);
            }
            con.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            con.rollback();
        }
        long fin = System.currentTimeMillis();

        System.out.println("Statement : " + (fin - ini));
    }

    public void modificarBatchPreparedStatement(Persona per) throws SQLException {
        long ini = System.currentTimeMillis();
        try {
            con.setAutoCommit(false);
            PreparedStatement ps = null;

            for (int i = 0; i < 10000; i++) {
                String sql = "UPDATE test SET nombre = ?,pass = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, per.getNombre());
                ps.setString(2, per.getPass());
                ps.addBatch();
            }
            ps.executeBatch();
            con.commit();
        } catch (Exception e) {
            con.rollback();
            System.out.println(e.getMessage());
        }
        long fin = System.currentTimeMillis();

        System.out.println("PreparedStatement : " + (fin - ini));
    }

    public void registrarCallableStatement(Persona per) {
        try {
            String sql = "{call insertTest(?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, per.getNombre());
            cs.setString(2, per.getPass());
            cs.execute();
            cs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void listarCallableStatement() {
        try {
            String sql = "{call listar()}";
            CallableStatement cs = con.prepareCall(sql);
            cs.execute();

            ResultSet rs = cs.getResultSet();

            while (rs.next()) {
                System.out.print(rs.getInt("id") + " ");
                System.out.print(rs.getString("nombre") + " ");
                System.out.println(rs.getString("pass"));
            }
            cs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void listarOutCallableStatement(Persona per) {
        try {
            String sql = "{call salidaID(?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, per.getNombre());
            cs.registerOutParameter("idParam", Types.INTEGER);
            cs.execute();

            int idSalida = cs.getInt("idParam");
            System.out.println("El codigo obtenido de salida es: " + idSalida);
            cs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws SQLException {
        AppStatement app = new AppStatement();
        app.conectar();
//        app.registrarCallableStatement(new Persona("juan", "20"));
//        app.listarCallableStatement();
        app.listarOutCallableStatement(new Persona("juan","20"));
        app.desconectar();

    }
}
