import javax.swing.*;

public class ThreeGuesses {
// Written by: Mike Baldwin
// The user gets three tries to guess the secret code

private static final int secretCode = 51;

public static void main(String[] args) {
    String codeText;

    codeText = JOptionPane.showInputDialog("Welcome to People's Bank.\n" +
            "Please enter your secret code");
    if (Integer.parseInt(codeText) != secretCode) {
        codeText = JOptionPane.showInputDialog("Sorry, that is not it. Try again");
        if (Integer.parseInt(codeText) != secretCode) {
            codeText = JOptionPane.showInputDialog("Sorry, last chance. Try again");
            if (Integer.parseInt(codeText) != secretCode) {
                JOptionPane.showMessageDialog(null,
                        "You have incorrectly entered your code three times now.\n" +
                                "Your account has been closed and your card shredded.\n" +
                                "Have a nice day!");
                System.exit(0);
            }
        }
    }

    JOptionPane.showMessageDialog(null, "Fine, go ahead.");
}
}
