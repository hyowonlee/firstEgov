package egovframework.example.test.service;

import java.util.List;

import egovframework.example.test.domain.Search;
import egovframework.example.test.domain.TestVO;

public interface TestService {
	
	public List<TestVO> selectTest(Search search) throws Exception; // selectTest는 testMappers.xml의 쿼리문 이름 TestVO는 만들어놓은 VO 클래스
	
	public void insertTest(TestVO testVO) throws Exception; // 글작성 db insert 서ꈰ스 post(자원 생성)방식
	
	public TestVO selectDetail(TestVO testVO) throws Exception; // 상세보기
	
	public void updateTest(TestVO testVO) throws Exception; // 글 수정 put 방식(자원수정)으로 해야될듯
	
	public void deleteTest(TestVO testVO) throws Exception; // 글 삭제
	
	//총 게시글 개수 확인
	public int getBoardListCnt(Search search) throws Exception;
}
