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

        frame.setVisible(true);

    }
}
