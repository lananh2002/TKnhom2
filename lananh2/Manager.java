package lananh2;

import java.time.LocalDate;

public class Manager extends NhanVien {
	
	public Manager() {
		super();
	}
	
	public Manager(String maNV, String tenNV, LocalDate ngaySinh, String diaChi, double heSoLuong,
			LocalDate ngayBatDauLam, double luongCoBan) {
		super(maNV, tenNV, ngaySinh, diaChi, heSoLuong, ngayBatDauLam, luongCoBan);
	}

	public double tinhTien() {
		return getHeSoLuong() * getLuongCoBan();
	}

	@Override
	public String toString() {
		return "Manager [tinhTien()=" + tinhTien() + ", getMaNV()=" + getMaNV() + ", getTenNV()=" + getTenNV()
				+ ", getNgaySinh()=" + getNgaySinh() + ", getDiaChi()=" + getDiaChi() + ", getHeSoLuong()="
				+ getHeSoLuong() + ", getNgayBatDauLam()=" + getNgayBatDauLam() + ", getLuongCoBan()=" + getLuongCoBan()
				+ "]";
	}
}
