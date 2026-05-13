package TestPractice;

/**
 * 날짜 : 2026.05.11
 * 이름 : 김민찬
 * 내용 : throw와 throws 실습하기
 */
public class anything {

    // 1. 돈을 이체하는 메서드 (throws를 통해 에러가 발생할 수 있음을 경고)
    public void transfer(int money) throws Exception {
        
        if (money <= 0) {
            // 2. 실제로 에러 객체를 생성해서 던짐 (throw)
            throw new Exception("0원 이하는 보낼 수 없어요. 입력된 금액: " + money);
        }
        
        System.out.println(money + "원 전송 완료!");
    }

    public static void main(String[] args) {
        anything test = new anything();

        // 3. throws가 붙은 메서드를 호출할 때는 반드시 try-catch로 감싸야 합니다.
        try {
            System.out.println("--- 첫 번째 시도 (정상) ---");
            test.transfer(5000); // 정상 작동
            
            System.out.println("\n--- 두 번째 시도 (에러 발생) ---");
            test.transfer(-100); // 여기서 throw가 실행되어 catch 블록록으로 점프!
            
            System.out.println("이 코드는 실행되지 않습니다."); // 에러 발생 시 건너뜀
            
        } catch (Exception e) {
            // 4. throw가 던진 에러 박스를 여기서 받아서 처리
            System.err.println("에러 발생 메세지: " + e.getMessage());
        }

        System.out.println("\n프로그램이 안전하게 종료되었습니다.");
    }
}