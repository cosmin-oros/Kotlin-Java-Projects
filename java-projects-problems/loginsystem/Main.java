package LoginSystem;

public class Main {
    public static void main(String[] args){
        IDandPasswords idandPassword = new IDandPasswords();
        LoginPage loginPage = new LoginPage(idandPassword.getLoginInfo());
    }
}
