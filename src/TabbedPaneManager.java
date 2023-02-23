import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class TabbedPaneManager {
    WindowManager windowManager;

    //Main pane and panel
    JTabbedPane tabbedPane;

    public TabbedPaneManager(WindowManager windowManager) {
        this.windowManager = windowManager;

        tabbedPane = new JTabbedPane();

        JButton button = new JButton("+");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createTab();
                System.out.println("+");
            }
        });

        JPanel buttonPanel = new JPanel(false);
        buttonPanel.add(button);

        tabbedPane.addTab("+", null, buttonPanel, "+");
    }


    public void addPaneAndPanel(JPanel panel){


//        JPanel panel = new JPanel(false);
//        panel.setLayout(new GridLayout(1, 1));
//        panel.add(new JTextArea());

//        Pad604Panel panel = new Pad604Panel();
        tabbedPane.addTab("Tab 1", null, panel,"Tab 1 tooltip");
//        tabbedPane.addTab("Tab 2", null, panel2,"Tab 1 tooltip");


    }

    public void createTab(){
        Pad604Panel panel = new Pad604Panel();
        addPaneAndPanel(panel);
        windowManager.window.add(tabbedPane);
    }

}
