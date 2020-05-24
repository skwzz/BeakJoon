package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q1181{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String[] arr = new String[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		Comparator<String> strComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
            	int temp = o1.length() - o2.length();
            	if(temp==0) {
            		
            	}
                return o1.length() - o2.length();
            }
        };

        Arrays.sort(arr, strComparator);
        int i, j = 0;
        for(i=0; i<arr.length; i++) {
        	int len = arr[i].length();
        	
        	for(j=i+1; j<arr.length; j++) {
        		int temp = arr[j].length();
        		if(len != temp) {
        			break;
        		}
        	}
        	Arrays.sort(arr, i, j);
        	i = j-1;
        }
        
        for(int k=0; k<arr.length; k++) {
        	if(k==0) {
        		System.out.println(arr[k]); 
        	}else {
        		if(!arr[k-1].equals(arr[k])) {
        			System.out.println(arr[k]);
        		}
        	}
        }
	}
}
