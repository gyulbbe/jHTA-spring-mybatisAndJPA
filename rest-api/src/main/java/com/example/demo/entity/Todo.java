package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/*
 * @Entity
 *  - 이 클래스가 테이블과 매핑되는 엔티티 클래스임을 나타내는 어노테이션이다.
 * @Table
 *  - 이 엔티티 클래스와 매핑되는 테이블의 이름으로 지정하는 어노테이션이다.
 * @SequenceGenerator
 *  - 데이터베이스가 오라클인 경우 이 엔티티와 관련 시퀀스를 지정한 어노테이션이다.
 *  - sequenceName: 시퀀스의 이름을 지정한다.
 *  - name: 시퀀스제너레이터의 이름이다.
 *  - allocationSize: 한 번에 조회하는 일련의 갯수다.
 */
@Entity
@Table(name = "REST_TODOS")
@SequenceGenerator(name = "TO_SEQ_GEN",
				   sequenceName = "TODOS_SEQ",
				   allocationSize = 1)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Todo {

	/*
	 * @Id
	 *  - 이 엔티티의 식별자(기본키)와 매핑되는 값임을 나타낸다.
	 * @GeneratedValue
	 *  - 기본키로 사용할 값의 생성전략을 지정하는 어노테이션이다.
	 *  - 전략의 종류
	 *    + AUTO : 자동설정
	 *    + INDENTITY : MySQL, mariaDB, H2 등의 데이터베이스를 사용할 때
	 *                  기본키 값의 생성을 데이터베이스에 위임
	 *    + SEQUENCE : Oracle 
	 *    + UUID : UUID값을 기본키 값으로 사용한다.
	 *    + TABLE : 별도의 테이블을 생성해서 각 엔티티의 기본키 값을 관리한다.
	 *              데이터베이스 종류에 상관없이 범용적으로 사용할 수 있는 전략
	 * @Column
	 *  - 매핑되는 컬럼의 정보를 설정한다.
	 *  - 컬럼명, null값 가능여부, 사이즈, 중복허용여부
	 * @Temporal
	 *  - Date 타입의 경우, 실제 테이블에 저장되는 데이터 형식을 지정한다.
	 *  - 종류
	 *    + TemporalType.DATE : 날짜만 저장된다.
	 *    + TemporalType.TIME : 시간정보(시분초)만 저장된다.
	 *    + TemporalType.TIMESTAMP : 날짜와 시간이 저장된다.
	 *  - LocalDate, LocalTime, LocalDateTime 타입인 경우 설정할 필요가 없다.
	 * @ManyToOne
	 *  - 다대일 관계를 표현하는 어노테이션이다.
	 *  	- @AToB에서 A가 현재 엔티티, B가 연관관계에 있는 엔티티
	 *  	- 이 엔티티에서 A는 Todo이고, B는 User다.
	 *  	- 외래키가 위치하는 테이블이 언제나 다대일 관계에서 "다"에 해당한다.
	 * @JoinColumn
	 *  - 외래키가 있는 테이블에서 외래키의 이름을 지정하는 컬럼이다.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
							   generator = "TODO_SEQ_GEN")
	@Column(name = "TODO_ID")
	private Long id;
	
	@Column(name = "TODO_TITLE", nullable = false, length = 255)
	private String title;
	
	@Column(name = "TODO_CONTENT", nullable = false, length = 2000)
	private String content;
	
	@Column(name = "TODO_START_DATE", nullable = false)
	@Temporal(TemporalType.DATE)  // 날짜 정보 저장 수준을 지정한다. 날짜정보를 저장한다.
	private Date startDate;
	
	@Column(name = "TODO_END_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@Column(name = "TODO_CREATED_DATE", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)  // 날짜의 시간정보를 저장한다.
	private Date createdDate = new Date();
	
	@Column(name = "TODO_UPDATED_DATE", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedDate = new Date();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID", nullable = false)
	private User user;
}
