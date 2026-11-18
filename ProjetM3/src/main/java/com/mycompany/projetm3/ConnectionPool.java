/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    
    
package com.mycompany.projetm3;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {

    private static HikariDataSource ds;

    static {
        HikariConfig config = new HikariConfig();

        config.setJdbcUrl(
            "jdbc:mysql://92.222.25.165:3306/m3_ebonny01"
        );

        config.setUsername(
            System.getenv("M3_DB_USER")
        );
        config.setPassword(
            System.getenv("M3_DB_PASSWORD")
        );

        config.setMaximumPoolSize(3);

        ds = new HikariDataSource(config);
    }

    public static Connection getConnection()
            throws SQLException {
        return ds.getConnection();
    }
}

    

