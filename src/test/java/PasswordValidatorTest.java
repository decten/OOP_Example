
/*
 * 비밀번호는 최소 8자 이상 12자 이하
 * 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외
 * 경계 조건에 대한 테스트 코드
 */

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않는다 ")
    @Test
    void validatePasswordTest() {
        assertThatCode(()->PasswordValidator.validate("severwizard"))
            .doesNotThrowAnyException();
    }
}
