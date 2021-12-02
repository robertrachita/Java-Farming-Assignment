import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User implements Validate {
    private String password;
    private int age;
    private String email;
    private String username;

    public User(String password, int age, String email, String username) {
        this.password = password;
        this.age = age;
        this.email = email;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void validatePassword() {
//
    }

    public void validatePasswordSpaces() throws InvalidPassword {
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(this.getPassword());
        if (matcher.find()){
            throw new InvalidPassword("Password contains spaces");
        }
    }

    public void validatePasswordSpecialCharacters() throws InvalidPassword{
        String regex = "[^a-zA-Z0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(this.getPassword());
        if (!matcher.matches()){
            throw new InvalidPassword("Password contains Special Characters");
        }
    }

    public void validatePasswordNumbers() throws InvalidPassword {
        Pattern pattern = Pattern.compile(".*\\d.*");
        Matcher matcher = pattern.matcher(this.getPassword());
        if (matcher.find()){
            throw new InvalidPassword("Password contains numbers");
        }
    }

    public void validatePasswordLowerCase() throws InvalidPassword {
        for(int i=0;i<this.getPassword().length();i++) {
            if (Character.isLowerCase(this.getPassword().charAt(i))) {
                throw new InvalidPassword("Password contains a lower case symbol ");
            }
        }
    }

    public void validatePasswordUpperCase() throws InvalidPassword {
            for (int i = 0; i < this.getPassword().length(); i++) {
                if (Character.isUpperCase(this.getPassword().charAt(i))) {
                    throw new InvalidPassword("Password contains a upper case symbol ");
                }
            }
        }

    public void validateAge(int minAge) throws InvalidAge {
        if(this.getAge() <= minAge){
            throw new InvalidAge();
        }
    }

    public void validateEmail() throws InvalidEmail {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(this.getEmail());
        if (!matcher.matches()){
            throw new InvalidEmail();
        }
    }

    public void validateUsername() {

    }
}
