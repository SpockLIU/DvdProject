package dao;

import entity.Manager;
import util.SqlConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Spock on 8/21/2016.
 */
public class ManagerDao {


    private SqlConn sqlConn = new SqlConn();

    public Manager loginManager(Manager man){
        Connection conn = sqlConn.getConn();
        String sql = "select manager_id,manager_name,manager_password from manager where manager_name= ? and manager_password=?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Manager manQuery = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,man.getManagerName());
            ps.setString(2, man.getManagerPassword());
            rs = ps.executeQuery();
            while (rs.next()){
                manQuery = new Manager();
                manQuery.setManagerId(rs.getInt("manager_id"));
                manQuery.setManagerName(rs.getString("manager_name"));
                manQuery.setManagerPassword(rs.getString("manager_password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        sqlConn.closeAll(rs,ps,conn);
        return manQuery;


    }
}
