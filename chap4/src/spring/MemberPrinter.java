package spring;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberPrinter {
	private DateTimeFormatter dateTimeFormatter;
	
	public void print(Member member) {
		if(dateTimeFormatter == null) {
		System.out.printf(
				"ȸ�� ����: ���̵�=%d, �̸���=%s, �̸�=%s, �����=%tF\n",
				member.getId(),member.getEmail(),member.getName(),member.getRegisterDateTime());
		} else {
			System.out.printf(
					"ȸ�� ����: ���̵�=%d, �̸���=%s,�̸�=%s,�����=%s\n", 
					member.getId(),member.getEmail(),
					member.getName(),
					dateTimeFormatter.format(member.getRegisterDateTime()));
		}
	}
	
	@Autowired(required = false)
	public void setDateTimeForMatter(DateTimeFormatter dateTimeFormatter) {
		this.dateTimeFormatter = dateTimeFormatter;
	}
}
