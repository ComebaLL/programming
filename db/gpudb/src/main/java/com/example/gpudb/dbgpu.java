package com.example.gpudb;
/**  GPU class db */
/**  @author Kuvykin Nikita */
import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class dbgpu {

    Connection connection;

    ResultSet resSet = null;

    public Connection getDBConnection() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {

        String connectionString = "jdbc:mysql://localghost/3306/gpudbsql";
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        connection = DriverManager.getConnection(connectionString, "postgers", "123");
        return connection;
    }

    public ResultSet getGPUU() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        String getGPU = "SELECT * FROM GPU";

        PreparedStatement prSt = getDBConnection().prepareStatement(getGPU);

        resSet = prSt.executeQuery();

        return resSet;
    }

    /** add in db */
    public void insertGPU(GPU gpu) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String insertGPU = "INSERT INTO GPU (price, gpu_name,producer,memory_size,memory_type,connection_type VALUES( ?,?,?,?,?,?)";
        PreparedStatement prSt = null;
        prSt = getDBConnection().prepareStatement(insertGPU);
        prSt.setString(1, gpu.get_producer());
        prSt.setString(2, gpu.get_GPU());
        prSt.setInt(3, gpu.get_memorySize());
        prSt.setString(4, gpu.get_memoryType());
        prSt.setString(5, gpu.get_connectionType());
        prSt.setInt(6, gpu.get_price());
        prSt.executeUpdate();
    }
}
