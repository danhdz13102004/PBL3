package mapper;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.TheLoai;

public class TheLoaiMapper implements InterfaceMapper<TheLoai> {
	private static TheLoaiMapper theLoaiMapper = null;
	public static TheLoaiMapper getTheLoaiMapper() {
		if(theLoaiMapper == null) theLoaiMapper = new TheLoaiMapper();
		return theLoaiMapper;
	}
	@Override
	public ArrayList<TheLoai> mapListItem(ResultSet rs) {
		ArrayList<TheLoai> arr = new ArrayList<TheLoai>();
		try {
			while(rs.next()) {
				TheLoai theLoai = new TheLoai();
				theLoai.setId(rs.getString("id"));
				theLoai.setTenTheLoai(rs.getString("tentheloai"));
				arr.add(theLoai);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return arr;
	}

}
