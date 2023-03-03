public class WrongFixedPasswordGenerator implements PasswordGeneratorInterface{

    @Override
    public String generatePassword() {
        return "ab"; //2글자
    }
}
