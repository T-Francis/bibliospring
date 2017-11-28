package fr.aliart.bibliospring.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "books", catalog = "bibliospring")
public class Book implements java.io.Serializable {
    
	private String isbn;    
    private String title;    
    private String subtitle;   
    private String releaseDate;
    private Integer isRentable;
    //relateds collection    
    private Category category;
    private Set<Author> authorList = new HashSet<>();
    private Set<Copy> copiesList = new HashSet<>();
    
	public Book() {    	
	}

	@Id
	@Column(name = "isbn")
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Column(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

    @Column(name = "subtitle")
	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

    @Column(name = "release_Date") 	
	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

    @Column(name = "is_Rentable")    	
	public Integer getIsRentable() {
		return isRentable;
	}

	public void setIsRentable(Integer isRentable) {
		this.isRentable = isRentable;
	}
	
	
//	RELATIONSHIP BELOW
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_category", foreignKey=@ForeignKey(name="FK_books_id_category"))
	@JsonIgnoreProperties("bookList")
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="authors_books",
     			joinColumns=@JoinColumn(name="isbn", foreignKey=@ForeignKey(name="FK_authors_books_isbn")),
     			inverseJoinColumns=@JoinColumn(name="id_author", foreignKey=@ForeignKey(name="FK_authors_books_id_author")))
	@JsonIgnoreProperties("bookList")
	public Set<Author> getAuthorList() {
		return authorList;
	}
	
	public void setAuthorList(Set<Author> authorList) {
		this.authorList = authorList;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	@JsonIgnoreProperties("book")
	public Set<Copy> getCopiesList() {
		return copiesList;
	}

	public void setCopiesList(Set<Copy> copiesList) {
		this.copiesList = copiesList;
	}
		
}
