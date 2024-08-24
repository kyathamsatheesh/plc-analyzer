package com.uta.edu.plc.controller;

import java.awt.Color;
import java.awt.Point;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class VSCodeCompareLookAndFeel {

	public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Background Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);  // Change to any color you like

        JLabel label = new JLabel("Hello, World!");
        label.setForeground(Color.WHITE);  // Set the text color to white for better visibility
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void synchronizeScrollPanes(JScrollPane scrollPane1, JScrollPane scrollPane2) {
        JViewport viewport1 = scrollPane1.getViewport();
        JViewport viewport2 = scrollPane2.getViewport();

        ChangeListener listener1 = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                Point p = viewport1.getViewPosition();
                viewport2.setViewPosition(p);
            }
        };

        ChangeListener listener2 = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                Point p = viewport2.getViewPosition();
                viewport1.setViewPosition(p);
            }
        };

        viewport1.addChangeListener(listener1);
        viewport2.addChangeListener(listener2);
    }
}
