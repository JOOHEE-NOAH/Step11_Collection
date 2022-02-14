package collection2;

import java.util.HashMap;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("해리포터", 95);
		map.put("덤블도어", 83);
		map.put("론위즐리", 75);
		map.put("드레이코말포이", 66);
		map.put("볼드모트", 83);
		map.put("네빌롱바텀", 69);
		map.put("앨러스터무디", 73);
		map.put("루나러브굿", Integer.valueOf(97));
		map.put("앨러스터무디", 93); //같은 키면 덮어쓰기
		map.put(null, 73);//키 값 비어있는 상태 만드는 것도 가능// null값 허용
		map.put("루시우스말포이", null);
		
		System.out.println(map);
		
		//필요한 값은 키를 가지고 검색
		System.out.println("네빌롱바텀의 성적은 "+map.get("네빌롱바텀")+"점");
		//키가 null이어도 검색가능
		System.out.println("null의 성적은 "+map.get(null)+"점");
	}

}
