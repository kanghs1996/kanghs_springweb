package org.kanghs.ch11;

import java.util.List;

/**
 * p.184 [리스트 8.2] MemberDao 를 interface로 수정<br>
 * 회원 테이블을 조작하는 Data Access Object
 * 
 * @author kanghs
 */
public interface MemberDao {
	
	/**
	 * 이메일로 회원 정보 가져옴
	 */
	Member selectByEmail(String email);

	/**
	 * 회원정보 저장
	 */
	void insert(Member member);

	/**
	 * 회원정보 수정
	 */
	void update(Member member);

	/**
	 * 회원 목록
	 */
	List<Member> selectAll(int offset, int count);
	
	/**
	 * 회원 수
	 */
	int countAll();
	
	/**
	 * 이메일과 비밀번호로 멤버 가져오기. 로그인 할 때 사용한다.
	 */
	public Member selectByLogin(String email, String password);
}
