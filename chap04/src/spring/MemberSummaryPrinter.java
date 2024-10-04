package spring;

public class MemberSummaryPrinter extends MemberPrinter {
	
	@Override
	public void print(Member member) {
		System.out.printf(
				"ȸ�� ����:�̸��� = %s, �̸� = %s\n",
				member.getEmail(),member.getName());
	}
	
}
