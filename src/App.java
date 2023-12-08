import javax.swing.*;

public class App {
    JFrame frame;
    void calculatorApp(){
        //Window Enabling
        Window Gui_frame = new Window();
        frame=Gui_frame.guiWindow();

        //Dark and Light Mode Toggle button Adding
        Dark_Light_Mode DLMode = new Dark_Light_Mode();
        DLMode.dark_light_Button(frame);

        //Text Box Adding
        Display_Box textBox = new Display_Box();
        textBox.secondaryBox(frame);
        JTextField primaryField = textBox.primaryBox();

        //Buttons Adding
        Buttons buttons = new Buttons();
        buttons.firstRowButtons(frame);
        buttons.secondRowButtons();
        buttons.thirdRowButtons();
        buttons.fourthRowButtons();
        buttons.fifthRowButtons();

        frame.setVisible(true);
        primaryField.requestFocusInWindow();
    }
}
