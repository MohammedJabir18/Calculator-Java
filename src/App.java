import javax.swing.*;

public class App {
    JFrame frame;
    void calculatorApp(){
        //Window Enabling
        Window Gui_frame = new Window();
        frame=Gui_frame.guiWindow();

        //Dark and Light Mode Toggle button Enabling
        Dark_Light_Mode DLMode = new Dark_Light_Mode();
        DLMode.dark_light_Button(frame);

        //Text Box Enabling
        Display_Box textBox = new Display_Box();
        textBox.secondaryBox(frame);
        textBox.primaryBox();

        //Buttons Setting
        Buttons buttons = new Buttons();
        buttons.firstRowButtons(frame);

        frame.setVisible(true);

    }
}
