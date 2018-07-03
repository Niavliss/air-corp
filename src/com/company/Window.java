package com.company;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private JPanel container = new JPanel();
    private JButton bouton = new JButton("Bouton");
    private JLabel label = new JLabel("Salut");

    public Window () {

        this.setTitle("Bienvenu chez Air-corp");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container.setLayout((new BorderLayout()));

        label.setHorizontalAlignment(JLabel.CENTER);
        container.add(label, BorderLayout.NORTH);

        this.setLayout(new BorderLayout());
        this.getContentPane().add(new JButton("À bientôt !"), BorderLayout.SOUTH);
        this.getContentPane().add(new JButton("Profil"), BorderLayout.CENTER);
        this.getContentPane().add(new JButton("Boutique"), BorderLayout.NORTH);
        this.getContentPane().add(new JButton("Panier"), BorderLayout.WEST);
        this.getContentPane().add(new JButton("Agile ou"), BorderLayout.EAST);

        this.setVisible(true);

    }

}
