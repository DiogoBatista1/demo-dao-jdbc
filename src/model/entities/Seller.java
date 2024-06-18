package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {
	private Integer Id;
	private String email;
	private String name;
	private Date birthDate;
	private double salary;
	
	private Department department;
	
	public Seller() {
		
	}

	public Seller(Integer id, String email, String name, Date birthDate, double salary, Department department) {
		Id = id;
		this.email = email;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
		this.department = department;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "Seller [Id=" + Id + ", email=" + email + ", name=" + name + ", birthDate=" + birthDate + ", salary="
				+ salary + ", department=" + department + "]";
	}
	
	
}
