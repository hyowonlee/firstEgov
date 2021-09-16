package egovframework.example.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.test.dao.UserDAO;
import egovframework.example.test.domain.UserVO;
import egovframework.example.test.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAOService;
	
	@Override
	public void insertUser(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub
		userDAOService.insertUser(userVO);
	}

}
