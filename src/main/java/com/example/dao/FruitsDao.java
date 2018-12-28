package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.dto.FruitsDto;

public class FruitsDao {

    private static final String DB_URL = "jdbc:mysql://localhost/maven_sample?useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "admin";
    
    public FruitsDto selectById(int id) {
        String sql = "select * from fruits where id = ?";
        try (
                Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            FruitsDto dto = null;
            while (rs.next()) {
                dto = new FruitsDto();
                dto.setId(rs.getInt("Id"));
                dto.setName(rs.getString("name"));
                dto.setPrice(rs.getInt("price"));
            }
            return dto;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
