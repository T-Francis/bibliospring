package fr.aliart.bibliospring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "biblio_users", catalog = "bibliospring")
public class BiblioUser extends Person implements java.io.Serializable{


    private String password;
    private String mail;
    //relateds collection
    private Set<Borrow> borrowList = new HashSet<>();

	public BiblioUser() {
    
	}

    @Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
    @Column(name = "mail")
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

//	RELATIONSHIP BELOW
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "biblioUser")
	@JsonIgnoreProperties("biblioUser")
	public Set<Borrow> getBorrowList() {
		return borrowList;
	}

	public void setBorrowList(Set<Borrow> borrowList) {
		this.borrowList = borrowList;
	}

}
