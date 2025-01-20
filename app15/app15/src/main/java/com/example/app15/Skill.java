package com.example.app15;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Skill {
	@Id
	private Integer id;
	private String skillName;
	private String skillDesc;
	@ManyToMany(mappedBy = "skills")
    @JsonIgnore
	private Set<Student> Students = new HashSet<Student>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillDesc() {
		return skillDesc;
	}
	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}
	public Set<Student> getStudents() {
		return Students;
	}
	public void setStudents(Set<Student> students) {
		Students = students;
	}


}
