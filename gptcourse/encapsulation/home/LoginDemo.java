package gptcourse.encapsulation.home;

class Login{
    private String userName;
    private String password;

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    
}
public class LoginDemo {
    public static void main(String[] args){
        Login login = new Login();
    }
    
}
