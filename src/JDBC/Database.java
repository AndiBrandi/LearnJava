package JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Database {

    private static String driver;
    private static String user;
    private static String password;
    private static String host;
    private static String port;
    private static String database;
    private static String type;

    private static Connection connection;

    static {

        try (FileInputStream file = new FileInputStream("src/JDBC/config.properties")) {
            Properties config = new Properties();
            config.load(file);

            driver = config.getProperty("driver");
            user = config.getProperty("user");
            password = config.getProperty("password");
            host = config.getProperty("host");
            port = config.getProperty("port");
            database = config.getProperty("database");
            type = config.getProperty("type");

            Class.forName(driver);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    /**
     * Builds a Database Connection, or if a Connection already exists use the existing connection (Singleton)
     *
     * @return the Database Connection
     */
    public static Connection getInstance() {

        if (connection == null) {
            try {

                connection = DriverManager.getConnection("jdbc:" + type + "://" + host + ":" + port + "/" + database, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return connection;
    }

}
