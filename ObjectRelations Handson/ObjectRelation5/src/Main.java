import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		System.out.println("Enter the Film Details in format of (id,name)");
		String film_details;
		int k;
		film_details = br.readLine();
		String[] film = film_details.split(",");
		System.out.println("How many Actors are there in this " + film[1]);
		k = Integer.parseInt(br.readLine());
		Actor actors[] = new Actor[k];
		for (int i = 0; i < k; i++) {
			String actor_details;
			System.out.println("Enter Actor details in the format of (id,name)");
			actor_details = br.readLine();
			String[] details_array = actor_details.split(",");
			Actor as = new Actor();
			as.setId(Integer.parseInt(details_array[0]));
			as.setName(details_array[1]);
			actors[i] = as;
		}
		Film f = new Film();
		f.setActors(actors);
		f.setFilmName(film[1]);
		System.out.println("The Film Details are : ");
		System.out.println("Film name is : " + f.getFilmName());
		System.out.println("\nActors are: ");
		for (Actor i : f.getActors()) {
			System.out.println(i.getName());
		}
	}

}
