import java.util.HashSet;

public class Storage {
    private HashSet<User> users;

    public Storage() {
        this.users = new HashSet<>();
    }

    public HashSet<User> getUsers() {
        return users;
    }

    public void setUsers(HashSet<User> users) {
        this.users = users;
    }

    public void addUsers(User user){
        this.users.add(user);
    }

    public Boolean checkIfUsernameExists(User user){
        for (User userToCompare : this.users) {
                if(userToCompare.getUsername().contentEquals(user.getUsername()))
                    return true;
        }
        return false;
    }
}
