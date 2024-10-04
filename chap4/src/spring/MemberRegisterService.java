package spring;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {
	@Autowired
	private MemberDao memberDao;
	
	
	public Long regist(RegisterRequest req) {
		Member member = memberDao.selectByEamil(req.getEmail());
		if(member != null) {
			throw new DuplicateMemberException("dup email" + req.getName());
		}
		
		Member newMember = new Member(
				req.getEmail(), req.getPassword(),req.getPassword(),LocalDateTime.now());
		memberDao.insert(newMember);
		return newMember.getId();
	}
}
