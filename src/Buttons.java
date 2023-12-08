import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Buttons {
    JFrame frame;
    void firstRowButtons(JFrame frame){
        JButton clear=new JButton("AC");
        clear.setBounds(24,140,60,50);
        clear.setBackground(new Color(0xFF4A4A));
        clear.setForeground(new Color(0x000000));
        clear.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font clearFont=clear.getFont().deriveFont(Font.PLAIN,20);
        clear.setFont(clearFont);
        frame.add(clear);

        JButton delete=new JButton("⌫");
        delete.setBounds(97,140,60,50);
        delete.setBackground(new Color(0x8D8D8D));
        delete.setForeground(new Color(0x000000));
        delete.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font deleteFont=delete.getFont().deriveFont(Font.PLAIN,20);
        delete.setFont(deleteFont);
        frame.add(delete);

        JButton mod=new JButton("%");
        mod.setBounds(170,140,60,50);
        mod.setBackground(new Color(0x8D8D8D));
        mod.setForeground(new Color(0x000000));
        mod.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font modFont=mod.getFont().deriveFont(Font.PLAIN,20);
        mod.setFont(modFont);
        frame.add(mod);

        JButton divide=new JButton("÷");
        divide.setBounds(243,140,60,50);
        divide.setBackground(new Color(0xFFB411));
        divide.setForeground(new Color(0x000000));
        divide.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font divideFont=divide.getFont().deriveFont(Font.PLAIN,32);
        divide.setFont(divideFont);
        frame.add(divide);
        this.frame=frame;
    }
    void secondRowButtons(){
        JButton sevenButton=new JButton("7");
        sevenButton.setBounds(24,205,60,50);
        sevenButton.setBackground(new Color(0x4375FF));
        sevenButton.setForeground(new Color(0xFFFFFF));
        sevenButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font sevenButtonFont=sevenButton.getFont().deriveFont(Font.PLAIN,22);
        sevenButton.setFont(sevenButtonFont);
        frame.add(sevenButton);

        JButton eightButton=new JButton("8");
        eightButton.setBounds(97,205,60,50);
        eightButton.setBackground(new Color(0x4375FF));
        eightButton.setForeground(new Color(0xFFFFFF));
        eightButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font eightButtonFont=eightButton.getFont().deriveFont(Font.PLAIN,22);
        eightButton.setFont(eightButtonFont);
        frame.add(eightButton);

        JButton nineButton=new JButton("9");
        nineButton.setBounds(170,205,60,50);
        nineButton.setBackground(new Color(0x4375FF));
        nineButton.setForeground(new Color(0xFFFFFF));
        nineButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font nineButtonFont=nineButton.getFont().deriveFont(Font.PLAIN,22);
        nineButton.setFont(nineButtonFont);
        frame.add(nineButton);

        JButton crossButton=new JButton("x");
        crossButton.setBounds(243,205,60,50);
        crossButton.setBackground(new Color(0xFFB411));
        crossButton.setForeground(new Color(0x000000));
        crossButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font crossButtonFont=crossButton.getFont().deriveFont(Font.PLAIN,26);
        crossButton.setFont(crossButtonFont);
        frame.add(crossButton);
    }
    void thirdRowButtons(){
        JButton fourButton=new JButton("4");
        fourButton.setBounds(24,270,60,50);
        fourButton.setBackground(new Color(0x4375FF));
        fourButton.setForeground(new Color(0xFFFFFF));
        fourButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font fourButtonFont=fourButton.getFont().deriveFont(Font.PLAIN,22);
        fourButton.setFont(fourButtonFont);
        frame.add(fourButton);

        JButton fiveButton=new JButton("5");
        fiveButton.setBounds(97,270,60,50);
        fiveButton.setBackground(new Color(0x4375FF));
        fiveButton.setForeground(new Color(0xFFFFFF));
        fiveButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font fiveButtonFont=fiveButton.getFont().deriveFont(Font.PLAIN,22);
        fiveButton.setFont(fiveButtonFont);
        frame.add(fiveButton);

        JButton sixButton=new JButton("6");
        sixButton.setBounds(170,270,60,50);
        sixButton.setBackground(new Color(0x4375FF));
        sixButton.setForeground(new Color(0xFFFFFF));
        sixButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font sixButtonFont=sixButton.getFont().deriveFont(Font.PLAIN,22);
        sixButton.setFont(sixButtonFont);
        frame.add(sixButton);

        JButton minusButton=new JButton("−");
        minusButton.setBounds(243,270,60,50);
        minusButton.setBackground(new Color(0xFFB411));
        minusButton.setForeground(new Color(0x000000));
        minusButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font minusButtonFont=minusButton.getFont().deriveFont(Font.PLAIN,34);
        minusButton.setFont(minusButtonFont);
        frame.add(minusButton);
    }
    void fourthRowButtons(){
        JButton oneButton=new JButton("1");
        oneButton.setBounds(24,335,60,50);
        oneButton.setBackground(new Color(0x4375FF));
        oneButton.setForeground(new Color(0xFFFFFF));
        oneButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font oneButtonFont=oneButton.getFont().deriveFont(Font.PLAIN,22);
        oneButton.setFont(oneButtonFont);
        frame.add(oneButton);

        JButton twoButton=new JButton("2");
        twoButton.setBounds(97,335,60,50);
        twoButton.setBackground(new Color(0x4375FF));
        twoButton.setForeground(new Color(0xFFFFFF));
        twoButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font twoButtonFont=twoButton.getFont().deriveFont(Font.PLAIN,22);
        twoButton.setFont(twoButtonFont);
        frame.add(twoButton);

        JButton threeButton=new JButton("3");
        threeButton.setBounds(170,335,60,50);
        threeButton.setBackground(new Color(0x4375FF));
        threeButton.setForeground(new Color(0xFFFFFF));
        threeButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font threeButtonFont=threeButton.getFont().deriveFont(Font.PLAIN,22);
        threeButton.setFont(threeButtonFont);
        frame.add(threeButton);

        JButton plusButton=new JButton("+");
        plusButton.setBounds(243,335,60,50);
        plusButton.setBackground(new Color(0xFFB411));
        plusButton.setForeground(new Color(0x000000));
        plusButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font plusButtonFont=plusButton.getFont().deriveFont(Font.PLAIN,30);
        plusButton.setFont(plusButtonFont);
        frame.add(plusButton);
    }
    void fifthRowButtons(){
        JButton plusOrMinusButton=new JButton("+/-");
        plusOrMinusButton.setBounds(24,400,60,50);
        plusOrMinusButton.setBackground(new Color(0x4375FF));
        plusOrMinusButton.setForeground(new Color(0xFFFFFF));
        plusOrMinusButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font plusOrMinusButtonFont=plusOrMinusButton.getFont().deriveFont(Font.PLAIN,22);
        plusOrMinusButton.setFont(plusOrMinusButtonFont);
        frame.add(plusOrMinusButton);

        JButton zeroButton=new JButton("0");
        zeroButton.setBounds(97,400,60,50);
        zeroButton.setBackground(new Color(0x4375FF));
        zeroButton.setForeground(new Color(0xFFFFFF));
        zeroButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font zeroButtonFont=zeroButton.getFont().deriveFont(Font.PLAIN,22);
        zeroButton.setFont(zeroButtonFont);
        frame.add(zeroButton);

        JButton dotButton=new JButton("•");
        dotButton.setBounds(170,400,60,50);
        dotButton.setBackground(new Color(0x4375FF));
        dotButton.setForeground(new Color(0xFFFFFF));
        dotButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font dotButtonFont=dotButton.getFont().deriveFont(Font.PLAIN,22);
        dotButton.setFont(dotButtonFont);
        frame.add(dotButton);

        JButton equalButton=new JButton("=");
        equalButton.setBounds(243,400,60,50);
        equalButton.setBackground(new Color(0x00F289));
        equalButton.setForeground(new Color(0x000000));
        equalButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font equalButtonFont=equalButton.getFont().deriveFont(Font.PLAIN,30);
        equalButton.setFont(equalButtonFont);
        frame.add(equalButton);
    }
}
