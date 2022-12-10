package BAI_TAP;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choose;
		
		do {
			showMenu();
			System.out.println("Choose");
			choose = sc.nextInt();
			System.out.println();
			switch(choose) {
				case 1:
					System.out.println("Nhập số sinh viên cần thêm: ");
					int n = sc.nextInt();
	
					for(int i = 0; i < n; i++) {
						Student std = new Student();
						System.out.println("Sinh viên thứ "+(i+1)+":");
						std.inputInfo();
						if(!studentList.contains(std)) {
							studentList.add(std);
							System.out.println("Thêm sinh viên thành công");
						}
						else {
							System.out.println("Mã sinh viên đã tồn tại");
						}
					}
					break;
				case 2:
					for(int i = 0; i < studentList.size(); i++) {
						studentList.get(i).showInfo();
					}
					break;
				case 3:
					System.out.println("Nhập vào mã sinh viên: ");
					sc.nextLine();
					String mSV = sc.nextLine();
					int tmp = 0;
					boolean ok = true;
					for(int i = 0; i<studentList.size(); i++) {
						if(studentList.get(i).getRollNo().equalsIgnoreCase(mSV)) {
							studentList.get(i).showInfo();
							tmp = i;
							ok = false;
							break;
						}
					}
					if(ok) {
						System.out.println("Không tìm thấy sinh viên có mã "+mSV);
					}
					else {
						System.out.println("Sửa tên sinh viên");
						String tenSV = sc.nextLine();
						studentList.get(tmp).setName(tenSV);
						
						System.out.println("Sửa ngày sinh");
						String nSinh = sc.nextLine();
						studentList.get(tmp).setBirthday(nSinh);
						
						System.out.println("Sửa địa chỉ");
						String diaChi = sc.nextLine();
						studentList.get(tmp).setAddress(diaChi);
						
						System.out.println("Sửa điểm trung bình");
						double diemTB = sc.nextDouble();
						studentList.get(tmp).setMark(diemTB);
						
						sc.nextLine();
						
						System.out.println("Sửa mã sinh viên");
						String maSV = sc.nextLine();
						studentList.get(tmp).setRollNo(maSV);
						
						System.out.println("Sửa email");
						String email = sc.nextLine();
						studentList.get(tmp).setEmail(email);
						
						System.out.println("Cập nhật thành công");
						studentList.get(tmp).showInfo();
					}
					
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
			}
		}while(choose != 7);
	}
	
	static void showMenu() {
		System.out.println("1. Nhập vào số sinh viên");
		System.out.println("2. Hiển thị thông tin sinh viên");
		System.out.println("3. Cập nhật thông tin sinh viên");
		System.out.println("4. Nhập vào số sinh viên");
		System.out.println("5. Nhập vào số sinh viên");
		System.out.println("6. Nhập vào số sinh viên");
		System.out.println("7. Nhập vào số sinh viên");
	}
}