package com.matthew.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "T_ORDER")
@Builder
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeOrder extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 4491586563704611817L;
	private String customer;
	@ManyToMany
	@JoinTable(name = "T_ORDER_COFFEE")
	@OrderBy("id")
	private List<Coffee> items;
	@Enumerated
	@Column(nullable = false)
	private OrderState state;
}
