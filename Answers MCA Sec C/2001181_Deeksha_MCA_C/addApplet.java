package applet.deeksha;
import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;
  
public class AddApplet extends Frame  implements KeyListener{  
    Label l;  
     
    AddApplet(){  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        
      
        addKeyListener(this);  
          
        add(l); 
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) {  
        l.setText("Key Pressed");  
        char ch = e.getKeyChar();
        
        if (ch == 'a' ||ch == 'b'||ch == 'c' ) {
       
      System.out.println(e.getKeyChar());
       
        }
       
    }  
    public void keyReleased(KeyEvent e) {  
        l.setText("Key Released");  
    }  
    public void keyTyped(KeyEvent e) {  
        l.setText("Key Typed");  
    }  
  
    public static void main(String[] args) {  
        new AddApplet();  
    }  
}  

