package codingtest.synapsoft;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Quiz2 {
	public static void main(String[] args) throws IOException{
		String str = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		StringTokenizer st = new StringTokenizer(str, ",");
		String[] arr = new String[st.countTokens()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = st.nextToken();
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		// 1. 김씨와 이씨는 각각 몇명 인가요
		int startWithKim = 0;
		int startWithLee = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].startsWith("김")) {
				startWithKim++;
			}
			if(arr[i].startsWith("이")) {
				startWithLee++;
			}
		}
		System.out.println("김씨:"+startWithKim);
		System.out.println("이씨:"+startWithLee);
		
		// 2. 이재영이란 이름이 몇번 반복되나요
		int jaeyoungLeeCnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("이재영")) {
				jaeyoungLeeCnt++;
			}
		}
		System.out.println("재영씨 총 몇명:"+jaeyoungLeeCnt);
		
		// 3. 중복을 제거한 이름을 출력하세요
		Set<String> s = new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			s.add(arr[i]);
		}
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		
		// 4. 중복을 제거한 이름을 오름차순으로 정렬후 출력
		List<String> arr2 = new ArrayList<>(s);
		Collections.sort(arr2);
		for(int i=0; i<arr2.size(); i++) {
			System.out.print(arr2.get(i)+" ");
		}
		System.out.println("");
	}
}
