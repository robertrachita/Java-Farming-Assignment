public interface Validate {
    public void validatePassword() throws InvalidPassword;
    public void validatePasswordSpaces() throws InvalidPassword;
    public void validatePasswordSpecialCharacters() throws InvalidPassword;
    public void validatePasswordNumbers() throws InvalidPassword;
    public void validatePasswordLowerCase() throws InvalidPassword;
    public void validatePasswordUpperCase() throws InvalidPassword;
    public void validateAge(int minAge) throws InvalidAge;
    public void validateEmail() throws InvalidEmail;
    public void validateUsername() throws InvalidUsername;
}
