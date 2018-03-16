package eu.mauzi.term.jpa;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TERM")
public class Term extends JPAEntity
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

	@Lob
	@Column(name = "EXPLANATION", nullable = true, length = -1)
	private String explanation;

	@Column(name = "NSFW", nullable = false)
	private boolean nsfw;

	@Column(name = "IS_CATEGORY", nullable = false)
	private boolean isCategory;

	@Column(name = "PARENT_ID", nullable = false)
	private int parentId;

	@ManyToOne
	@PrimaryKeyJoinColumn(name = "PARENT_ID", referencedColumnName = "ID")
	private Term term;

	@OneToMany(mappedBy = "term")
	private List<Term> terms;


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

	public boolean getNsfw()
	{
		return nsfw;
	}

	public void setNsfw(boolean nsfw)
	{
		this.nsfw = nsfw;
	}

	public boolean getIsCategory()
	{
		return isCategory;
	}

	public void setIsCategory(boolean isCategory)
	{
		this.isCategory = isCategory;
	}

	public int getParentId()
	{
		return parentId;
	}

	public void setParentId(int parentId)
	{
		this.parentId = parentId;
	}

	public Term getTerm()
	{
		return term;
	}

	public void setTerm(Term term)
	{
		this.term = term;
	}

	public List<Term> getTerms()
	{
		return terms;
	}

	public void setTerms(List<Term> terms)
	{
		this.terms = terms;
	}
}
