package study.testCode.exercise;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class PasswordMeterTest {

    private PasswordMeter passwordMeter = new PasswordMeter();

    @DisplayName("null 입력이면 익셉션 발생")
    @Test
    void nullInput() {
        Assertions.assertThatIllegalArgumentException()
                .isThrownBy(() -> passwordMeter.meter(null));
    }

    @DisplayName("빈값 입력이면 익셉션 발생")
    @Test
    void emptyInput() {
        Assertions.assertThatIllegalArgumentException()
                .isThrownBy(() -> passwordMeter.meter(""));

    }
    private PasswordStrength assertPasswordStrength(String password, PasswordStrength expected) {
        PasswordStrength result = passwordMeter.meter(password);
        assertThat(result).isEqualTo(expected);
        return result;
    }

    @DisplayName("모든 조건을 충족하면 강함")
    @Test
    void meetAllRules() {
        assertPasswordStrength("abdABC123", PasswordStrength.STRONG);
        assertPasswordStrength("123abdABC", PasswordStrength.STRONG);
    }

    @DisplayName("길이가 8미만, 다른 조건 충족")
    @Test
    void digitAndUppercase() {
        assertPasswordStrength("abcC123", PasswordStrength.NORMAL);
        assertPasswordStrength("123abcC", PasswordStrength.NORMAL);
        assertPasswordStrength("Cabc12", PasswordStrength.NORMAL);
    }

    @DisplayName("대문자 없음, 다른 조건 충족")
    @Test
    void digitAndLength() {
        assertPasswordStrength("abcd1234", PasswordStrength.NORMAL);
        assertPasswordStrength("1234abcdwefw", PasswordStrength.NORMAL);
    }

    @DisplayName("숫자 없음, 다른 조건 충족")
    @Test
    void uppercaseAndLength(){
        assertPasswordStrength("ABCDabcde", PasswordStrength.NORMAL);
        assertPasswordStrength("abcdeABCDEEF", PasswordStrength.NORMAL);
    }

    @DisplayName("길이만 충족")
    @Test
    void length() {
        assertPasswordStrength("abcdqwerqw", PasswordStrength.WEAK);
    }

    @DisplayName("대문자만 충족")
    @Test
    void uppercase() {
        assertPasswordStrength("abcABC", PasswordStrength.WEAK);
    }

    @DisplayName("숫자만 충족")
    @Test
    void digit() {
        assertPasswordStrength("abc123", PasswordStrength.WEAK);
        assertPasswordStrength("123abc", PasswordStrength.WEAK);
    }

    @DisplayName("아무것도 충족하지 않음")
    @Test
    void nothing() {
        assertPasswordStrength("asc", PasswordStrength.WEAK);
    }
}

