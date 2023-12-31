import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Display_Box {
    JFrame frame;
    JTextField secondaryBox(JFrame frame){
        JTextField secondaryField=new JTextField();
        secondaryField.setBounds(24,50,279,30);
        secondaryField.setBorder(new MatteBorder(2, 2, 0, 2, Color.BLACK));
        secondaryField.setHorizontalAlignment(JTextField.RIGHT);
        Font secondaryBoxFont=secondaryField.getFont().deriveFont(Font.BOLD,14);
        secondaryField.setFont(secondaryBoxFont);
        secondaryField.setEditable(false);
        secondaryField.setBackground(Color.WHITE);
        secondaryField.setForeground(new Color(0xA8000000, true));
        frame.add(secondaryField);
        this.frame=frame;
        return secondaryField;
    }
    JTextField primaryBox(){
        JTextField primaryField=new JTextField("0");
        primaryField.setBounds(24,80,279,35);
        primaryField.setBorder(new MatteBorder(0, 2, 2, 2, Color.BLACK));
        primaryField.setHorizontalAlignment(JTextField.RIGHT);
        Font primaryBoxFont=primaryField.getFont().deriveFont(Font.BOLD,20);
        primaryField.setFont(primaryBoxFont);
        frame.add(primaryField);
        return primaryField;
    }
}
