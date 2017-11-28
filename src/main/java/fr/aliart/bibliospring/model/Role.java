package fr.aliart.bibliospring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="roles", catalog = "bibliospring")
public class Role implements java.io.Serializable{

	private Integer idRole;
	private String role;
    //relateds collection  	
    private Set<Person> personList = new HashSet<>();
    
    @Autowired
	public Role() {
	}

	@Id
	@Column(name="id_role")
	public Integer getIdRole() {
		return idRole;
	}

	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
	}
	
	@Column(name="role")
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

//	RELATIONSHIP BELOW
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="role")
	@JsonIgnoreProperties("role")
	public Set<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(Set<Person> personList) {
		this.personList = personList;
	}

}
