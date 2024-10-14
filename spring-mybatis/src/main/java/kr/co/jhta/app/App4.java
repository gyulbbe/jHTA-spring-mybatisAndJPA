package kr.co.jhta.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.mapper.UserMapper;
import kr.co.jhta.vo.User;

public class App4 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context/context.xml");
		
		UserMapper userMapper = ctx.getBean(UserMapper.class);
		
		List<User> users = userMapper.searchUsers("1=1 or user_no", 1);
		System.out.println(users);
		
//		long time = System.currentTimeMillis();
//		User user = new User();
//		user.setId("hong" + time);
//		user.setPassword("zxcv1234");
//		user.setEmail("hong" + time + "@gmail.com");
//		user.setName("홍길동");
		// 신규 사용자 정보 등록 전
		/*
		 * User객체
		 * 		no			= 0
		 * 		id			= "hong123456789"
		 * 		password	= "zxcv1234"
		 * 		name		= "홍길동"
		 * 		email		= "hong12345@gmail.com"
		 */
		
		// 신규 사용자 등록
//		userMapper.insertUser(user);
		// 신규 사용자 정보 등록 후
		/*
		 * User객체
		 * 		no			= 31
		 * 		id			= "hong123456789"  <--- insert 실행과정에서 selectKey로 변수에 저장시킨 값
		 * 		password	= "zxcv1234"
		 * 		name		= "홍길동"
		 * 		email		= "hong12345@gmail.com" 
		 */
		
		// 신규 사용자의 권한정보를 등록할 때
		// 새로 등록된 사용자의 사용자번호를 이용한다.
//		userMapper.insertUserRole(user.getNo(), "USER");
//		userMapper.insertUserRole(user.getNo(), "MANAGER");
//		
//		System.out.println("등록된 사용자 정보");
//		System.out.println("사용자번호: " + user.getNo());
//		System.out.println("사용자아이디: " + user.getId());
//		System.out.println("사용자비밀번호: " + user.getPassword());
//		System.out.println("사용자 이름: " + user.getName());
//		System.out.println("사용자 이메일: " + user.getEmail());
	}
}
