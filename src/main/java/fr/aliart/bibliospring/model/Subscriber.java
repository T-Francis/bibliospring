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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "subscribers", catalog = "bibliospring")
public class Subscriber extends Person implements java.io.Serializable{

 
    private Integer rentLimit;
    //relateds collection
    private Set<Borrow> borrowList = new HashSet<>();
    
	public Subscriber() {
    }

    @Column(name = "rent_limit")
	public Integer getRentLimit() {
		return rentLimit;
	}

	public void setRentLimit(Integer rentLimit) {
		this.rentLimit = rentLimit;
	}

//	RELATIONSHIP BELOW

	@OneToMany(fetch = FetchType.LAZY, mappedBy="subscriber")
	@JsonIgnoreProperties("borrowList")
	public Set<Borrow> getBorrowList() {
		return borrowList;
	}

	public void setBorrowList(Set<Borrow> borrowList) {
		this.borrowList = borrowList;
	}
		
}
