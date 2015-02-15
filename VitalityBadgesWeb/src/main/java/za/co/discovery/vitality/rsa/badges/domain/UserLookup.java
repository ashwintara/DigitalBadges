package za.co.discovery.vitality.rsa.badges.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_LOOKUP")
public class UserLookup {
	
	@Id
	private Long id;
	
	
	@Column(unique=true)
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;


	@Column
	private Integer role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
