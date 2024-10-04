package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberInfoPrinter {
	
	private MemberDao memberDao;
	private MemberSummaryPrinter printer;
	
	public void printMemberInfo(String email) {
		Member member = memberDao.selectByEamil(email);
		if(member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	@Autowired
	public void setPrinter(MemberSummaryPrinter printer) {
		this.printer = printer;
	}
}