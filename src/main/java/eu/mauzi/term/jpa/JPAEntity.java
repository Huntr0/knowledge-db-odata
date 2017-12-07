package eu.mauzi.term.jpa;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public class JPAEntity implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Embedded
	private System system;


	@PrePersist
	private void onCreate()
	{
		system = new System();
		system.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
	}

	@PreUpdate
	private void onUpdate()
	{
		system.setUpdatedAt(Timestamp.valueOf(LocalDateTime.now()));
	}

	public System getSystem()
	{
		return system;
	}

	public void setSystem(System system)
	{
		this.system = system;
	}
}
