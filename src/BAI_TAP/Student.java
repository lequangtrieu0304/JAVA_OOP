package BAI_TAP;

import java.util.Objects;
import java.util.Scanner;

public class Student extends Person {
	private String rollNo;
	private double mark;
	private String email;
	
	public Student() {
	}
	
	@Override
	public void inputInfo() {
		super.inputInfo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên");
		while(true) {
			boolean check = setRollNo(sc.nextLine());
			if(check) {
				break;
			}
		}
		
		System.out.println("Nhập điểm trung bình");
		while(true) {
			boolean check = setMark(sc.nextDouble());
			if(check) {
				break;
			}
		}
		sc.nextLine();
		System.out.println("Nhập email");
		while(true) {
			boolean check = setEmail(sc.nextLine());
			if(check) {
				break;
			}
		}
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(rollNo, other.rollNo);
	}

	public void showInfo() {
		System.out.println("Tên: " + this.getName()+ "; Giới tính: "+ this.getGender() + "; Ngày sinh: " + this.getBirthday()+ 
				"; Địa chỉ: " + this.getAddress() + "; Mã Sinh Viên: " + rollNo + "; Điểm trung bình: "+ mark+ "; Email: " + email);
	}

	public String getRollNo() {
		return rollNo;
	}

	public boolean setRollNo(String rollNo) {
		if(rollNo != null && rollNo.length() == 4) {
			this.rollNo = rollNo;
			return true;
		}
		else {
			System.out.println("Mã sinh viên gồm 4 kí tự");
			return false;
		}
	}

	public double getMark() {
		return mark;
	}

	public boolean setMark(double mark) {
		if(mark >= 0 && mark <= 10) {
			this.mark = mark;
			return true;
		}
		else {
			System.out.println("Nhập điểm không hợp lệ");
			return false;
		}
	}

	public String getEmail() {
		return email;
	}

	public boolean setEmail(String email) {
		if(email != null && email.contains("@") && !email.contains(" ")) {
			this.email = email;
			return true;
		}
		else {
			System.out.println("Email không hợp lệ");
			return false;
		}
	}
	
}
