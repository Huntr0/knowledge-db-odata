package eu.mauzi.term.jpa;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category extends JPAEntity
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private int id;

	@Column(name = "TITLE", nullable = false, length = 50)
	private String title;

	@Lob
	@Column(name = "DESCRIPTION", nullable = true, length = -1)
	private String description;

	@Column(name = "NSFW", nullable = false)
	private boolean nsfw;

	@OneToMany(mappedBy = "category", orphanRemoval = true)
	private List<Term> terms;


	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public boolean isNsfw()
	{
		return nsfw;
	}

	public void setNsfw(boolean nsfw)
	{
		this.nsfw = nsfw;
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
