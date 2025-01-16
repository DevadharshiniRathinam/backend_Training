package Day12;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
public class Buffers {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.putInt(10);
        buffer.flip();
        System.out.println(buffer.getInt());
        CharBuffer charBuffer = CharBuffer.allocate(20);
        charBuffer.put("Hello World");
        charBuffer.flip();
        while(charBuffer.hasRemaining()) {
            System.out.println(charBuffer.get());
        }

    }

}
