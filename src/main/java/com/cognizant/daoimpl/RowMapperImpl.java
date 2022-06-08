package com.cognizant.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cognizant.springjdbc.entity.Student;

public class RowMapperImpl  implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(rs.getInt(3));
		student.setFname(rs.getString(1));
		student.setLname(rs.getString(2));
		return student;
	}

}
