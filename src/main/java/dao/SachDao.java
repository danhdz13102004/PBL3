package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import mapper.SachMapper;
import model.Sach;

public class SachDao implements InterfaceDAO<Sach> {
	private static SachDao sachDao = null;
	public static SachDao getSachDao() {
		if(sachDao == null) sachDao = new SachDao();
		return sachDao;
	}
	public ArrayList<Sach> selectNewestItem() {
		ArrayList<Sach> arr = new ArrayList<Sach>();
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM sach ORDER BY ngaythem DESC LIMIT 12";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			SachMapper sachMapper = SachMapper.getSachMapper();
			return sachMapper.mapListItem(rs);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public ArrayList<Sach> selectWithText(Long page,Long size,String txt) {
		ArrayList<Sach> arr = new ArrayList<Sach>();
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "select * from sach\r\n"
					+ "where ten like '" + txt+ "'\r\n"
					+ "order by id\r\n"
					+ "limit ? offset ?";
			System.out.println(sql);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setLong(1,size);
			ps.setLong(2, (page - 1) * size);
			ResultSet rs = ps.executeQuery();
			SachMapper sachMapper = SachMapper.getSachMapper();
			return sachMapper.mapListItem(rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public ArrayList<Sach> selectWithKindOfBook(Long page,Long size,String theloai) {
		ArrayList<Sach> arr = new ArrayList<Sach>();
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "select sach.* from theloai\r\n"
					+ "inner join sach on theloai.id = sach.idtheloai\r\n"
					+ "where theloai.id = '" + theloai + "'\r\n"
					+ "order by sach.id asc\r\n"
					+ "limit ? offset ?";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println(sql);
			ps.setLong(1,size);
			ps.setLong(2, (page - 1) * size);
			ResultSet rs = ps.executeQuery();
			SachMapper sachMapper = SachMapper.getSachMapper();
			return sachMapper.mapListItem(rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public ArrayList<Sach> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sach selectById(Sach t) {
		ArrayList<Sach> arr = new ArrayList<Sach>();
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT sach.*, tacgia.tentacgia, nhaxuatban.tennxb, theloai.tentheloai\r\n"
					+ "FROM sach \r\n"
					+ "INNER JOIN tacgia ON sach.idtacgia = tacgia.id \r\n"
					+ "INNER JOIN nhaxuatban ON sach.idnxb = nhaxuatban.id \r\n"
					+ "INNER JOIN theloai ON sach.idtheloai = theloai.id\r\n"
					+ "WHERE sach.id = '" + t.getId() + "'";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Sach sach = new Sach();
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
				sach.setTenTacGia(rs.getString("tentacgia"));
				sach.setTenNxb(rs.getString("tennxb"));
				sach.setTenTheLoai(rs.getString("tentheloai"));
				arr.add(sach);
			}
			if(arr.size() > 0) return arr.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert(Sach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertAll(ArrayList<Sach> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Sach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<Sach> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Sach t) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
