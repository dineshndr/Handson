package fourth;
import java.util.*;
public class UserBO extends ArrayList{ 
	
	void removeUser(int n1,int n2)
	{
		removeRange(n1,n2);
	}
	
	void display(List<User> u)
	{
		for(User i:u)
		{
			System.out.printf("%-20s%-20s%-20s%-20s",i.getName(),i.getContactNumber(),i.getUserName(),i.getEmail());
		}
	}
	
}

