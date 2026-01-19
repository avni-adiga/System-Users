public class Password
{
    private String password;
    
    public Password(String pass)
    {
        password = pass;
    }
    public String getPassword()
    {
        return password;
    }
    public String toString()
    {
        return "Password: " + password;
    }
    
}