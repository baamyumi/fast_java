package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		memberHashSet.addMemeber(memberLee);
		memberHashSet.addMemeber(memberKim);
		memberHashSet.addMemeber(memberKang);
		
	
		//equals , hashCode �޼��带 override�ϸ� �ߺ��� ���� �� �� ����
		Member memberHong = new Member(1003, "ȫ�浿");
		memberHashSet.addMemeber(memberHong);
		
		memberHashSet.showAllMember();
	}

}
