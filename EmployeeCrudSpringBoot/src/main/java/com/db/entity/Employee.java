package com.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee_table")
public class Employee {

	@Id
	@GeneratedValue(generator = "emp")
	@GenericGenerator(name = "emp", strategy = "increment")
	@Column(name = "id")
	private Integer empId;

	@Column(name = "name")
	private String empName;

	@Column(name = "salary")
	private Double empSal;

	@Column(name = "department")
	private String empDept;

	@Column(name = "gender")
	private String empGen;

	public Employee() {

	}

	public Employee(Integer empId, String empName, Double empSal, String empDept, String empGen) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
		this.empGen = empGen;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpGen() {
		return empGen;
	}

	public void setEmpGen(String empGen) {
		this.empGen = empGen;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

}
