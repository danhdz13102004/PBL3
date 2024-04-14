package model;

import java.sql.Date;
import java.sql.Timestamp;

public class Sach {
	String id;
	String ten;
	Integer soLuongNhap;
	Integer soLuongBan;
	String idNxb;
	String moTaSach;
	Integer soTrang;
	Integer lanXuatBan;
	String idTacGia;
	String idTheLoai;
	Double soSaoTB;
	Timestamp ngayThem;
	String urlImage;
	Double giaBan;
	Double giaNhap;
	Double phanTramGiamGia;
	Double tongBinhLuan;
	Double tongSao;
	String tenTacGia;
	String tenNxb;
	String tenTheLoai;
	public Sach() {
		super();
	}
	


	public Sach(String id, String ten, Integer soLuongNhap, Integer soLuongBan, String idNxb, String moTaSach,
			Integer soTrang, Integer lanXuatBan, String idTacGia, String idTheLoai, Double soSaoTB, Timestamp ngayThem,
			String urlImage, Double giaBan, Double giaNhap) {
		super();
		this.id = id;
		this.ten = ten;
		this.soLuongNhap = soLuongNhap;
		this.soLuongBan = soLuongBan;
		this.idNxb = idNxb;
		this.moTaSach = moTaSach;
		this.soTrang = soTrang;
		this.lanXuatBan = lanXuatBan;
		this.idTacGia = idTacGia;
		this.idTheLoai = idTheLoai;
		this.soSaoTB = soSaoTB;
		this.ngayThem = ngayThem;
		this.urlImage = urlImage;
		this.giaBan = giaBan;
		this.giaNhap = giaNhap;
	}


	public Sach(String id, String ten, Integer soLuongNhap, Integer soLuongBan, String moTaSach, Integer soTrang,
			Integer lanXuatBan, Double soSaoTB) {
		super();
		this.id = id;
		this.ten = ten;
		this.soLuongNhap = soLuongNhap;
		this.soLuongBan = soLuongBan;
		this.moTaSach = moTaSach;
		this.soTrang = soTrang;
		this.lanXuatBan = lanXuatBan;
		this.soSaoTB = soSaoTB;
	}
	
	


	public Sach(String id, String ten, Integer soLuongNhap, Integer soLuongBan, String idNxb, String moTaSach,
			Integer soTrang, Integer lanXuatBan, String idTacGia, String idTheLoai, Double soSaoTB, Timestamp ngayThem) {
		super();
		this.id = id;
		this.ten = ten;
		this.soLuongNhap = soLuongNhap;
		this.soLuongBan = soLuongBan;
		this.idNxb = idNxb;
		this.moTaSach = moTaSach;
		this.soTrang = soTrang;
		this.lanXuatBan = lanXuatBan;
		this.idTacGia = idTacGia;
		this.idTheLoai = idTheLoai;
		this.soSaoTB = soSaoTB;
		this.ngayThem = ngayThem;
	}
	
	
	


	public Sach(String id, String ten, Integer soLuongNhap, Integer soLuongBan, String idNxb, String moTaSach,
			Integer soTrang, Integer lanXuatBan, String idTacGia, String idTheLoai, Double soSaoTB, Timestamp ngayThem,
			String urlImage, Double giaBan, Double giaNhap, Double phanTramGiamGia, Double tongBinhLuan,
			Double tongSao) {
		super();
		this.id = id;
		this.ten = ten;
		this.soLuongNhap = soLuongNhap;
		this.soLuongBan = soLuongBan;
		this.idNxb = idNxb;
		this.moTaSach = moTaSach;
		this.soTrang = soTrang;
		this.lanXuatBan = lanXuatBan;
		this.idTacGia = idTacGia;
		this.idTheLoai = idTheLoai;
		this.soSaoTB = soSaoTB;
		this.ngayThem = ngayThem;
		this.urlImage = urlImage;
		this.giaBan = giaBan;
		this.giaNhap = giaNhap;
		this.phanTramGiamGia = phanTramGiamGia;
		this.tongBinhLuan = tongBinhLuan;
		this.tongSao = tongSao;
	}

	

