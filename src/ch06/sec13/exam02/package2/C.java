package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.*;

public class C {
    // 필드 선언
    A a1 = new A(true);       // O (public 생성자)

    // 아래 둘은 “컴파일 에러 예시”라서 실제 코드에 두면 안 됨
    // A a2 = new A(1);        // X (default 생성자라 다른 패키지에서 접근 불가)
    // A a3 = new A("문자열");  // X (private 생성자라 외부에서 접근 불가)
}
