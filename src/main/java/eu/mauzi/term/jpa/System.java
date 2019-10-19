package eu.mauzi.term.jpa;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class System implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Column(name = "CREATED_AT", nullable = false)
	private Timestamp createdAt;

	@Column(name = "UPDATED_AT", nullable = true)
	private Timestamp updatedAt;

	public Timestamp getCreatedAt()
	{
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt)
	{
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt()
	{
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt)
	{
		this.updatedAt = updatedAt;
	}
}
