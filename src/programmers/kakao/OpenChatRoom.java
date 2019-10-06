package programmers.kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class OpenChatRoom {
	public static void main(String[] args) {
		
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		HashMap<String, String> hm = new HashMap<>();
		for(int i=0; i<record.length; i++) {
			String[] temp = record[i].split(" ");
			for(int j=0; j<temp.length; j++) {
				System.out.print(temp[j]+" ");
				if(!temp[0].equals("Leave")) {
					hm.put(temp[1], temp[2]);
				}
			}
			System.out.println("");
		}
		
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = hm.get(key);
			System.out.println("KEY:"+key+"   VAL:"+value);
		}
		System.out.println("========================");
		
		ArrayList<String> al = new ArrayList<>();
		for(int i=0; i<record.length; i++) {
			String[] temp = record[i].split(" ");
			String str= "" ;
			if(temp[0].equals("Enter")) {
				str = "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
			}else if(temp[0].equals("Leave")) {
				str = "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
			}else {
				continue;
			}
			String msg = hm.get(temp[1])+str;
			al.add(msg);
		}
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		String[] answer = new String[al.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = al.get(i);
		}
	}
}
