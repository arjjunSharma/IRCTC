package ticket.booking.util;
import org.jetbrains.annotations.NotNull;
import org.mindrot.jbcrypt.BCrypt;
public class UserServiceUtil{

    public  static @NotNull String hashPassword(String plainPassword){
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());

    }
    public static boolean checkPassword(String plainPassword , String hashedPassword)
    {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
}
