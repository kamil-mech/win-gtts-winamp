import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui implements ActionListener {
	
	JTextField textfield = null;
	
	public static void main(String[] args){
		new Gui();
	}
	
	public Gui(){
        //Create and set up the window.
        JFrame frame = new JFrame("Fapcix 0.0.1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = frame.getContentPane();
		frame.setSize(300, 100);
		container.setLayout(new FlowLayout());
		
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("TTS input:");
        container.add(label);
        
        textfield = new JTextField("Powiedz coœ");
        textfield.setActionCommand("run");
        textfield.addActionListener(this);
        container.add(textfield);

        //Display the window.
        frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "run") {
			System.out.println("okej");
			runCmd("say.bat " + textfield.getText());
			textfield.setText("");
		}
	}
	
	private void runCmd(String cmd){
		try {
		    // Execute command
		    String command = "cmd /c " + cmd;
		    Process child = Runtime.getRuntime().exec(command);

		    // Get output stream to write from it
//		    OutputStream out = child.getOutputStream();
//
//		    out.write("cd C:/ /r/n".getBytes());
//		    out.flush();
//		    out.write("dir /r/n".getBytes());
//		    out.close();
		} catch (IOException e) {
		}
	}
}
