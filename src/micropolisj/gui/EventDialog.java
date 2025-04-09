package micropolisj.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

import micropolisj.engine.*;
import static micropolisj.gui.MainWindow.formatFunds;
import static micropolisj.gui.MainWindow.formatGameDate;

// event dialogue page that creates a window
public class EventDialog extends JDialog {

    public EventDialog(JFrame parent, String message) {
        super(parent, "Event Window", true); 
        setSize(1000, 200);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        JTextArea messageArea = new JTextArea(message);
        messageArea.setEditable(false);
        messageArea.setLineWrap(true); //wraps text 
        messageArea.setWrapStyleWord(true);

        JPanel panel = new JPanel();
        JLabel label = new JLabel(message); 
        JButton button = new JButton("Close"); //adds close button

        button.addActionListener(new ActionListener() { // event listener that closes if button is pressed
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        panel.add(label);
        panel.add(button);
        add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(parent);
    }
}

