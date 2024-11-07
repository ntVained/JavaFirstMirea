package ru.mirea.task12;

import javax.swing.*;
import java.awt.*;

public class ImageDisplay extends JFrame {

    private JLabel imageLabel;

    public ImageDisplay(String imagePath) {
        setTitle("Отображение картинки");

        setSize(800, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imageLabel = new JLabel();
        add(imageLabel, BorderLayout.CENTER);

        loadImage(imagePath);

        setVisible(true);
    }

    private void loadImage(String imagePath) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();

        Image scaledImage = image.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);

        imageLabel.setIcon(new ImageIcon(scaledImage));
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Пожалуйста, укажите путь к изображению в аргументах командной строки.");
            return;
        }
        SwingUtilities.invokeLater(() -> new ImageDisplay(args[0]));
    }
}