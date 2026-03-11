package utils;

import java.util.UUID;

public class RandomDataUtil {

    public static String generateUsername()
    {
        return "user"+UUID.randomUUID().toString().substring(0,5);
    }

}
