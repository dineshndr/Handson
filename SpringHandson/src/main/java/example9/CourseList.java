package example9;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Component;


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
	public void revenue() {
		double revenue = 0;
		double total =0;
		for(Course cours : this.courseList) {
			total= 0.2 * cours.getFee()*200;
			revenue=revenue+total;
		}
		System.out.println("Total Revenue is "+revenue );
	}
}
