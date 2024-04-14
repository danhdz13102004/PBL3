package model;

public class TheLoai {
	String id;
	String tenTheLoai;
	
	
	public TheLoai() {
		super();
	}

	public TheLoai(String id, String tenTheLoai) {
		super();
		this.id = id;
		this.tenTheLoai = tenTheLoai;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenTheLoai() {
		return tenTheLoai;
	}

	public void setTenTheLoai(String tenTheLoai) {
		this.tenTheLoai = tenTheLoai;
	}
	
	
}
