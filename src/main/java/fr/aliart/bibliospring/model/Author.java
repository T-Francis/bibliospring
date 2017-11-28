package fr.aliart.bibliospring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "authors", catalog = "bibliospring")
public class Author extends Person implements java.io.Serializable {

	private String authorName;
	private Set<Book> bookList = new HashSet<>();

	public Author() {
	}

	@Column(name = "author_name")
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	// RELATIONSHIP BELOW

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "authors_books",
				joinColumns = { @JoinColumn(name = "id_author",foreignKey = @ForeignKey(name = "FK_authors_id_author")) },
				inverseJoinColumns = {@JoinColumn(name = "isbn",foreignKey = @ForeignKey(name = "FK_books_isbn")) })
	@JsonIgnoreProperties("authorList")
	public Set<Book> getBookList() {
		return bookList;
	}

	public void setBookList(Set<Book> bookList) {
		this.bookList = bookList;
	}
}
