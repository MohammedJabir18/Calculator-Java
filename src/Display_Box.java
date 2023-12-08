import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Display_Box {
    JFrame frame;
    void secondaryBox(JFrame frame){
        JTextField secondaryField=new JTextField();
        secondaryField.setBounds(24,50,338,30);
        secondaryField.setBorder(new MatteBorder(2, 2, 0, 2, Color.BLACK));
        secondaryField.setHorizontalAlignment(JTextField.RIGHT);
        Font secondaryBoxFont=secondaryField.getFont().deriveFont(Font.BOLD,14);
        secondaryField.setFont(secondaryBoxFont);
        secondaryField.setEditable(true);
        secondaryField.setBackground(Color.WHITE);
        secondaryField.setForeground(new Color(0xA8000000, true));
        frame.add(secondaryField);
        this.frame=frame;
    }
    void primaryBox(){
        JTextField primaryField=new JTextField();
        primaryField.setBounds(24,80,338,35);
        primaryField.setBorder(new MatteBorder(0, 2, 2, 2, Color.BLACK));
        primaryField.setHorizontalAlignment(JTextField.RIGHT);
        Font primaryBoxFont=primaryField.getFont().deriveFont(Font.BOLD,20);
        primaryField.setFont(primaryBoxFont);
        frame.add(primaryField);
    }
}
