package example8;
import java.util.List;

import javax.swing.text.DefaultStyledDocument;

import org.springframework.stereotype.Component;
import java.util.ArrayList;


@Component
public class CourseList {
	private List<Course> courseList = new ArrayList();
	public CourseList() {

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

	public void insert(Course course) {
		this.courseList.add(course);
	}
	
	public String discount()
	{
		int n = courseList.size();
		int i=0;
		double a[] = new double[n];
		
		for(Course c:this.courseList)
		{
				a[i] = c.getFee();
				i++;
		}
		double max=a[0],min=a[0];
		for(int k=1;k<a.length;k++)
		{
			if(a[k]>max)  
			{
				max = a[k];
			}
			else if(a[k]<min)
			{
				min = a[k];
			}
		}
		String high=null,low=null;
		for(Course d:this.courseList)
		{
			if(d.getFee()==max)
				{
					high=d.getName();
				}
			else if(d.getFee()==min)
			{
				low = d.getName();
			}
		
		}
		
		String ms="Discount for "+ high +" course is "+ (max/10)+" Discount for "+low+" course  is "+(min*0.05);
		return ms; 
	
	}

	
}