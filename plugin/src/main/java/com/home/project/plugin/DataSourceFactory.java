package com.home.project.plugin;


import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DataSourceFactory {

    private Connection connection;
    private DataBasePropertySetter sourceSetter;

    private Logger logger = Logger.getLogger(DataSourceFactory.class.getName());

    public DataSource dataSource(){
        sourceSetter = new DataBasePropertySetter();
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL(sourceSetter.getUrl());
        dataSource.setUser(sourceSetter.getUser());
        dataSource.setPassword(sourceSetter.getPassword());

        try(Connection connection = dataSource.getConnection()) {
//            connection = dataSource.getConnection();
            logger.info("Success connection");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    public static void main(String[] args) {
        DataSourceFactory dataSourceFactory = new DataSourceFactory();
        dataSourceFactory.dataSource();
    }
}
