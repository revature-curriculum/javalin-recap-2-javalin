import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {

    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {config.addStaticFiles("/public", Location.CLASSPATH);}).start(4100);

    }
}
