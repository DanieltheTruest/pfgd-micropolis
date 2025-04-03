package micropolisj.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

import micropolisj.engine.*;
import static micropolisj.gui.MainWindow.formatFunds;
import static micropolisj.gui.MainWindow.formatGameDate;

public class EventDialog extends JDialog {

    public EventDialog(JFrame parent, String message) {
        super(parent, "Event Window", true); 
        setSize(300, 200);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel(message); 
        JButton button = new JButton("Close");

        button.addActionListener(new ActionListener() {
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

