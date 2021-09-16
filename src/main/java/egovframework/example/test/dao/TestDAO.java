package egovframework.example.test.dao;

import java.util.List;

import egovframework.example.test.domain.Search;
import egovframework.example.test.domain.TestVO;

public interface TestDAO {

	List<TestVO> selectTest(Search search) throws Exception;
	
	void insertTest(TestVO testVO) throws Exception;
	
	TestVO selectDetail(TestVO testVO) throws Exception;
	
	void updateTest(TestVO testVO) throws Exception;
	
	void deleteTest(TestVO testVO) throws Exception;
	
	//총 게시글 개수 확인
	public int getBoardListCnt(Search search) throws Exception;
}