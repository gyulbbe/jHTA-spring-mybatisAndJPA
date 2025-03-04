package kr.co.jhta.vo;

public class Job {
	
	private String id;
	private String title;
	private int minSalary;
	private int maxSalary;
	
	public Job() {} // mybatis는 기본생성자로 만들어주니깐 웬만하면 만들어주고 시작하자
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}
	public int getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}
	@Override
	public String toString() {
		return "Job [id=" + id + ", title=" + title + ", minSalary=" + minSalary + ", maxSalary=" + maxSalary + "]";
	}
	
	
}
