package shablon;

import java.io.Closeable;
import java.io.IOException;

public class Car implements Closeable{

    @Override
    public void close() throws IOException {
        System.out.println("Машина жабылып жатат");
    }
    public void drive() {
        System.out.println("Машина журуп жатат");
    }

}
