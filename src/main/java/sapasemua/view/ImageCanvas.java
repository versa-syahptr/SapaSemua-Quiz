/*
 * Class: sapasemua.view.ImageCanvas
 * Super: java.awt.Canvas
 * Desc : Draw image on canvas from bytearray or Base64 encoded string
 */
package sapasemua.view;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Base64;
import javax.imageio.ImageIO;

/**
 *
 * @author versa
 */
public class ImageCanvas extends Canvas {
    private byte[] imageBytes;
    
    // Constructor
    public ImageCanvas() {
        this.imageBytes = null;
    }

    // Set the image bytes
    public void setImageBytes(byte[] imageBytes) {
        this.imageBytes = imageBytes;
        // Trigger a repaint when the image bytes are set
        repaint();
    }
    
    public void setImageFromB64String(String b64s){
        setImageBytes(Base64.getDecoder().decode(b64s));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (imageBytes != null) {
            // Create an Image from the byte array
            Image decodedImage = createImageFromBytes(imageBytes);
            
            // Get the dimensions of the canvas
            int canvasWidth = getWidth();
            int canvasHeight = getHeight();

            // Get the dimensions of the image
            int imageWidth = decodedImage.getWidth(this);
            int imageHeight = decodedImage.getHeight(this);

            // Calculate the scale factors to fit the image within the canvas
            double scaleX = (double) canvasWidth / imageWidth;
            double scaleY = (double) canvasHeight / imageHeight;

            // Use the minimum scale factor to maintain aspect ratio
            double scale = Math.min(scaleX, scaleY);

            // Calculate the scaled dimensions
            int scaledWidth = (int) (imageWidth * scale);
            int scaledHeight = (int) (imageHeight * scale);

            // Calculate the position to center the image on the canvas
            int x = (canvasWidth - scaledWidth) / 2;
            int y = (canvasHeight - scaledHeight) / 2;

            // Draw the scaled image on the canvas
            g.drawImage(decodedImage, x, y, scaledWidth, scaledHeight, this);
        }
    }

    private Image createImageFromBytes(byte[] imageBytes) {
        try {
            // Create an Image from the byte array
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageBytes);
            return ImageIO.read(byteArrayInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
