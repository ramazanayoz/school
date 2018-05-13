package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Course {
	
	private String code;
	private String name;
	
	Map<Student,Integer> students = new TreeMap<>(new IdComparator());
	Map<Integer,Student> idMap = new HashMap<>(); 
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	
	
	public void addStudent(Student student) {
		students.put(student, null);
		idMap.put(student.getId(), student);
		
	}
	public Set<Student> listStudentsOrderById() {
		
		return students.keySet();
	}
	public Set<Student> listStudentsOrderByName() {
		Set<Student> result = new TreeSet<>(new NameComparator());
		result.addAll(students.keySet());
		return result;
	}
	public Set<Student> listStudentsOrderBySurname() {
		Set<Student> result = new TreeSet<>(new SurnameComparator());
		result.addAll(students.keySet());
		return result;
	}
	public Student getStudent(int id) {
		return idMap.get(id);
	}
	public void setGrade(Student student, int grade) {
		students.put(student, grade);
		
	}
	public Map<Student, Integer> listStudentGradesOrderbyId() {
		return students;
	}
	public Map<Student, Integer> listStudentGradesOrderbyName() {
		Map<Student, Integer> result = new TreeMap<>(new NameComparator());
		result.putAll(students);
		return result;
	}
	public Map<Student, Integer> listStudentGradesOrderbyGrade() {
		Set<Entry<Student,Integer>> set = new TreeSet<>(Collections.reverseOrder(new EntryComparator()));
		set.addAll(students.entrySet());		
		
		Map<Student,Integer>  result = new LinkedHashMap<>();
		for(Entry<Student,Integer> entry: set){
			result.put(entry.getKey(), entry.getValue());
		}
		
		return result;
	}
	
	public String toString(){
		return "Course = " + code + " " + name;
	}

}
