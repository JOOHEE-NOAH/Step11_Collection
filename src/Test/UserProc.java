package Test;
//입력한 아이디 비번을 여기서 검사해서 vo객체 리턴해주는 곳

//비즈니스 로직
public class UserProc {
/*getLoginUser()를 만들어주세요
 * 매개변수로 들어온 id와 "pororo",pw와"1234"와 비교하여
 * 맞으면 entity객체를 만들어(usermain에서)
 * setter를 통해 id,pw, "뽀로로", 89.97을 대입하세요
 * 
 * entity를 리턴하세요
  */	
	public User getLoginUser(String id,String pw) {
//			User entity=new User(); //--> null의 상태가 아닌 객체가 생성된 상태
//		if(id.equals("pororo")&&pw.equals("1234")) {
//				 
//				entity.setId(id);
//				entity.setPw(pw);
//				entity.setName("뽀로로");
//				entity.setPoint(89.97);
//				
//				return entity;
//			}else {
//					System.out.println("ID 또는 PW가 잘못되었거나 존재하지 않는 ID입니다");
//				}
//				}
//	}				
				User entity=null; //null의 상태로 변수 선언
				if(id.equals("pororo")&&pw.equals("1234")) {
					entity=new User(); //변수가 null의 상태가 아님
					entity.setId(id);
					entity.setPw(pw);
					entity.setName("뽀로로");
					entity.setPoint(89.97);
				
				}
					return entity;
				
	}
	}
