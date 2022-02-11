package collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MapEx5 {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("해리포터", "객실4");
		map.put("덤블도어", "객실1");
		map.put("론위즐리", "객실3");
		map.put("드레이코말포이", "객실2");
		map.put("볼드모트", "객실5");
		
	//	System.out.println(map.get("해리포터"));
		Scanner sc=new Scanner(System.in);
		System.out.print("방 번호를 입력하세요(객실1 ~ 객실5) : ");
		String room=sc.next();
//		
//		Set<String> col=map.keySet();
//	//	System.out.println(col);
//		for(String key:col) {
//			String rroom=map.get(key);
//			
//			if(rroom.equals(room))
//				System.out.println(room+"에 투숙한 고객은 "+key+"입니다");
//		}
		
		//이터레이터를 이용하여 결과를 출력해주세요.
		Set<String> col=map.keySet();//키 부분의 목록 뽑기
	//	System.out.println(col);
		Iterator<String> iter=col.iterator();
		while(iter.hasNext()){//iter가 존재 한다면,
			String key=iter.next();
			String rroom=map.get(key); //이터에서 꺼낸 데이터로 결과를 뽑겠다.
			if(rroom.equals(room))
				System.out.println(room+"에 투숙한 고객은 "+key+"입니다");
		}
		
		
		
		//		Iterator<String> col=map.keySet();
	//	System.out.println(col);
//		while(rroom.hasNext()) {
//			String key=rroom.next();
//			System.out.println(room+"에 투숙한 고객은 "+rroom.next()+"입니다");
//		}
	}

}
