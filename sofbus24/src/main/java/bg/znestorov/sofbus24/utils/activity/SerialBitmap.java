package bg.znestorov.sofbus24.utils.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Bitmap that allows to be serialized
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class SerialBitmap implements Serializable {

    private static final long serialVersionUID = 1L;
    private Bitmap bitmap;

    public SerialBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    /**
     * Converts the Bitmap into a byte array for serialization
     *
     * @param out the output stream
     * @throws IOException
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteStream);
        byte bitmapBytes[] = byteStream.toByteArray();
        out.write(bitmapBytes, 0, bitmapBytes.length);
    }

    /**
     * Deserialize a byte array representing the Bitmap and decodes it
     *
     * @param in the input stream
     * @throws IOException
     */
    private void readObject(ObjectInputStream in) throws IOException {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        int b;
        while ((b = in.read()) != -1)
            byteStream.write(b);
        byte bitmapBytes[] = byteStream.toByteArray();

        bitmap = BitmapFactory.decodeByteArray(bitmapBytes, 0,
                bitmapBytes.length);
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

}