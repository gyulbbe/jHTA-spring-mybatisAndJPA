package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@SpringBootTest
class RestApiApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@DisplayName("userRepository가 null이 아님을 테스트한다.")
	@Test
	@Disabled
	public void testAutowired() {
		assertNotNull(userRepository);
	}
	
	@BeforeEach
	public void setup() {
		System.out.println("setup메소드 실행됨.");
		System.out.println("기존 사용자정보를 전부 삭제한다.");
		userRepository.deleteAll();
	}
	
	@DisplayName("닉네임으로 사용자를 조회할 수 있는지 테스트한다.")
	@Test
	public void testFindByNickname() {
		System.out.println("testFindByNickname 메소드 실행됨");
		
		// 새 사용자 정보가 포함된 엔티티 객체를 생성한다.
		User user = new User();
		user.setEmail("hong@gmail.com");
		user.setPassword("zxcv1234");
		user.setNickname("홍홍홍");
		user.setTel("010-1111-1111");
		
		userRepository.save(user);
		
		User foundUser = userRepository.findByNickname("홍홍홍");
		
		assertThat(foundUser).isNotNull();
	}
	
	@DisplayName("신규 사용자가 등록되었는지 테스트한다.")
	@Test
	public void testSaveUser() {
		System.out.println("testSaveUser메소드 실행됨.");
		User user = new User();
		user.setEmail("hong@gmail.com");
		user.setPassword("zxcv1234");
		user.setNickname("홍홍홍");
		user.setTel("010-1111-1111");
		
		// 레포지토리의 save()메소드를 실행시켜서 저장시킨다.
		userRepository.save(user);
		
		// 레포지토리의 findAll()메소드를 실행시켜서 모든 사용자정보를 조회한다.
		List<User> users = userRepository.findAll();
		
		// 조회된 사용자정보가 1명 이상일 것이라고 단언한다.
		assertThat(users.size()).isGreaterThan(0);
	}
}
