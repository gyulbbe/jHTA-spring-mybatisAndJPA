package kr.co.jhta.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.mapper.BoardMapper;
import kr.co.jhta.vo.Board;
import kr.co.jhta.vo.User;

public class App2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context/context.xml");
				
		BoardMapper boardMapper = ctx.getBean(BoardMapper.class);
		
//		String title = null;
//		int cnt = 0;
//		List<String> tags = List.of("자바", "java", "스프링");
//		List<Board> boards = boardMapper.searchBoard(title, cnt, tags);
//		System.out.println(boards);
//		
//		List<Board> boards1 = boardMapper.searchBoards1("writer", "홍길동");
//		
//		Map<String, Object> map = new HashMap<>();
//		map.put("opt", "자바");
//		map.put("keyword", " 공부");
//		map.put("begin", 1);
//		map.put("end", 10);
//		map.put("sort", "날짜순");
//		
//		List<Board> boardList = boardMapper.searchBoards2(map);
//		Map<String, Object> map = boardMapper.getBoardByNo2(1);
	}
}
