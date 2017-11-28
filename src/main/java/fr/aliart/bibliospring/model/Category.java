package fr.aliart.bibliospring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "categories", catalog = "bibliospring")
public class Category implements java.io.Serializable{

    
    private Integer idCategory;    
    private String name;
    private String description;
    //relateds collection
    private Set<Book> bookList = new HashSet<>();
    
	public Category() {
    }
	
	
	@Id
	@Column(name = "id_category")
	public Integer getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    @Column(name = "description")  
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
//	RELATIONSHIP BELOW
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	@JsonIgnoreProperties("category")
	public Set<Book> getBookList() {
		return bookList;
	}

	public void setBookList(Set<Book> bookList) {
		this.bookList = bookList;
	}
	
	
	
}
