package egovframework.example.test.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.test.domain.UserVO;
import egovframework.example.test.service.UserMapper;

@Service("userDAOService")
public class UserDAOService implements UserDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insertUser(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		mapper.insertUser(userVO);
	}

}
