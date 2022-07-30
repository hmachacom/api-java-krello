package org.sofka.mykrello.model.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@Table(name = "krl_task")
public class TaskDomain implements Serializable {

	private static final long serialVersionUID = 1L;

	@PreUpdate
	public void preUpdate() {
		if (this.updated == null)
			this.updated = Instant.now();
	}

/* 	@ManyToOne(fetch = FetchType.LAZY, targetEntity = ColumnDomain.class, optional = false)
	@JoinColumn(name = "clm_id_column", nullable = false)
	@JsonBackReference(value = "columnReferenceTask")
	private ColumnDomain column; */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tsk_id", nullable = false)
	private Integer id;

	@Column(name = "clm_id_column", nullable = false)
	private Integer clm_id_column;

	@Column(name = "brd_id_board", nullable = false)
	private Integer id_board;

	@Column(name = "tsk_name", nullable = false)
	private String name;

	@Column(name = "tsk_description", nullable = false)
	private String tsk_description;

	@Column(name = "tsk_delivery_date", nullable = true)
	private Instant delivery_date;

	@Column(name = "tsk_created_at", nullable = false)
	private Instant created = Instant.now();

	@Column(name = "tsk_updated_at", nullable = false)
	private Instant updated = Instant.now();

}
