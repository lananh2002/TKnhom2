package lananh2;

import java.time.LocalDate;

public class NhanVien {
	private String maNV; 
	private String tenNV; 
	private LocalDate ngaySinh; 
	private String diaChi; 
	private double heSoLuong; 
	private LocalDate ngayBatDauLam;
	private double luongCoBan;
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public LocalDate getNgayBatDauLam() {
		return ngayBatDauLam;
	}
	public void setNgayBatDauLam(LocalDate ngayBatDauLam) {
		this.ngayBatDauLam = ngayBatDauLam;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public NhanVien(String maNV, String tenNV, LocalDate ngaySinh, String diaChi, double heSoLuong,
			LocalDate ngayBatDauLam, double luongCoBan) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.heSoLuong = heSoLuong;
		this.ngayBatDauLam = ngayBatDauLam;
		this.luongCoBan = luongCoBan;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double tinhTongTienNV() {
		// TODO Auto-generated method stub
		return 0;
	} 
	
	
	
	

	
	
}
