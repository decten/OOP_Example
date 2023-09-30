public class CorrectFixedPasswordGenerator implements PasswordGeneratorInterface{

    @Override
    public String generatePassword() {
        return "abcdefgh"; //8글자
    }
}
