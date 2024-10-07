package spring;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("listPrinter")
public class MemberListPrinter {
	
	
	private MemberDao memberDao;
	private MemberPrinter printer;

	
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Autowired
	@Qualifier("summaryPrinter")
	public void setMemberPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	// 두개의 객체를 의존 주입
//	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
//		this.memberDao = memberDao;
//		this.printer = printer;
//	}
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));
	}
}
