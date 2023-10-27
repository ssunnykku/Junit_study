package study.TDD.John;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour() {
        var calculator = new SimpleCalculator(); // 자바 10 이후로 타입 추론 가능
                          //결과 ,     계산
        assertEquals(4,calculator.add(2,2));
//        assertNotEquals();
//        assertTrue(calculator.add(2,2)==4);
//        assertFalse();
//        assertNull();

        // 2 * 2 와 2 + 2가 같기 때문에 연산을 바꾸어도 성공한다.
        // 더 많은 단위 테스트를 추가해야 한다.
    }

    @Test
    void threePlusSevenShouldEqualTen() {
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3,7));
    }

}