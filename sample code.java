public class Account {
    public void Login(LoginModel loginInfo){
	..........................
    }
    public void Logout(){
	...........................
    }
}

public class GoogleAccount extends Account{
    public void Login(LoginModel loginInfo){
	..........................
    }
    public void Logout(){
	..........................
    }
}

public class FacebookAccount extends Account{
    public void Login(LoginModel loginInfo){
	...........................
    }
    public void Logout(){
	...........................
    }
}
public class AccountTest{
    private Account account;
    private GoogleAccount googleAccount;
    private FacebookAccount facebookAccount;
    @Before
    public void setUp() throws Exception {
        account = new Account();
        googleAccount = new GoogleAccount();
        facebookAccount = new FacebookAccount();
    }
    @Test
    public void testLogin() {
        boolean logged = account.login();
        assertEquals(added, true);
    }
}
