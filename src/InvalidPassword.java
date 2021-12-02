public class InvalidPassword extends Exception{
    public InvalidPassword(){
        super("Invalid Password");
    }

    public InvalidPassword(String message) {
        super(message);
    }

}