	public String getTenTheLoai() {
		return tenTheLoai;
	}



	public void setTenTheLoai(String tenTheLoai) {
		this.tenTheLoai = tenTheLoai;
	}



	public String getTenTacGia() {
		return tenTacGia;
	}



	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}



	public String getTenNxb() {
		return tenNxb;
	}



	public void setTenNxb(String tenNxb) {
		this.tenNxb = tenNxb;
	}



	public Double getPhanTramGiamGia() {
		return phanTramGiamGia;
	}



	public void setPhanTramGiamGia(Double phanTramGiamGia) {
		this.phanTramGiamGia = phanTramGiamGia;
	}



	public Double getTongBinhLuan() {
		return tongBinhLuan;
	}



	public void setTongBinhLuan(Double tongBinhLuan) {
		this.tongBinhLuan = tongBinhLuan;
	}



	public Double getTongSao() {
		return tongSao;
	}



	public void setTongSao(Double tongSao) {
		this.tongSao = tongSao;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Integer getSoLuongNhap() {
		return soLuongNhap;
	}
	public void setSoLuongNhap(Integer soLuongNhap) {
		this.soLuongNhap = soLuongNhap;
	}
	public Integer getSoLuongBan() {
		return soLuongBan;
	}
	public void setSoLuongBan(Integer soLuongBan) {
		this.soLuongBan = soLuongBan;
	}
	public String getIdNxb() {
		return idNxb;
	}
	public void setIdNxb(String idNxb) {
		this.idNxb = idNxb;
	}
	public String getMoTaSach() {
		return moTaSach;
	}
	public void setMoTaSach(String moTaSach) {
		this.moTaSach = moTaSach;
	}
	public Integer getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(Integer soTrang) {
		this.soTrang = soTrang;
	}
	public Integer getLanXuatBan() {
		return lanXuatBan;
	}
	public void setLanXuatBan(Integer lanXuatBan) {
		this.lanXuatBan = lanXuatBan;
	}
	public String getIdTacGia() {
		return idTacGia;
	}
	public void setIdTacGia(String idTacGia) {
		this.idTacGia = idTacGia;
	}
	public String getIdTheLoai() {
		return idTheLoai;
	}
	public void setIdTheLoai(String idTheLoai) {
		this.idTheLoai = idTheLoai;
	}
	public Double getSoSaoTB() {
		return soSaoTB;
	}
	public void setSoSaoTB(Double soSaoTB) {
		this.soSaoTB = soSaoTB;
	}

	public Timestamp getNgayThem() {
		return ngayThem;
	}

	public void setNgayThem(Timestamp ngayThem) {
		this.ngayThem = ngayThem;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	
	public Double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(Double giaBan) {
		this.giaBan = giaBan;
	}

	public Double getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(Double giaNhap) {
		this.giaNhap = giaNhap;
	}



	@Override
	public String toString() {
		return "Sach [id=" + id + ", ten=" + ten + ", soLuongNhap=" + soLuongNhap + ", soLuongBan=" + soLuongBan
				+ ", idNxb=" + idNxb + ", moTaSach=" + moTaSach + ", soTrang=" + soTrang + ", lanXuatBan=" + lanXuatBan
				+ ", idTacGia=" + idTacGia + ", idTheLoai=" + idTheLoai + ", soSaoTB=" + soSaoTB + ", ngayThem="
				+ ngayThem + ", urlImage=" + urlImage + ", giaBan=" + giaBan + ", giaNhap=" + giaNhap
				+ ", phanTramGiamGia=" + phanTramGiamGia + ", tongBinhLuan=" + tongBinhLuan + ", tongSao=" + tongSao
				+ ", tenTacGia=" + tenTacGia + ", tenNxb=" + tenNxb + ", tenTheLoai=" + tenTheLoai + "]";
	}
	
	
}

