package lananh2;

import java.util.ArrayList;
import java.util.Iterator;

public class danhsach {
	ArrayList<NhanVien> ds;
	
	public danhsach() {
		ds = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	public boolean them(NhanVien data) {
		for(NhanVien nv:ds) 
			if (nv.getMaNV().equals(data.getMaNV())) {
				System.out.println("trùng");
				return false;
			} 
			ds.add(data);
			System.out.println("Them thanh cong!");	
			return true;
		}
		
	public void xuat() {
		for(NhanVien nv:ds) {
			System.out.println(nv);
		}

		
		
		
		
	}
}

