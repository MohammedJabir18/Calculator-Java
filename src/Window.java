import javax.swing.*;
import java.awt.*;

public class Window {
    JFrame guiWindow(){
        JFrame frame = new JFrame("CALCULATOR");
        frame.setLayout(null);
        frame.setBounds(400, 100, 339, 510);
        frame.getContentPane().setBackground(new Color(231,222,205));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon titleIcon = new ImageIcon("Image/calculator.png");
        frame.setIconImage(titleIcon.getImage());
        return frame;
    }
}
