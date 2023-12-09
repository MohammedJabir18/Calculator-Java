import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons implements ActionListener {
    JFrame frame; JTextField primaryField; JTextField secondaryField; String calculation;
    JButton clearButton; JButton deleteButton; JButton modButton; JButton divideButton;
    JButton sevenButton; JButton eightButton; JButton nineButton; JButton crossButton;
    JButton fourButton; JButton fiveButton; JButton sixButton; JButton minusButton;
    JButton oneButton; JButton twoButton;JButton threeButton; JButton plusButton;
    JButton plusOrMinusButton; JButton zeroButton; JButton dotButton; JButton equalButton;
    boolean isOperatorClicked=false; boolean isResultFound=false; Double num1, num2, result;
    String oldValue, newValue, answer;
    void firstRowButtons(JFrame frame, JTextField primaryField, JTextField secondaryField){
        this.primaryField=primaryField;
        this.secondaryField=secondaryField;
        clearButton=new JButton("AC");
        clearButton.setBounds(24,140,60,50);
        clearButton.setBackground(new Color(0xFF4A4A));
        clearButton.setForeground(new Color(0x000000));
        clearButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font clearButtonFont=clearButton.getFont().deriveFont(Font.PLAIN,20);
        clearButton.setFont(clearButtonFont);
        frame.add(clearButton);
        clearButton.addActionListener(this);

        deleteButton=new JButton("⌫");
        deleteButton.setBounds(97,140,60,50);
        deleteButton.setBackground(new Color(0x8D8D8D));
        deleteButton.setForeground(new Color(0x000000));
        deleteButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font deleteButtonFont=deleteButton.getFont().deriveFont(Font.PLAIN,20);
        deleteButton.setFont(deleteButtonFont);
        frame.add(deleteButton);
        deleteButton.addActionListener(this);

        modButton=new JButton("%");
        modButton.setBounds(170,140,60,50);
        modButton.setBackground(new Color(0x8D8D8D));
        modButton.setForeground(new Color(0x000000));
        modButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font modButtonFont=modButton.getFont().deriveFont(Font.PLAIN,20);
        modButton.setFont(modButtonFont);
        frame.add(modButton);
        modButton.addActionListener(this);

        divideButton=new JButton("÷");
        divideButton.setBounds(243,140,60,50);
        divideButton.setBackground(new Color(0xFFB411));
        divideButton.setForeground(new Color(0x000000));
        divideButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font divideButtonFont=divideButton.getFont().deriveFont(Font.PLAIN,32);
        divideButton.setFont(divideButtonFont);
        frame.add(divideButton);
        this.frame=frame;
        divideButton.addActionListener(this);
    }
    void secondRowButtons(){
        sevenButton=new JButton("7");
        sevenButton.setBounds(24,205,60,50);
        sevenButton.setBackground(new Color(0x4375FF));
        sevenButton.setForeground(new Color(0xFFFFFF));
        sevenButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font sevenButtonFont=sevenButton.getFont().deriveFont(Font.PLAIN,22);
        sevenButton.setFont(sevenButtonFont);
        frame.add(sevenButton);
        sevenButton.addActionListener(this);

        eightButton=new JButton("8");
        eightButton.setBounds(97,205,60,50);
        eightButton.setBackground(new Color(0x4375FF));
        eightButton.setForeground(new Color(0xFFFFFF));
        eightButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font eightButtonFont=eightButton.getFont().deriveFont(Font.PLAIN,22);
        eightButton.setFont(eightButtonFont);
        frame.add(eightButton);
        eightButton.addActionListener(this);

        nineButton=new JButton("9");
        nineButton.setBounds(170,205,60,50);
        nineButton.setBackground(new Color(0x4375FF));
        nineButton.setForeground(new Color(0xFFFFFF));
        nineButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font nineButtonFont=nineButton.getFont().deriveFont(Font.PLAIN,22);
        nineButton.setFont(nineButtonFont);
        frame.add(nineButton);
        nineButton.addActionListener(this);

        crossButton=new JButton("x");
        crossButton.setBounds(243,205,60,50);
        crossButton.setBackground(new Color(0xFFB411));
        crossButton.setForeground(new Color(0x000000));
        crossButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font crossButtonFont=crossButton.getFont().deriveFont(Font.PLAIN,26);
        crossButton.setFont(crossButtonFont);
        frame.add(crossButton);
        crossButton.addActionListener(this);
    }
    void thirdRowButtons(){
        fourButton=new JButton("4");
        fourButton.setBounds(24,270,60,50);
        fourButton.setBackground(new Color(0x4375FF));
        fourButton.setForeground(new Color(0xFFFFFF));
        fourButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font fourButtonFont=fourButton.getFont().deriveFont(Font.PLAIN,22);
        fourButton.setFont(fourButtonFont);
        frame.add(fourButton);
        fourButton.addActionListener(this);

        fiveButton=new JButton("5");
        fiveButton.setBounds(97,270,60,50);
        fiveButton.setBackground(new Color(0x4375FF));
        fiveButton.setForeground(new Color(0xFFFFFF));
        fiveButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font fiveButtonFont=fiveButton.getFont().deriveFont(Font.PLAIN,22);
        fiveButton.setFont(fiveButtonFont);
        frame.add(fiveButton);
        fiveButton.addActionListener(this);

        sixButton=new JButton("6");
        sixButton.setBounds(170,270,60,50);
        sixButton.setBackground(new Color(0x4375FF));
        sixButton.setForeground(new Color(0xFFFFFF));
        sixButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font sixButtonFont=sixButton.getFont().deriveFont(Font.PLAIN,22);
        sixButton.setFont(sixButtonFont);
        frame.add(sixButton);
        sixButton.addActionListener(this);

        minusButton=new JButton("−");
        minusButton.setBounds(243,270,60,50);
        minusButton.setBackground(new Color(0xFFB411));
        minusButton.setForeground(new Color(0x000000));
        minusButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font minusButtonFont=minusButton.getFont().deriveFont(Font.PLAIN,34);
        minusButton.setFont(minusButtonFont);
        frame.add(minusButton);
        minusButton.addActionListener(this);
    }
    void fourthRowButtons(){
        oneButton=new JButton("1");
        oneButton.setBounds(24,335,60,50);
        oneButton.setBackground(new Color(0x4375FF));
        oneButton.setForeground(new Color(0xFFFFFF));
        oneButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font oneButtonFont=oneButton.getFont().deriveFont(Font.PLAIN,22);
        oneButton.setFont(oneButtonFont);
        frame.add(oneButton);
        oneButton.addActionListener(this);

        twoButton=new JButton("2");
        twoButton.setBounds(97,335,60,50);
        twoButton.setBackground(new Color(0x4375FF));
        twoButton.setForeground(new Color(0xFFFFFF));
        twoButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font twoButtonFont=twoButton.getFont().deriveFont(Font.PLAIN,22);
        twoButton.setFont(twoButtonFont);
        frame.add(twoButton);
        twoButton.addActionListener(this);

        threeButton=new JButton("3");
        threeButton.setBounds(170,335,60,50);
        threeButton.setBackground(new Color(0x4375FF));
        threeButton.setForeground(new Color(0xFFFFFF));
        threeButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font threeButtonFont=threeButton.getFont().deriveFont(Font.PLAIN,22);
        threeButton.setFont(threeButtonFont);
        frame.add(threeButton);
        threeButton.addActionListener(this);

        plusButton=new JButton("+");
        plusButton.setBounds(243,335,60,50);
        plusButton.setBackground(new Color(0xFFB411));
        plusButton.setForeground(new Color(0x000000));
        plusButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font plusButtonFont=plusButton.getFont().deriveFont(Font.PLAIN,30);
        plusButton.setFont(plusButtonFont);
        frame.add(plusButton);
        plusButton.addActionListener(this);
    }
    void fifthRowButtons(){
        plusOrMinusButton=new JButton("+/-");
        plusOrMinusButton.setBounds(24,400,60,50);
        plusOrMinusButton.setBackground(new Color(0x4375FF));
        plusOrMinusButton.setForeground(new Color(0xFFFFFF));
        plusOrMinusButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font plusOrMinusButtonFont=plusOrMinusButton.getFont().deriveFont(Font.PLAIN,22);
        plusOrMinusButton.setFont(plusOrMinusButtonFont);
        frame.add(plusOrMinusButton);
        plusOrMinusButton.addActionListener(this);

        zeroButton=new JButton("0");
        zeroButton.setBounds(97,400,60,50);
        zeroButton.setBackground(new Color(0x4375FF));
        zeroButton.setForeground(new Color(0xFFFFFF));
        zeroButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font zeroButtonFont=zeroButton.getFont().deriveFont(Font.PLAIN,22);
        zeroButton.setFont(zeroButtonFont);
        frame.add(zeroButton);
        zeroButton.addActionListener(this);

        dotButton=new JButton("•");
        dotButton.setBounds(170,400,60,50);
        dotButton.setBackground(new Color(0x4375FF));
        dotButton.setForeground(new Color(0xFFFFFF));
        dotButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x000000)));
        Font dotButtonFont=dotButton.getFont().deriveFont(Font.PLAIN,22);
        dotButton.setFont(dotButtonFont);
        frame.add(dotButton);
        dotButton.addActionListener(this);

        equalButton=new JButton("=");
        equalButton.setBounds(243,400,60,50);
        equalButton.setBackground(new Color(0x00F289));
        equalButton.setForeground(new Color(0x000000));
        equalButton.setBorder(new MatteBorder(2,2,2,2,new Color(0x3F3F3F)));
        Font equalButtonFont=equalButton.getFont().deriveFont(Font.PLAIN,30);
        equalButton.setFont(equalButtonFont);
        frame.add(equalButton);
        equalButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==sevenButton){
            if (primaryField.getText().equals("0")) {
                primaryField.setText("");
            }
            if (isOperatorClicked || isResultFound){
                primaryField.setText("7");
                isOperatorClicked=false;
                isResultFound=false;
            }else {
                primaryField.setText(primaryField.getText()+"7");
            }
        }
        if (e.getSource()==eightButton){
            if (primaryField.getText().equals("0")) {
                primaryField.setText("");
            }
            if (isOperatorClicked || isResultFound) {
                primaryField.setText("8");
                isOperatorClicked=false;
            }else {
                primaryField.setText(primaryField.getText()+"8");
            }
        }
        if (e.getSource()==nineButton){
            if (primaryField.getText().equals("0")){
                primaryField.setText("");
            }
            if (isOperatorClicked || isResultFound) {
                primaryField.setText("9");
                isOperatorClicked = false;
                isResultFound = false;
            }else {
            primaryField.setText(primaryField.getText()+"9");
            }
        }
        if (e.getSource()==fourButton){
            if (primaryField.getText().equals("0")){
                primaryField.setText("");
            }
            if (isOperatorClicked || isResultFound) {
                primaryField.setText("4");
                isOperatorClicked = false;
                isResultFound = false;
            }else {
                primaryField.setText(primaryField.getText()+"4");
            }
        }
        if (e.getSource()==fiveButton){
            if (primaryField.getText().equals("0")){
                primaryField.setText("");
            }
            if (isOperatorClicked || isResultFound) {
                primaryField.setText("5");
                isOperatorClicked = false;
                isResultFound =false;
            }else {
                primaryField.setText(primaryField.getText()+"5");
            }
        }
        if (e.getSource()==sixButton){
            if (primaryField.getText().equals("0")){
                primaryField.setText("");
            }
            if (isOperatorClicked || isResultFound) {
                primaryField.setText("6");
                isOperatorClicked = false;
                isResultFound = false;
            }else {
                primaryField.setText(primaryField.getText()+"6");
            }
        }
        if (e.getSource()==oneButton){
            if (primaryField.getText().equals("0")){
                primaryField.setText("");
            }
            if (isOperatorClicked || isResultFound) {
                primaryField.setText("1");
                isOperatorClicked = false;
                isResultFound = false;
            }else {
                primaryField.setText(primaryField.getText()+"1");
            }
        }
        if (e.getSource()==twoButton){
            if (primaryField.getText().equals("0")){
                primaryField.setText("");
            }
            if (isOperatorClicked || isResultFound) {
                primaryField.setText("2");
                isOperatorClicked = false;
                isResultFound = false;
            }else {
                primaryField.setText(primaryField.getText()+"2");
            }
        }
        if (e.getSource()==threeButton){
            if (primaryField.getText().equals("0")){
                primaryField.setText("");
            }
            if (isOperatorClicked || isResultFound) {
                primaryField.setText("3");
                isOperatorClicked = false;
                isResultFound = false;
            }else {
                primaryField.setText(primaryField.getText()+"3");
            }
        }
        if (e.getSource()==zeroButton){
            if (primaryField.getText().equals("0")){
                return;
            }
            else {
                if (isOperatorClicked || isResultFound) {
                    primaryField.setText("0");
                    isOperatorClicked = false;
                    isResultFound = false;
                }else {
                    primaryField.setText(primaryField.getText()+"0");
                }
            }
        }
        if (e.getSource()==dotButton){
            if (primaryField.getText().contains("."))
                return;
            else {
                if (isOperatorClicked || isResultFound) {
                    primaryField.setText(".");
                    isOperatorClicked = false;
                    isResultFound = false;
                }else {
                    primaryField.setText(primaryField.getText()+".");
                }
            }
        }
        if (e.getSource()==clearButton){
            primaryField.setText("");
            secondaryField.setText("");
        }
        if (e.getSource()==deleteButton){
            int length = primaryField.getText().length();
            int position = length-1;
            if (length>0){
                StringBuilder back = new StringBuilder(primaryField.getText());
                back.deleteCharAt(position);
                primaryField.setText(back.toString());
            }
        }
        if (e.getSource()==plusButton){
            isOperatorClicked=true;
            oldValue = primaryField.getText();
            secondaryField.setText(oldValue+" +");
            num1 = Double.parseDouble(oldValue);
            calculation = "add";
        }
        if (e.getSource()==minusButton){
            isOperatorClicked=true;
            oldValue = primaryField.getText();
            secondaryField.setText(oldValue+" -");
            num1 = Double.parseDouble(oldValue);
            calculation = "sub";
        }
        if (e.getSource()==crossButton){
            isOperatorClicked=true;
            oldValue = primaryField.getText();
            secondaryField.setText(oldValue+" x");
            num1 = Double.parseDouble(oldValue);
            calculation = "multi";
        }
        if (e.getSource()==divideButton){
            isOperatorClicked=true;
            oldValue = primaryField.getText();
            secondaryField.setText(oldValue+" ÷");
            num1 = Double.parseDouble(oldValue);
            calculation = "div";
        }
        if (e.getSource()==modButton){
            isOperatorClicked=true;
            oldValue = primaryField.getText();
            secondaryField.setText(oldValue+" %");
            num1 = Double.parseDouble(oldValue);
            calculation = "reminder";
        }
        if (e.getSource()==plusOrMinusButton){
            num1=Double.parseDouble(String.valueOf(primaryField.getText()));
            num1=num1*(-1);
            primaryField.setText(num1+"");
        }
        if (e.getSource()==equalButton){
            newValue=primaryField.getText();
            secondaryField.setText(newValue+" =");
            num2 = Double.parseDouble(newValue);
            switch (calculation){
                case "add":
                    result = num1 + num2;
                    answer = String.format("%.2f", result);
                    secondaryField.setText(oldValue+" + "+newValue+" =");
                    isResultFound=true;
                    break;
                case "sub":
                    result = num1 - num2;
                    answer = String.format("%.2f", result);
                    secondaryField.setText(oldValue+" - "+newValue+" =");
                    primaryField.setText(answer);
                    isResultFound=true;
                    break;
                case "multi":
                    result = num1 * num2;
                    answer = String.format("%.2f", result);
                    secondaryField.setText(oldValue+" x "+newValue+" =");
                    primaryField.setText(answer);
                    isResultFound=true;
                    break;
                case "div":
                    result = num1 / num2;
                    answer = String.format("%.2f", result);
                    secondaryField.setText(oldValue+" ÷ "+newValue+" =");
                    primaryField.setText(answer);
                    isResultFound=true;
                    break;
                case "reminder":
                    result = num1 % num2;
                    answer = String.format("%.2f", result);
                    secondaryField.setText(oldValue+" % "+newValue+" =");
                    primaryField.setText(answer);
                    isResultFound=true;
                    break;
                default:
                    primaryField.setText(primaryField.getText());
                    secondaryField.setText(primaryField.getText());
                    break;
            }
            if (Double.toString(result).endsWith(".00")){
                primaryField.setText(Double.toString(result).replace(".00",""));
            }
            else {
                primaryField.setText(Double.toString(result));
            }
        }
    }
}
