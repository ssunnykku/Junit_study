package study.woowaprecorse6;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;


class SetCollectionTest {

    SetCollection setCollection = new SetCollection();
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }
// 요구사항 1 : Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현
    @Test
    void check_size() {
    int result = setCollection.setSize(numbers);
    assertThat(result).isEqualTo(3);

    }
    /** 요구사항 2 : Set의 contains() 메소드를 활용해 1,2,3의 값이 존재하는지를 확인하는 학습테스트를 구현\
    * JUnit의 ParameterizedTest를 활용해 중복 코드를 제거하기
     */
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void contains1(int number) {
        assertTrue(numbers.contains(number));
    }

    /**
     * 요구사항 3
     * 입력 값에 따라 결과값이 다른 경우에 대한 테스트도 가능하도록 구현하기
     * ex) 1,2,3 값은 contains 메소드 실행 결과 true, 4, 5 값을 넣으면 false가 반환되는 테스트를 하나의 Test Case로 구현한다.
     * */

    @ParameterizedTest
    @CsvSource(value = {"2:true", "3:true", "4:false", "5:false"}, delimiter= ':')
    void contains2(int input, boolean expected) {
        boolean result = numbers.contains(input);
        assertEquals(expected,result);
    }
}