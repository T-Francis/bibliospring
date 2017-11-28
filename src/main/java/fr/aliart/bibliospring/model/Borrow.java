package fr.aliart.bibliospring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "borrows", catalog = "bibliospring")
public class Borrow implements java.io.Serializable{
	
	private Integer idBorrow;
	private String borrowDate;
	private String returnDate;
	private BiblioUser biblioUser;
	private Subscriber subscriber;
	private Copy copy;
		
	public Borrow() {
	}

	@Id
	@Column(name="id_borrow")
	public Integer getIdBorrow() {
		return idBorrow;
	}
	
	public void setIdBorrow(Integer idBorrow) {
		this.idBorrow = idBorrow;
	}
	
	public String getBorrowDate() {
		return borrowDate;
	}
	
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	
	public String getReturnDate() {
		return returnDate;
	}
	
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_biblioUser", foreignKey=@ForeignKey(name="FK_borrows_id_biblioUser"))
	@JsonIgnoreProperties("borrowList")
	public BiblioUser getBiblioUser() {
		return biblioUser;
	}
	
	public void setBiblioUser(BiblioUser biblioUser) {
		this.biblioUser = biblioUser;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_subscriber", foreignKey=@ForeignKey(name="FK_borrows_id_subscriber"))
	@JsonIgnoreProperties("borrowList")
	public Subscriber getSubscriber() {
		return subscriber;
	}
	
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_copy", foreignKey=@ForeignKey(name="FK_borrows_id_copy"))
	@JsonIgnoreProperties("copy")
	public Copy getCopy() {
		return copy;
	}
	
	public void setCopy(Copy bookCopy) {
		this.copy = bookCopy;
	}
	
	
}
