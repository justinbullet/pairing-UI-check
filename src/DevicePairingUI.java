import java.awt.*;
import javax.swing.*;

public class DevicePairingUI {
    
    // Common font and color settings
    private static final Font defaultFont = new Font("Tahoma", Font.PLAIN, 8);
    private static final Color defaultFontColor = new Color(128, 128, 128); // Gray

    private static void applyDefaultSettings(JComponent component) {
        component.setFont(defaultFont); 
        component.setForeground(defaultFontColor);
    }

    private static void applyComponentColors(JButton button, Color normalColor, Color hoverColor, Color pressedColor) {
        button.setForeground(normalColor);
        button.addChangeListener(e -> {
            if (button.getModel().isPressed()) {
                button.setForeground(pressedColor);
            } else if (button.getModel().isRollover()) {
                button.setForeground(hoverColor);
            } else {
                button.setForeground(normalColor);
            }
        });
    }

    public static void main(String[] args) {
        // Creating the main frame
        JFrame frame = new JFrame("Device Pairing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Using null layout for absolute positioning

        // Title label
        JLabel titleLabel = new JLabel("Device Pairing");
        titleLabel.setBounds(48, 32, 456, 34);
        applyDefaultSettings(titleLabel);
        frame.add(titleLabel);

        // Step labels
        JLabel step1Label = new JLabel("Step 1: Description");
        step1Label.setBounds(40, 88, 481, 17);
        applyDefaultSettings(step1Label);
        frame.add(step1Label);

        JLabel step2Label = new JLabel("Step 2: Description");
        step2Label.setBounds(40, 111, 481, 17);
        applyDefaultSettings(step2Label);
        frame.add(step2Label);

        JLabel step3Label = new JLabel("Step 3: Description");
        step3Label.setBounds(40, 134, 481, 17);
        applyDefaultSettings(step3Label);
        frame.add(step3Label);

        JLabel step4Label = new JLabel("Step 4: Description");
        step4Label.setBounds(40, 157, 481, 17);
        applyDefaultSettings(step4Label);
        frame.add(step4Label);

        // Countdown label
        JLabel countdownLabel = new JLabel("Countdown: 10");
        countdownLabel.setBounds(160, 296, 181, 26);
        countdownLabel.setForeground(Color.RED);
        frame.add(countdownLabel);

        // Paired hint image (use a JLabel for simplicity)
        JLabel pairedHint = new JLabel();
        pairedHint.setBounds(347, 220, 175, 100);
        pairedHint.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Placeholder for the image
        frame.add(pairedHint);

        // Start Pair button
        JButton startPairButton = new JButton("Start Pair");
        startPairButton.setBounds(40, 294, 100, 28);
        applyComponentColors(startPairButton, new Color(25, 25, 25), Color.WHITE, new Color(255, 50, 50));
        startPairButton.setFont(new Font("Tahoma", Font.PLAIN, 8)); // Custom font size for this button
        frame.add(startPairButton);

        // Previous button
        JButton previousButton = new JButton("Previous");
        previousButton.setBounds(215, 357, 65, 28);
        applyDefaultSettings(previousButton);
        frame.add(previousButton);

        // Close button
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(285, 357, 65, 28);
        applyDefaultSettings(closeButton);
        frame.add(closeButton);

        // Setting frame size and making it visible
        frame.setSize(600, 450);
        frame.setVisible(true);
    }
}
