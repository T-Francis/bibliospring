package fr.aliart.bibliospring.model;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "persons", catalog = "bibliospring")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person implements java.io.Serializable{
	

    private Integer idPerson;
    private String lastName;
    private String firstName;
    private String birthdate;
    //relateds collection 
    private Role role;
   
	public Person() {
    }

	@Id
    @Column(name = "id_person")
	public Integer getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Integer idPerson) {
		this.idPerson = idPerson;
	}
	
    @Column(name = "last_name")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    @Column(name = "first_name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
    @Column(name = "birthdate")
	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

//	RELATIONSHIP BELOW
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_role",foreignKey = @ForeignKey(name = "FK_persons_id_role"))
	@JsonIgnoreProperties("personList")
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
