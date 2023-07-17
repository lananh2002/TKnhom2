package lananh2;


import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Manager manager = new Manager("AAC", "LanAnh", LocalDate.of(2002,10,10), "129 Nguyen Van Cong", 10, LocalDate.of(2023, 10, 10), 30);
		Designer designer = new Designer("ABC", "Hoang", LocalDate.of(2002,10,10), "48 Le Loi", 10, LocalDate.of(2023,10,10), 10, 20);
		Programmer programmer = new Programmer("DDC", "Huong", LocalDate.of(2002,10,10), "12 Nguyen Van Bao", 50, LocalDate.of(2023,10,10), 04, 076);
		Tester tester = new Tester("ACD", "Kiet", LocalDate.of(2002,10,10),"123 Ngguyen Thai Son",  06, LocalDate.of(2023,10,10), 30, 60);


		danhsach danhsach = new danhsach();
		danhsach.them(manager);
		danhsach.them(designer);
		danhsach.them(programmer);
		danhsach.them(tester);
		danhsach.xuat();
		
		
		
		
		
	}

}

