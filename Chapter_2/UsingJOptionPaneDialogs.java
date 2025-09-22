import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
        
            String name = JOptionPane.showInputDialog(null, "What is your name?", "Name Input", JOptionPane.QUESTION_MESSAGE);
     
            if (name == null) {
                int exitChoice = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                if (exitChoice == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    continue; 
                }
            }
          
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to display your name?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
              
                JOptionPane.showMessageDialog(null, "Hello, " + name, "Name Display", JOptionPane.INFORMATION_MESSAGE);
                break; 
            } else if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION || confirm == JOptionPane.CLOSED_OPTION) {
               
                continue;
            }
        }
    }
}
