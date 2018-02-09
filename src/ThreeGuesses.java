/*Welcome to People's Bank.
  Please enter your secret code: 45
  Sorry, that is not it. Try again: 47
  Sorry, last chance. Try again: 51
  Fine, go ahead.
  Here the user gets three (and only three) tries to guess the secret code (here 51). Write a
  program to give exactly this behavior. Do NOT use loops. For the printout of the 2 sample
  runs, give one for a correct secret code on the third try (as above), and one for an incorrect
  code an all three tries*/

import javax.swing.*;

public class ThreeGuesses {
public static void main(String[] args) {
    JPanel panel = new JPanel();
    //JTextField text
    JOptionPane.showInputDialog("Please enter your secret code");
    JOptionPane.showInputDialog("Sorry, that is not it. Try again");
    JOptionPane.showInputDialog("Sorry, last chance. Try again");
    JOptionPane.showMessageDialog(null, "Fine, go ahead.");
}
}
