package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.GioHang;
import model.Sach;

public class GioHangDAO {

	public static Map<Sach, Integer> getCartById(String id) {
		Map<Sach, Integer> list = new HashMap<Sach, Integer>();
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "select sach.*,giohang.so_luong_trong_gio_hang\r\n"
					+ "from giohang\r\n"
					+ "inner join sach on giohang.id_sach = sach.id\r\n"
					+ "where id_user = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			Sach sach;
			while(rs.next()) {
				sach = new Sach();
				sach.setId(rs.getString("id"));
				sach.setTen(rs.getString("ten"));
				sach.setSoLuongNhap(rs.getInt("soluongnhap"));
				sach.setSoLuongBan(rs.getInt("soluongban"));
				sach.setIdNxb(rs.getString("idnxb"));
				sach.setMoTaSach(rs.getString("motasach"));
				sach.setSoTrang(rs.getInt("sotrang"));
				sach.setLanXuatBan(rs.getInt("lanxuatban"));
				sach.setIdTacGia(rs.getString("idtacgia"));
				sach.setIdTheLoai(rs.getString("idtheloai"));
				sach.setSoSaoTB(rs.getDouble("sosaotb"));
				sach.setNgayThem(rs.getTimestamp("ngaythem"));
				sach.setUrlImage(rs.getString("urlimage"));
				sach.setGiaBan(rs.getDouble("giaban"));
				sach.setGiaNhap(rs.getDouble("gianhap"));
				sach.setPhanTramGiamGia(rs.getDouble("phantramgiamgia"));
				list.put(sach, rs.getInt("so_luong_trong_gio_hang"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	public static void main(String[] args) {
		Map<Sach, Integer> list =  getCartById("1711769386420");
		for(Sach s : list.keySet()) {
			Integer val = list.get(s);
			System.out.println(s.toString()+ " " + val);
		}
	}

}
