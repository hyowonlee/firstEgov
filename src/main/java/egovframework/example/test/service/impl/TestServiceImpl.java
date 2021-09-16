package egovframework.example.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.test.dao.TestDAO;
import egovframework.example.test.domain.Search;
import egovframework.example.test.domain.TestVO;
import egovframework.example.test.service.TestService;

@Service("testServiceImpl")
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDAO testDAOService;
	
	@Override
	public List<TestVO> selectTest(Search search) throws Exception {
		// TODO Auto-generated method stub
		return testDAOService.selectTest(search);
	}

	@Override
	public void insertTest(TestVO testVO) throws Exception {
		// TODO Auto-generated method stub
		testDAOService.insertTest(testVO);
		
	}

	@Override
	public TestVO selectDetail(TestVO testVO) throws Exception {
		// TODO Auto-generated method stub
		return testDAOService.selectDetail(testVO);
	}

	@Override
	public void updateTest(TestVO testVO) throws Exception {
		// TODO Auto-generated method stub
		testDAOService.updateTest(testVO);
	}

	@Override
	public void deleteTest(TestVO testVO) throws Exception {
		// TODO Auto-generated method stub
		testDAOService.deleteTest(testVO);
	}

	@Override
	public int getBoardListCnt(Search search) throws Exception {
		// TODO Auto-generated method stub
		return testDAOService.getBoardListCnt(search);
	}
	
	
}
