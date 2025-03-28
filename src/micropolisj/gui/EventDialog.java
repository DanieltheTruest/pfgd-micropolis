package micropolisj.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

import micropolisj.engine.*;
import static micropolisj.gui.MainWindow.formatFunds;
import static micropolisj.gui.MainWindow.formatGameDate;

public class EventDialog extends JDialog
{
    private JDialog eventDialog;
    public EventDialog () {
        eventDialog = new JDialog();
        eventDialog.setTitle("Event Window");
        eventDialog.setSize(300, 200);
        eventDialog.setLayout(new BorderLayout());
        eventDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Flooding is happening");
        JButton button = new JButton("Close");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventDialog.dispose();
            }
        });

        panel.add(label);
        panel.add(button);
        eventDialog.add(panel, BorderLayout.CENTER);
    }

    public void showEventDialog() {
        eventDialog.setVisible(true);
    }
}

public void triggerEvent() 
{
    showEventDialog();
}
