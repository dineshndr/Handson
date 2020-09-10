import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Main {

	public static void main(String args[]) throws NumberFormatException, IOException {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many films are there ??");
		n = Integer.parseInt(br.readLine());
		Film[] filmArray = new Film[n];
		List <Songs> songList  = new ArrayList<>();
 		for(int i=0;i<n;i++) {
			System.out.println("Enther the film id,name details :");
			String film = br.readLine();
			String[] s = film.split(",");
			filmArray[i] = new Film(Integer.parseInt(s[0]),s[1]);
			System.out.println("How many songs are there in "+filmArray[i].getName());
			int ns;
			ns= Integer.parseInt(br.readLine());
			System.out.println("Enter the songs name,singer details: ");
			for(int j=0;j<ns;j++) {
				String song = br.readLine();
				String[] str = song.split(":");
				songList.add(new Songs(Integer.parseInt(str[0]),str[1],str[2],filmArray[i].getId()));				
			}	
		}
 		System.out.println("Enter film name: ");
 		String film_name = br.readLine();
 		for(Film f: filmArray) {
 			if(f.getName().equals(film_name)) {
 				int fid = f.getId();
 				for(Songs s : songList) {
 					if(fid == s.getFilm_id()) {
 						System.out.println("Song Name is: "+s.getName());
 						System.out.println("Singer name is: "+s.getSinger());
 					}
 				}
 			}
 		}
 		
	}
}
