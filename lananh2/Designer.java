package lananh2;

import java.time.LocalDate;

public class Designer extends NhanVien{
	private double Bonus;

	public double getBonus() {
		return Bonus;
	}

	public void setBonus(double bonus) {
		Bonus = bonus;
	}

	public Designer(String maNV, String tenNV, LocalDate ngaySinh, String diaChi, double heSoLuong,
			LocalDate ngayBatDauLam, double luongCoBan, double bonus) {
		super(maNV, tenNV, ngaySinh, diaChi, heSoLuong, ngayBatDauLam, luongCoBan);
		Bonus = bonus;
	}

	public Designer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Designer(String maNV, String tenNV, LocalDate ngaySinh, String diaChi, double heSoLuong,
			LocalDate ngayBatDauLam, double luongCoBan) {
		super(maNV, tenNV, ngaySinh, diaChi, heSoLuong, ngayBatDauLam, luongCoBan);
		// TODO Auto-generated constructor stub
	} 
	
	public double tinhTien() {
		return getHeSoLuong()* getLuongCoBan() * Bonus;
	}

	@Override
	public String toString() {
		return "Designer [Bonus=" + Bonus + ", tinhTien()=" + tinhTien() + ", getMaNV()=" + getMaNV() + ", getTenNV()="
				+ getTenNV() + ", getNgaySinh()=" + getNgaySinh() + ", getDiaChi()=" + getDiaChi() + ", getHeSoLuong()="
				+ getHeSoLuong() + ", getNgayBatDauLam()=" + getNgayBatDauLam() + ", getLuongCoBan()=" + getLuongCoBan()
				+ "]";
	}
	
	
}
