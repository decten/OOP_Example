public class User {
    private String password;

    public void initPassword(PasswordGeneratorInterface passwordGeneratorInterface){
        /* 몇 글자의 password를 생성할지 모르기 때문에 테스트 통과/실패가 달라짐
        as-to
        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        */
        //to-be
        String password = passwordGeneratorInterface.generatePassword();

        /*
        *비밀번호는 8자 이상 12자 이하여야 한다.
        *조건이 만족할 때만 비밀번호 할당
        */

        if (password.length() >= 8 && password.length() <= 12){
           this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
