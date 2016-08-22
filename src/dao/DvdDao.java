package dao;

import java.sql.*;

import entity.Dvd;
import util.SqlConn;

public class DvdDao {
	
	private SqlConn sqlConn = new SqlConn();
	
	public boolean insertDvd(Dvd dvd){
		Connection conn = sqlConn.getConn();
		String sql = "insert into dvd (dvd_name,dvd_price,dvd_type,dvd_rent_price) values (?, ?,?,?)";
		PreparedStatement ps = null;
		int flag = -1;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dvd.getDvdName());
			ps.setDouble(2, dvd.getDvdPrice());
			ps.setInt(3, dvd.getDvdType());
			ps.setDouble(4, dvd.getDvdRentPrice());
			flag = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sqlConn.closeAll(null, ps, conn);
		return flag > 0;
	}

}
