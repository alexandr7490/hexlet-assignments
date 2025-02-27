package exercise;

import exercise.model.Address;
import exercise.annotation.Inspect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {
        var address = new Address("London", 12345678);

        // BEGIN
for (Method ad : Address.class.getDeclaredMethods()){
    if (ad.isAnnotationPresent(Inspect.class)){
        String type=ad.getReturnType().toString();
        String[] words = type.split("\\.");
        type=words[words.length-1];
        System.out.println("Method " + ad.getName() + " returns a value of type " + type);

    }
}
        // END
    }
}
