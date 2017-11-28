package fr.aliart.bibliospring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "copies", catalog = "bibliospring")
public class Copy implements java.io.Serializable{

	private Integer idCopy;
	private Boolean isAvailable;
	private Boolean isInRestoration;
	private Book book;
	
    private Set<Borrow> borrowList = new HashSet<>();
	
	public Copy() {
	}

	@Id
	@Column(name="id_copy")
	public Integer getIdCopy() {
		return idCopy;
	}

	public void setIdCopy(Integer idCopy) {
		this.idCopy = idCopy;
	}

	@Column(name="is_available")
	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Column(name="in_restoration")
	public Boolean getIsInRestoration() {
		return isInRestoration;
	}

	public void setIsInRestoration(Boolean isInRestoration) {
		this.isInRestoration = isInRestoration;
	}

//	RELATIONSHIP BELOW
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="isbn",referencedColumnName="isbn", foreignKey=@ForeignKey(name="FK_copies_isbn"))
	@JsonIgnoreProperties("copy")
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "copy")
	@JsonIgnoreProperties("copy")
	public Set<Borrow> getBorrowList() {
		return borrowList;
	}

	public void setBorrowList(Set<Borrow> borrowList) {
		this.borrowList = borrowList;
	}
	
	
}
