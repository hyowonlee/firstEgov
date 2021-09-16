package egovframework.example.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.test.domain.Search;
import egovframework.example.test.domain.TestVO;
import egovframework.example.test.service.TestMapper;

@Service("testDAOService")
public class TestDAOService implements TestDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public List<TestVO> selectTest(Search search) throws Exception {
		TestMapper mapper = sqlSession.getMapper(TestMapper.class); //mybatis에 Mapper라는 구조가 준비되어있는데 매핑파일이 자동으로 mapper단위가 되어 관리가 쉬움 (sqlsession을 직접사용하는것보다 안전함)
		//mapper 인스턴스는 sqlsession의 getMapper()메소드로 취득한다
		return mapper.selectTest(search);
	}

	//게시글 생성 insert라 db에 값만 들어가면되니까 return이 필요없음
	@Override
	public void insertTest(TestVO testVO) throws Exception {
		// TODO Auto-generated method stub
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
		mapper.insertTest(testVO);
	}

	@Override
	public TestVO selectDetail(TestVO testVO) throws Exception {
		// TODO Auto-generated method stub
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
		return mapper.selectDetail(testVO);
	}

	@Override
	public void updateTest(TestVO testVO) throws Exception {
		// TODO Auto-generated method stub
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
		mapper.updateTest(testVO);
	}

	@Override
	public void deleteTest(TestVO testVO) throws Exception {
		// TODO Auto-generated method stub
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
		mapper.deleteTest(testVO);
	}

	@Override
	public int getBoardListCnt(Search search) throws Exception {
		// TODO Auto-generated method stub
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
		return mapper.getBoardListCnt(search);
	}
}