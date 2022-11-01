package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		memberHashSet.addMemeber(memberLee);
		memberHashSet.addMemeber(memberKim);
		memberHashSet.addMemeber(memberKang);
		
	
		//equals , hashCode 메서드를 override하면 중복된 값이 들어갈 수 없다
		Member memberHong = new Member(1003, "홍길동");
		memberHashSet.addMemeber(memberHong);
		
		memberHashSet.showAllMember();
	}

}
