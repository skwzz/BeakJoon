package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q10814 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		Tag[] arr = new Tag[num];
		int tAge;
		String tName;
		for(int i=0; i<arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			tAge = Integer.parseInt(st.nextToken());
			tName = st.nextToken();
			arr[i] = new Tag(tAge, tName);
		}
		
		Comparator<Tag> myComparator = new Comparator<Tag>() {
			@Override
			public int compare(Tag o1, Tag o2) {
				if(o1.age>o2.age) {
					return 1;
				}else if(o1.age == o2.age){
					return o1.name.compareTo(o2.name);
				}else{
					return -1;
				}
			}
		};
		
		Arrays.sort(arr, myComparator);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].age+" "+arr[i].name);
		}
	}
}
class Tag{
	int age;
	String name;
	
	public Tag(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
