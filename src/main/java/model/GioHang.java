package model;

public class GioHang {
	private String userId;
	private Sach sach;
	private Integer soluong;
	public GioHang() {
		super();
	}
	
	
	public GioHang(String userId, Sach sach, Integer soluong) {
		super();
		this.userId = userId;
		this.sach = sach;
		this.soluong = soluong;
	}


	public GioHang(Sach sach, Integer soluong) {
		super();
		this.sach = sach;
		this.soluong = soluong;
	}
	public Sach getSach() {
		return sach;
	}
	public void setSach(Sach sach) {
		this.sach = sach;
	}
	public Integer getSoluong() {
		return soluong;
	}
	public void setSoluong(Integer soluong) {
		this.soluong = soluong;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
