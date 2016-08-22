package dao;

import entity.User;
import util.SqlConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Spock on 8/21/2016.
 */
public class UserDao {

    private SqlConn sqlConn = new SqlConn();

    public User Login(User user){
        Connection conn = sqlConn.getConn();
        String sql = "select user_id,user_name, user_password,user_phone,user_account,user_score  from user where user_name = ? and user_password=?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        User userQuery = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getUserPassword());
            rs = ps.executeQuery();
            while (rs.next()){
                userQuery = new User();
                userQuery.setUserId(rs.getInt("user_id"));
                userQuery.setUserName(rs.getString("user_name"));
                userQuery.setUserPassword(rs.getString("user_password"));
                userQuery.setUserPhone(rs.getString("user_account"));
                userQuery.setUserAccount(rs.getDouble("user_account"));
                userQuery.setUseScore(rs.getInt("user_score"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        sqlConn.closeAll(rs, ps, conn);

        return userQuery;
    }
}
