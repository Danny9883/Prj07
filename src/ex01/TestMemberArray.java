package ex01;

import java.util.Objects;

class Member {
	// Field
	private int     num;
	private String  name;
	private String  tel;
	
	
	// Constructor
	public Member() {}

	public Member(int num, String name, String tel) {
		this.num = num;
		this.name = name;
		this.tel = tel;
	}

	
	
	
	
	// Method
	// toString
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", tel=" + tel + "]";
	}
	
	// hashCode
	@Override
	public int hashCode() {
		return Objects.hash(name, num, tel);
	}

	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(num, other.num) ;
	}
	
	
	

	
	
	
	
} // class Member end

public class TestMemberArray {

	public static void main(String[] args) {
		// 여러명의 정보를 입력받아
		// 검색 객체를 만들어서 해당 멤버를 찾는다
/*		Member  m1 = new Member(1, "민지", "010-1234-5671");
		Member  m2 = new Member(2, "원영", "010-2234-5672");
		Member  m3 = new Member(3, "윈터", "010-3234-5673");
		Member  m4 = new Member(4, "유진", "");    // 빈 문자열
		Member  m5 = new Member(5, "유나", "010-5234-5675");
		Member  m6 = new Member(6, "닝닝", null);  // null
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);             */
		
		Member [] mArr = new Member[6];
		
		mArr[0]        = new Member(1, "민지", "010-1234-5671");
		mArr[1]        = new Member(2, "원영", "010-2234-5672");
		mArr[2]        = new Member(3, "윈터", "010-3234-5673");
		mArr[3]        = new Member(4, "유진", "");    
		mArr[4]        = new Member(5, "유나", "010-5234-5675");
		mArr[5]        = new Member(6, "닝닝", null);  
		
		for (Member member : mArr) {
			System.out.println(member);
		}
		System.out.println("============================");
		
		// 찾을 사람의 정보
		Member   mem = new Member(3, null, null);
		
		// == 주소 비교 로는 찾을 수 없다 
		// -> data 비교로 변경 : equals() 재정의
		boolean isFound = false;
		for (int i = 0; i < mArr.length; i++) {
			Member member = mArr[i];
			// System.out.println("member: "+ member.hashCode());
			// System.out.println("mem: "+ mem.hashCode());
			if (member.equals(mem)) {
				System.out.println(member);
				isFound = true;
				break;
			}
		}
		if (!isFound)
			System.out.println("못찾음");
		
		
	}

}
