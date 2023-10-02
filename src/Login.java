import java.util.Scanner;
public class Login {
    public Login(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }



    //login, password, confirmPassword.
    String login;
    String password;
    String confirmPassword;

   public static boolean loginToAccount(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
       if (login == null || login.length() >= 20 || login.contains(" ")) {
           throw new WrongLoginException("Неверный логин");
       }

       if (password == null || password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
           throw new WrongPasswordException("Неверный пароль");
       }

       if (!password.equals(confirmPassword)) {
           throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают");
       }
       return true;
    }

}
