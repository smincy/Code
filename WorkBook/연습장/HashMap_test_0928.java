package 연습장;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashMap_test_0928 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				// id/pw 를 이용하여 로그인
		
		
		hm.put("java", "1111");
		hm.put("oracle", "1234");
		hm.put("jsp", "abcd");

		boolean flag = false;
		
		System.out.println("id/password를 입력하세요");
		String id = br.readLine();
		
		while (true) {
			if (hm.containsKey(id)) {
				System.out.print("pw : ");
				String pw = br.readLine();
				// equals > 두 문자열을 비교하여 같으면 true를, 다르면 false를 반환

				if (hm.get(id).equals(pw)) {
					System.out.println("로그인 성공!");
					System.exit(0);
				} else {
					System.out.println("비밀번호를 다시 입력해주세요");
				}
			} else {
				System.out.println("입력 id가 존재하지 않습니다.");
				flag = false;
			}

		}

	}

}
