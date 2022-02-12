package stringex;

import java.util.StringTokenizer;

//토큰 token:더이상 분해할 수 없는 의미를 가지는 단위
public class StringTokenizerEx {

	public static void main(String[] args) {
		String str="학교,집,학원,pc방,식당,도서관";
		String [] values=str.split(",");//-->구분자를 하나만 사용.
		for(int x=0;x<values.length;x++) {
			System.out.println(values[x]);
		}
		
//-------------------1------------------------------------		
//		String str="학교,집,학원,,pc방#식당$도서관";
//		
//		StringTokenizer tokens=new StringTokenizer(str, ",#$"); //-->구분자: ,#$로 하겠다.
//		//파싱: 구분자로 뽑아내는것
//		System.out.println("파싱한 문자열의 수 : "+tokens.countTokens()); //현재 문자열의 토큰수 리턴
////		while(tokens.hasMoreTokens()) {//이터레이트의 hasNext와 같은 기능. 한바퀴 돌고나면 끝
////			System.out.println(tokens.nextToken());
////		}
//		while(tokens.hasMoreElements()) {//이터레이트의 hasNext와 같은 기능. 한바퀴 돌고나면 끝
//			System.out.println(tokens.nextElement());
//		}
	}

}
