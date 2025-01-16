package Day12;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
public class Buffers {
    public static void main(String[] args) {
        ByteBuffer buffers = ByteBuffer.allocate(10);
        buffers.putInt(10);
        buffers.flip();
        System.out.println(buffers.getInt());
        CharBuffer charBuffer = CharBuffer.allocate(20);
        charBuffer.put("Hello World");
        charBuffer.flip();
        while(charBuffer.hasRemaining()) {
            System.out.println(charBuffer.get());
        }

    }

}
