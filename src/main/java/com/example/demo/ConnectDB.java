package com.example.demo;

import java.sql.*;
import sun.misc.*;

public class ConnectDB
{
    public static Connection  Connect() throws SQLException
    {
        String connectionUrl = "jdbc:sqlserver://211.178.86.26:1433;databaseName=RDMS";

        Connection con = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver okay");
            con = DriverManager.getConnection(connectionUrl, "sa", "sein7955!@");
            System.out.println("Connection Made");
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

        return con;
    }
}
