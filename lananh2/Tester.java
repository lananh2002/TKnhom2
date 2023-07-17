package lananh2;

import java.time.LocalDate;

public class Tester extends NhanVien{
	private double Error;

	public double getError() {
		return Error;
	}

	public void setError(double error) {
		Error = error;
	}

	public Tester(String maNV, String tenNV, LocalDate ngaySinh, String diaChi, double heSoLuong,
			LocalDate ngayBatDauLam, double luongCoBan, double error) {
		super(maNV, tenNV, ngaySinh, diaChi, heSoLuong, ngayBatDauLam, luongCoBan);
		Error = error;
	}

	public Tester() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tester(String maNV, String tenNV, LocalDate ngaySinh, String diaChi, double heSoLuong,
			LocalDate ngayBatDauLam, double luongCoBan) {
		super(maNV, tenNV, ngaySinh, diaChi, heSoLuong, ngayBatDauLam, luongCoBan);
		// TODO Auto-generated constructor stub
	} 
	
	public double tinhTien() {
		return getHeSoLuong() * getLuongCoBan() * Error * 2000000;
	}

	@Override
	public String toString() {
		return "Tester [Error=" + Error + ", tinhTien()=" + tinhTien() + ", getMaNV()=" + getMaNV() + ", getTenNV()="
				+ getTenNV() + ", getNgaySinh()=" + getNgaySinh() + ", getDiaChi()=" + getDiaChi() + ", getHeSoLuong()="
				+ getHeSoLuong() + ", getNgayBatDauLam()=" + getNgayBatDauLam() + ", getLuongCoBan()=" + getLuongCoBan()
				+ "]";
	}
	
	
	
}
