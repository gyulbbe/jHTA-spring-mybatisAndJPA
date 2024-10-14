package kr.co.jhta.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.co.jhta.vo.Board;
import kr.co.jhta.vo.Criteria;

@Mapper
public interface BoardMapper {

	void insertBoard(@Param("board") Board board);
	
	List<Board> getAllBoards1();
	List<Board> getAllBoards2();
	List<Board> getAllBoards3();
	
	Board getBoardByNo(@Param("no")int no);
	Map<String, Object> getBoardByNo2(@Param("no") int no);
	
	
	List<Board> searchBoard(@Param("title") String title,
							@Param("cnt") int reviewCnt,
							@Param("tags") List<String> tags);
	
	List<Board> searchBoards1(@Param("opt") String opt, @Param("keyword") String keyword);
	List<Board> searchBoards2(@Param("condition") Map<String, Object> condition);
	List<Board> searchBoards3(@Param("condition") Criteria criteria);
}
