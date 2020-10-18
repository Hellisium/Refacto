import java.awt.event.*;
public class WindowHandler extends WindowAdapter {
    HardwareStore h;

    public WindowHandler(HardwareStore s) {
       h = s;
    }

    public void windowClosing(WindowEvent e) {
       h.cleanup();
    }
 }