
/*
 * 비밀번호는 최소 8자 이상 12자 이하
 * 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외
 * 경계 조건에 대한 테스트 코드 -> 여기서는 7자, 13자
 */

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PasswordValidatorTest {

    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않는다. ")
    @Test
    void validatePasswordTest() {
        /*validate 함수 조건에 맞는 비밀번호에서 예외가 발생하지 않는지 확인*/
        assertThatCode(()->PasswordValidator.validate("severwizard"))
            .doesNotThrowAnyException();
    }
    @DisplayName("비밀번호가 8자 미만 또는 12자 초과하는 경우 IllegalException 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"abcdefg","abcdefghijklm"})
    void validatePasswordTest2(String password){
        /*IllegalArgumentException 예외를 발생시키고, 제대로 오류 문구를 출력하는지 확인*/
        assertThatCode(()->PasswordValidator.validate(password))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("비밀번호는 8자 이상 12자 이하여야 한다.");
    }
}
