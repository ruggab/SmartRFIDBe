package net.smart.rfid.db.entity.public_table;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "users" database table.
 * 
 */
@Entity
@Table(name="\"users\"")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private long id;

	@Column(name="\"email\"")
	private String email;

	@Column(name="\"password\"")
	private String password;

	@Column(name="\"username\"")
	private String username;

	//bi-directional many-to-many association to Role
	@ManyToMany
	@JoinTable(
		name="\"user_roles\""
		, joinColumns={

			}
		, inverseJoinColumns={

			}
		)
	private List<Role> roles;

	public User() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}