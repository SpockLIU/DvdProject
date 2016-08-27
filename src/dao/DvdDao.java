package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entity.Dvd;
import util.SqlConn;

public class DvdDao {

	private SqlConn sqlConn = new SqlConn();

	public boolean insertDvd(Dvd dvd) {
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

	public List<Dvd> queryDvd(Dvd dvd) {
		Connection conn = sqlConn.getConn();
		// String sql =
		// "select dvd_id, dvd_name, dvd_price, dvd_status, dvd_type, dvd_rent_time, dvd_rent_price from dvd where dvd_name like '%?%' and dvd_status like '%?%' and dvd_type like '%?%'";
		StringBuffer sql = new StringBuffer(
				"select dvd_id, dvd_name, dvd_price, dvd_status, dvd_type, dvd_rent_time, dvd_rent_price from dvd where ");
		sql.append(" dvd_name like '%" + dvd.getDvdName() + "%'");
		if (dvd.getDvdStatus() != null) {
			sql.append(" and dvd_status like '%" + dvd.getDvdStatus() + "%'");
		}
		if(dvd.getDvdType() != null){
			sql.append(" and dvd_type like '%" + dvd.getDvdType() + "%'");
		}
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Dvd> dvds = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql.toString());
			/*
			 * ps.setString(1, dvd.getDvdName()); ps.setInt(2,
			 * dvd.getDvdStatus()); ps.setInt(3, dvd.getDvdType());
			 */
			rs = ps.executeQuery();
			while (rs.next()) {
				Dvd dvdNew = new Dvd();
				dvdNew.setDvdId(rs.getInt("dvd_id"));
				dvdNew.setDvdName(rs.getString("dvd_name"));
				dvdNew.setDvdPrice(rs.getDouble("dvd_price"));
				dvdNew.setDvdStatus(rs.getInt("dvd_status"));
				dvdNew.setDvdType(rs.getInt("dvd_type"));
				dvdNew.setDvdRentTime(rs.getInt("dvd_rent_time"));
				dvdNew.setDvdRentPrice(rs.getDouble("dvd_rent_price"));
				// System.out.println(dvdNew.toString());
				dvds.add(dvdNew);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sqlConn.closeAll(rs, ps, conn);
		/*
		 * System.out.println("dvd in dvdDao"); for(Dvd d : dvds){
		 * System.out.println(d.toString()); }
		 */
		return dvds;
	}

	public Dvd queryByID(int dvdID) {
		Connection conn = sqlConn.getConn();
		PreparedStatement ps = null;
		String sql = "select dvd_id, dvd_name, dvd_price, dvd_status, dvd_type, dvd_rent_time, dvd_rent_price from dvd where dvd_id = ?";
		ResultSet rs = null;
		Dvd dvd = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dvdID);
			rs = ps.executeQuery();
			while(rs.next()){
				dvd = new Dvd();
				dvd.setDvdId(rs.getInt("dvd_id"));
				dvd.setDvdName(rs.getString("dvd_name"));
				dvd.setDvdPrice(rs.getDouble("dvd_price"));
				dvd.setDvdStatus(rs.getInt("dvd_status"));
				dvd.setDvdType(rs.getInt("dvd_type"));
				dvd.setDvdRentTime(rs.getInt("dvd_rent_time"));
				dvd.setDvdRentPrice(rs.getDouble("dvd_rent_price"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		sqlConn.closeAll(rs, ps, conn);
		return dvd;
	}

	public void modifyDvd(Dvd dvd) {
		Connection conn = sqlConn.getConn();
		String sql = "update dvd set dvd_name = ?, dvd_price = ?,  dvd_status = ?, dvd_type = ?, dvd_rent_time = ?, dvd_rent_price = ? where dvd_id = ?";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dvd.getDvdName());
			ps.setDouble(2, dvd.getDvdPrice());
			ps.setInt(3, dvd.getDvdStatus());
			ps.setInt(4, dvd.getDvdType());
			ps.setInt(5, dvd.getDvdRentTime());
			ps.setDouble(6, dvd.getDvdRentPrice());
			ps.setInt(7, dvd.getDvdId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sqlConn.closeAll(null, ps, conn);
		
	}

}
