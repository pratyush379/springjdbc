package com.cognizant.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cognizant.springjdbc.dao.StudentDao;
import com.cognizant.springjdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	System.out.println( "Hello World!" );
        
//    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//    	
//    	JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate", JdbcTemplate.class);
//    	
    	/*String query="insert into student(fname,lname,roll) values(?,?,?)";
    	
    	int result=jdbcTemplate.update(query,"Rahul","kumar",101);
    	int result1=jdbcTemplate.update(query,"Rajarshi","kumar",103);
    	
    	System.out.println("insert successfuly "+result);
    	System.out.println("insert successfuly "+result1);*/
    	
    	/*String query = "update student set roll=? where fname='Pratyush'";
    	int result=jdbcTemplate.update(query,106)*/
    	/*String query = "delete from student where roll=?";
    	int result=jdbcTemplate.update(query,101);*/
        /*String query="insert into student(fname,lname,roll) values(?,?,?)";
    	
    	int result=jdbcTemplate.update(query,"Rahul","kumar",101);*/
    ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
   	StudentDao studentDao =context.getBean("studentDao", StudentDao.class);
   	
   	/*Student stud = new Student();
   	stud.setId(110);
   	stud.setFname("Ritesh");
   	stud.setLname("Raman");
   	
   	int result = studentDao.insert(stud);
   	System.out.println("Student addedd "+result);*/
   	
   	/*Student stud = new Student();
   	stud.setId(101);
    stud.setLname(" ");
   int result =  studentDao.update(stud);
    System.out.println("Student updated "+result);*/
   	
   /*	Student stud = new Student();
   int result =  studentDao.delete(101);
    System.out.println("Student updated "+result);*/
   	
   /*	Student student = studentDao.getStudent(106);
   	System.out.println(student);*/
   	
   	List<Student> students = studentDao.getAllStudent();
   	for(Student stu:students) {
   		System.out.println(stu);
   	}
   	
    	
    	
    	
    }
}
