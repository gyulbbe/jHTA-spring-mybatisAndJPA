package kr.co.jhta.vo;

public class Criteria {

	private String opt;			// 검색옵션: title, writer, content 중 하나다.
	private String keyword;		// 검색키워드: 검색어
	private int begin;			// 페이지 번호에 맞는 조회 시작 위치
	private int end;			// 페이지 번호에 맞는 조회 끝 위치
	private String sort;		// 정렬 기준: no, title, ...등
	private String direction;	// 정렬 방향: asc, desc
	
	public Criteria() {}

	public String getOpt() {
		return opt;
	}

	public void setOpt(String opt) {
		this.opt = opt;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
}
