
package com.cognizant.springjdbc.dao;
import java.util.List;

import com.cognizant.springjdbc.entity.Student;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int update(Student student);

	public int delete(int id);
	
	public Student getStudent(int id);
	
	public List<Student> getAllStudent();
}
