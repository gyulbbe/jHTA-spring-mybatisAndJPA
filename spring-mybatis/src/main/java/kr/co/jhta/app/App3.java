package kr.co.jhta.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.mapper.BoardMapper;
import kr.co.jhta.vo.Board;
import kr.co.jhta.vo.User;

public class App3 {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context/context.xml");
		
		BoardMapper boardMapper = ctx.getBean(BoardMapper.class);
		
		Board board = new Board();
		board.setTitle("clob 데이터 insert 연습1");
		board.setContent("clob 데이터 연습입니다.1");
		
		User user = new User();
		user.setNo(1);
		board.setUser(user);
		boardMapper.insertBoard(board);
	}
}
