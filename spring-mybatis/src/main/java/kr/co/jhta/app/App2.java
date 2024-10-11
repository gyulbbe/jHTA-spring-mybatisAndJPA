package kr.co.jhta.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.mapper.BoardMapper;
import kr.co.jhta.vo.Board;

public class App2 {

	public static void main(String[] args) {
ApplicationContext ctx = new ClassPathXmlApplicationContext("context/context.xml");
		
		BoardMapper boardMapper = ctx.getBean(BoardMapper.class);
		
		List<Board> boards1 = boardMapper.searchBoards1("writer", "홍길동");
	}
}
