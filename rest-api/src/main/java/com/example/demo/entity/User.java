package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "REST_USERS")
@SequenceGenerator(name = "USER_SEQ_GEN",
                   sequenceName = "REST_USERS_SEQ",
                   allocationSize = 1)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
					generator = "USER_SEQ_GEN")
	@Column(name = "USER_ID")
	private Long id;
	
	@Column(name = "USER_EMAIL", nullable = false)
	private String email;
	
	@Column(name = "USER_PWD", nullable = false)
	private String password;
	
	@Column(name = "USER_NICKNAME", nullable = false)
	private String nickname;
	
	@Column(name = "USER_TEL", nullable = false)
	private String tel;
	
	@Column(name = "USER_CREATED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate = new Date();
	
	@Column(name = "USER_UPDATED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedDate = new Date();
	
	/*
	 * @OneToMany
	 *  - 일대다 관계를 표현하는 어노테이션이다.
	 *  - User엔티티는 Todo엔티티를 여러개와 연결될 수 있음을 나타낸다.
	 *  - 주요 속성
	 *    - mappedBy
	 *      + 양방향 연관관계 설정에서 사용되는 속성이다.
	 *      + 연관관계의 주인이 아닌 엔티티쪽에 설정되는 속성이다.
	 *      + 연관관계의 주인은 외래키를 관리하는 엔티티가 연관관계의 주인이다.
	 *      + mappedBy = "user"는
	 *        연관관계의 주인이 User가 아니고, Todo 엔티티가 연관관계의 주인임을 나타낸다.
	 *        Todo엔티티의 user 멤버변수가 연관관계를 관리하고 있음을 나타낸다.
	 *        (Todo엔티티의 user 멤버변수에 저장된 User객체의 식별자 값이 외래키로 사용된다.)
	 *    - cascade
	 *      + 부모 엔티티에서 수행된 작업이 지식 엔티티에 전파되는 속성이다.
	 *      + CascadeTyoe.ALL은 부모 엔티티에서 수행되는
	 *        모든 작업(CREATE, READ, UPDATE, DELETE)을 자식 엔티티로 전파한다.
	 *        * 신규 사용자를 등록할 때 USER엔티티에 사용자정보와 할 일 정보를 담아두면,
	 *          사용자가 등록(CREATE)된 다음에 할 일 정보도 함께 추가된다.
	 *        * 특정 User 엔티티 정보를 삭제하면 그와 관련된 할 일 정보도 함께 삭제되게 한다.
	 * 
	 */
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL) // 있어도 되고 없어도 됨
	private List<Todo> todos;
}
