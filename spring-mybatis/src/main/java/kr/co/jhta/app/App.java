package kr.co.jhta.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.mapper.BoardMapper;
import kr.co.jhta.mapper.JobMapper;
import kr.co.jhta.mapper.UserMapper;
import kr.co.jhta.vo.Board;
import kr.co.jhta.vo.Job;
import kr.co.jhta.vo.User;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context/context.xml");
		
//		JobMapper jobMapper = ctx.getBean(JobMapper.class);
//		
//		UserMapper userMapper = ctx.getBean(UserMapper.class);
//		
//		BoardMapper boardMapper = ctx.getBean(BoardMapper.class);
//		
//		Board board = boardMapper.getBoardByNo(1);
//		
//		System.out.println(board);
		
//		List<User> users = userMapper.getAllUsers();
//		for (User user : users) {
//			System.out.println(user.getName());
//		}
		
//		User user = new User();
//		user.setId("lee");
//		user.setName("이순신");
//		user.setEmail("lee@gmail.com");
//		user.setPassword("zxcv1234");
//		userMapper.insertUser(user);
		
//		Job job = jobMapper.getJobById("IT_PROG");
//		System.out.println(job);
		
//		List<Job> jobs = jobMapper.getAllJobs();
//		for (Job job : jobs) {
//			System.out.println(job);
//		}
		
//		Job job = new Job();
//		job.setId("교육");
//		job.setTitle("직원 교육 및 강의");
//		job.setMinSalary(8000);
//		job.setMaxSalary(4500);
//		
//		jobMapper.insertJob(job);
	}
}
