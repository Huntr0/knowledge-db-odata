package eu.mauzi.term.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TERM")
public class Term implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private int id;

	@Column(name = "WORD", nullable = false, length = 50)
	private String word;

	@Column(name = "ABBREVIATION", nullable = true, length = 10)
	private String abbreviation;

	@Column(name = "EXPLANATION", nullable = true, length = -1)
	private String explanation;

	@Column(name = "CATEGORY_ID", nullable = false)
	private int categoryId;

	@ManyToOne
	@PrimaryKeyJoinColumn(name = "CATEGORY_ID", referencedColumnName = "ID")
	private Category category;


	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getWord()
	{
		return word;
	}

	public void setWord(String word)
	{
		this.word = word;
	}

	public String getAbbreviation()
	{
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation)
	{
		this.abbreviation = abbreviation;
	}

	public String getExplanation()
	{
		return explanation;
	}

	public void setExplanation(String explanation)
	{
		this.explanation = explanation;
	}

	public int getCategoryId()
	{
		return categoryId;
	}

	public void setCategoryId(int categoryId)
	{
		this.categoryId = categoryId;
	}

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}
}
