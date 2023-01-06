import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
/**
 *
 * @author H2O
 */
public class JavaExamples extends javax.swing.JFrame {
 
    JavaExamples() {
        JFrame f = new JFrame();//creating instance of JFrame  
 
        JLabel lb1 = new JLabel("Height(Inches):");
        lb1.setBounds(20, 20, 100, 40);//x axis, y axis, width, height
        f.add(lb1); //adding component in JFrame
 
        JLabel lb2 = new JLabel("Weight(Pounds):");
        lb2.setBounds(20, 60, 100, 40);//x axis, y axis, width, height
        f.add(lb2); //adding component in JFrame 
        
        JLabel lbResult = new JLabel("BMI Calculator in JAVA GUI");
        lbResult.setBounds(20, 90, 300, 40);//x axis, y axis, width, height
        f.add(lbResult); //adding component in JFrame 
        
        JTextField txtHeight = new JTextField("");
        txtHeight.setBounds(120, 20, 200, 40);//x axis, y axis, width, height
        f.add(txtHeight); //adding component in JFrame 
 
        JTextField txtWeight = new JTextField("");
        txtWeight.setBounds(120, 60, 200, 40);//x axis, y axis, width, height
        f.add(txtWeight); //adding component in JFrame 
 
        JButton btn = new JButton("BMI Calculator in JAVA GUI(CALCULATE)");//creating instance of JButton  
        btn.setBounds(20, 130, 300, 40);//x axis, y axis, width, height
        
        //Event
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                double weight=Double.parseDouble(txtWeight.getText());
                double height=Double.parseDouble(txtHeight.getText());
                
                double bmi = weight / Math.pow(height, 2) * 703;
 
                 if (bmi < 18.5) {
                     lbResult.setText("underweight - BMI : "+bmi);
                 } else if (bmi < 25) {
                     lbResult.setText("normal - BMI : "+bmi);
                 } else if (bmi < 30) {
                     lbResult.setText("overweight - BMI : "+bmi);
                 } else {
                     lbResult.setText("obese - BMI : "+bmi);
                 }
            }
        });
 
        f.add(btn);//adding button in JFrame  
 
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
 
    }
 
    public static void main(String[] args) {
        new JavaExamples();
    }
}