package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import mapper.TacGiaMapper;
import mapper.TheLoaiMapper;
import model.TacGia;
import model.TheLoai;

public class TheLoaiDAO implements InterfaceDAO<TheLoai>{

	@Override
	public ArrayList<TheLoai> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TheLoai selectById(TheLoai t) {
		ArrayList<TheLoai> arr = new ArrayList<TheLoai>();
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "select * from tacgia\r\n"
					+ "where id = '" + t.getId() + "'";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println(sql);
			ResultSet rs = ps.executeQuery();
			TheLoaiMapper theLoaiMapper= TheLoaiMapper.getTheLoaiMapper();
			arr = theLoaiMapper.mapListItem(rs);
			if(arr.size() > 0) return arr.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert(TheLoai t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertAll(ArrayList<TheLoai> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(TheLoai t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<TheLoai> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(TheLoai t) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
