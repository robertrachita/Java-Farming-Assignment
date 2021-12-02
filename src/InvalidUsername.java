public class InvalidUsername extends Exception{
    public InvalidUsername(){
        super("This username is already taken");
    }

    public InvalidUsername(String message) {
        super(message);
    }

}