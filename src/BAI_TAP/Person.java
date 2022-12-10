package BAI_TAP;

import java.util.Scanner;

public class Person {
	private String name;
	private String gender;
	private String birthday;
	private String address;
	
	public Person() {
		
	}

	public Person(String name, String gender, String birthday, String address) {
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		name = sc.nextLine();
		
		System.out.println("Nhập giới tính: ");
		gender = sc.nextLine();
		
		System.out.println("Nhập ngày sinh: ");
		birthday = sc.nextLine();
		
		System.out.println("Nhập địa chỉ: ");
		address = sc.nextLine();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
