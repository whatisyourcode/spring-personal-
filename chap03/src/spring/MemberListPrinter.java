package spring;

import java.util.Collection;

public class MemberListPrinter {
	
	
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	// 두개의 객체를 의존 주입
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));
	}
}
