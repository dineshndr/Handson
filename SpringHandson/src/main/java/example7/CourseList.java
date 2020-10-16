package example7;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class CourseList {
	private List<Course> courseList = new ArrayList();
public CourseList()
{
	
}
public CourseList(List<Course> courseList) {
	super();
	this.courseList = courseList;
}
public List<Course> getCourseList() {
	return courseList;
}
public void setCourseList(List<Course> courseList) {
	this.courseList = courseList;
}
public void insert(Course course)
{
	
	this.courseList.add(course);
}
public ArrayList<String> noOfCourse(double budget)
{
	ArrayList<String> nc = new ArrayList();
	int flag=0;
	for(Course c:this.courseList) 
	{
		if(c.getFee()==budget) 
		{
			String msg = c.getName()+"-1";
			nc.add(msg);
		}
		else if(c.getFee()<budget)
		{
			double fees=c.getFee();
			int no = (int)(budget/fees);
			String msg = c.getName()+"-"+no;
			nc.add(msg);
		}
		else if(c.getFee()>budget)
		{
			flag++;
		}
	}
	if(flag==3) System.out.println("no courses are applicable");
	return nc;
	}
}
