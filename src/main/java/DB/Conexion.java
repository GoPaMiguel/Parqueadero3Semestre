package DB;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class Conexion {

    //Path
    private static final String user = Credentials.USER.getArg();
    private static final String passWord = Credentials.PASSWORD.getArg();
    private static final String dbName = Credentials.DBNAME.getArg();
    private static final String puerto = "3306";
    private static final String ip = "localhost";
    private static final String url = "jdbc:mysql://" + ip + ":" + puerto + "/" + dbName;

    //PoolConecction
    private static DataSource getDataSource() {
        BasicDataSource db = new BasicDataSource();
        db.setUrl(url);
        db.setUsername(user);
        db.setPassword(passWord);
        db.setInitialSize(2);
        return db;
    }

    //GetConecction
    private static Connection getConexion() throws SQLException {
        return getDataSource().getConnection();
    }

    private static void closeConexion(Connection c) throws SQLException {
        c.close();
    }

}
