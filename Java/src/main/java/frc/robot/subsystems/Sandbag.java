package frc.robot.subsystems;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Sandbag {
    private boolean isPunctured = false;
    private JButton punctureButton;

    Sandbag() {
        punctureButton = new JButton("Puncture Sandbag");
        punctureButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                puncture();
            }
        });
    }

    public void puncture() {
        if (!isPunctured) {
            isPunctured = true;
            System.out.println("The sandbag has been punctured. Sand is unloading onto the field.");
        } else {
            System.out.println("The sandbag is already punctured.");
        }
    }

    public JButton getPunctureButton() {
        return punctureButton;
    }
}
