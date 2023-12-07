import javax.swing.*;
import java.awt.*;

public class Dark_Light_Mode {
    ImageIcon imageIcon; JFrame frame; JToggleButton DLButton;
    void dark_light_Button(JFrame frame){
        imageIcon =new ImageIcon("Image/light.png");
        Image image = imageIcon.getImage();
        Image newimage = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimage);
        DLButton = new JToggleButton(imageIcon);
        DLButton.setBounds(10,10,50,50);
        frame.add(DLButton);
        this.frame=frame;

        DLButton.addItemListener(e -> {
            if (DLButton.isSelected()){
                ImageIcon darkImageIcon = new ImageIcon("Image/moon.png");
                Image darkImage = darkImageIcon.getImage();
                Image darkNewImage = darkImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                darkImageIcon = new ImageIcon(darkNewImage);
                DLButton.setIcon(darkImageIcon);

                frame.getContentPane().setBackground(new Color(27, 36, 48));
            }
            else {
                imageIcon = new ImageIcon("Image/light.png");
                Image lightImageIcon = imageIcon.getImage();
                Image lightImage = lightImageIcon.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                imageIcon = new ImageIcon(lightImage);
                DLButton.setIcon(imageIcon);

                frame.getContentPane().setBackground(new Color(231,222,205));
            }
        });
    }
}
