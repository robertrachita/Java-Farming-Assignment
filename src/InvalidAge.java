public class InvalidAge extends Exception{
    public InvalidAge(){
        super("Too old");
    }

    public InvalidAge(String message) {
        super(message);
    }

}