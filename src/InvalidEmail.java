public class InvalidEmail extends Exception{
    public InvalidEmail(){
        super("Wrong email");
    }

    public InvalidEmail(String message) {
        super(message);
    }

}