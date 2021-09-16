package egovframework.example.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.test.domain.TestVO;
import egovframework.example.test.domain.UserVO;
import egovframework.example.test.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userServiceImpl;
	
    @RequestMapping("/myview.do") // .do를 붙여줘야되게 web.xml에 설정되어있음, web.xml에서 설정한대로 .do가 붙은 요청들을 dispatcher-servlet으로 보내고 거기서 맞는 컨트롤러를 찾아주게됨
    public String contentView(Model model) { //view에 데이터를 넘겨줄때 Model객체를 사용함 Model은 hashmap 형태를 갖고있으므로 key,value값처럼 사용 가능
        model.addAttribute("value","hi"); //value라는 키값에 문자열 hi값을 저장해놨음 이걸 jsp파일에서 가져다 쓰는것 이 addAttribute를 어노테이션으로 매개변수에서 한번에 해줄수도 있음 @ModelAttribute("testVO") TestVO testVO
        return "test/myview_T";
    }   
    
    @RequestMapping("/signup.do")
    public String signUp(@ModelAttribute("userVO") UserVO userVO)
    {
    	return "test/signUp";
    }
    
    @RequestMapping("/insertUser.do")
    public String write(@ModelAttribute("userVO") UserVO userVO) throws Exception
    {
    	userServiceImpl.insertUser(userVO);
    	return "redirect:testList.do";
    }
}

