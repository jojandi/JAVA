package chap09;

import java.util.Objects;

public class MemberDTO {

	String name;
	int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "[ " + name + "(" + age + ") ]";
	}
	
	// Object 클래스의 equals 메소드 오버라이드
	@Override
	public boolean equals(Object obj) {
		MemberDTO m = (MemberDTO)obj;
		
		return this.name.equals(m.name) && this.age == m.age;
	}
	
	
	
	
	
	
}
