package lananh2;

import java.time.LocalDate;

public class Programmer extends NhanVien{
	private double Overtime;

	public double getOvertime() {
		return Overtime;
	}

	public void setOvertime(double overtime) {
		Overtime = overtime;
	}

	public Programmer(String maNV, String tenNV, LocalDate ngaySinh, String diaChi, double heSoLuong,
			LocalDate ngayBatDauLam, double luongCoBan, double overtime) {
		super(maNV, tenNV, ngaySinh, diaChi, heSoLuong, ngayBatDauLam, luongCoBan);
		Overtime = overtime;
	}

	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Programmer(String maNV, String tenNV, LocalDate ngaySinh, String diaChi, double heSoLuong,
			LocalDate ngayBatDauLam, double luongCoBan) {
		super(maNV, tenNV, ngaySinh, diaChi, heSoLuong, ngayBatDauLam, luongCoBan);
		// TODO Auto-generated constructor stub
	}
	
	private double tinhTien() {
		return getHeSoLuong()* getLuongCoBan() * Overtime;
	}

	@Override
	public String toString() {
		return "Programmer [Overtime=" + Overtime + ", tinhTien()=" + tinhTien() + ", getMaNV()=" + getMaNV()
				+ ", getTenNV()=" + getTenNV() + ", getNgaySinh()=" + getNgaySinh() + ", getDiaChi()=" + getDiaChi()
				+ ", getHeSoLuong()=" + getHeSoLuong() + ", getNgayBatDauLam()=" + getNgayBatDauLam()
				+ ", getLuongCoBan()=" + getLuongCoBan() + "]";
	}
	

}

