package study.woowaprecorse6;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class StringClassTest {

    StringClass stringClass = new StringClass();

    // 요구사항 1
    // "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트 : contains()
    @Test
    void split_test1() {
        String[] result = stringClass.makeArray("1,2");
        assertThat(result).contains("1");
        assertThat(result).contains("2");
    }

    // "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트 : containsExactly()
    @Test
    void split_test2() {
        String[] result = stringClass.makeArray("1");
        assertThat(result).containsExactly("1");
    }

    // 요구사항 2
//    "(1,2)" 값이 주어졌을 때 String의 substring()메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.
    @Test
    void substring_test() {
        String result = stringClass.deleteParenthesis("(1,2)");
        assertThat(result).isEqualTo("1,2");
    }

    // 요구사항 3
    // 1. "abc"값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트 구현
    @Test
    void charAt_test() {
        String result = stringClass.getWordFromIndex(0, "abc");
        assertThat(result).isEqualTo("a");
    }

    // 2. String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면
    // StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
    // 3. JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.
    @Test
    @DisplayName("입력된 단어의 크기보다 큰 index를 입력하면 exception")
    void charAt_exception() {
        assertThatThrownBy(()-> stringClass.getWordFromIndex(4,"abc")).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("Index: 4, Size: 3");
    }

}