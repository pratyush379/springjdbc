package com.cognizant.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cognizant.daoimpl.RowMapperImpl;
import com.cognizant.springjdbc.entity.Student;

public class StudentDaoImp implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into student(roll,fname,lname) values(?,?,?);";
		int r= this.jdbcTemplate.update(query,student.getId(),student.getFname(),student.getLname());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int update(Student student) {
		// TODO Auto-generated method stub
		String query = "update student set lname=? where roll=?";
		int r = this.jdbcTemplate.update(query,student.getLname(),student.getId());
		return r;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		String query = "delete from student where roll=?";
		int r = this.jdbcTemplate.update(query,id);
		return r;
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		String query = "select * from student where roll=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, id);
		return student;
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		String query = "select * from student";
		List<Student> student = this.jdbcTemplate.query(query,new RowMapperImpl());
		return student;
	}

}