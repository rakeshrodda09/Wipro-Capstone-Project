package testdata;
import java.util.UUID;

public class TestData {
    public static String username = "user" + UUID.randomUUID().toString().substring(0,5);
    public static String password = "pass123";
}
