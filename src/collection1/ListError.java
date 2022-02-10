package collection1;

import java.util.ArrayList;
import java.util.List;

//컴파일에서는 문제가 발생하지 않지만 실행 과정에 형변환 문제 발생.
public class ListError {

	public static void main(String[] args) {
		List list=new ArrayList(); 
		
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add(Integer.valueOf(10));
		list.add("겨울");
		
		for(int i=0;i<list.size();i++) {
			String season=(String)list.get(i);//15번 라인의 데이터를 꺼내서 season에 저장하는 시점에 오류발생.
			System.out.println(season);
		}
			
	}

}
