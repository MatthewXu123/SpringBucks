package com.matthew.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.money.Money;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "T_MENU")
@Builder
@Data
//不加callsuper，只会打印当前类。
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Coffee extends BaseEntity implements Serializable{

	private static final long serialVersionUID = -993391063832586801L;
	
	private String name;
	
	@Column
	//如果用PersistentMoneyMinorAmount，那么数据类型会从decimal变成bigint
	@Type(type = "org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyAmount", 
	parameters = {@org.hibernate.annotations.Parameter(name = "currencyCode",value = "CNY")})
	private Money price;
}
