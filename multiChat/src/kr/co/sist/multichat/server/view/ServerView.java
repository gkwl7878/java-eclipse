package kr.co.sist.multichat.server.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import kr.co.sist.multichat.server.evt.ServerEvt;

@SuppressWarnings("serial")
public class ServerView extends JFrame {
   
   private JTextArea jtaChatDisplay1,jtaChatDisplay2,jtaChatDisplay3,jtaChatDisplay4;
   private JScrollPane jspChatDisplay1,jspChatDisplay2,jspChatDisplay3,jspChatDisplay4;
   private JButton jbStart, jbClose;
   private Panel Center, soso;
   
public ServerView() {
      super("채팅 서버");
      
       Center = new Panel();
       soso = new Panel();
      
      
       jtaChatDisplay1 = new JTextArea();
       jtaChatDisplay2 = new JTextArea();
       jtaChatDisplay3 = new JTextArea();
       jtaChatDisplay4 = new JTextArea();
       
       jtaChatDisplay1.setEditable(false);
       jtaChatDisplay2.setEditable(false);
       jtaChatDisplay3.setEditable(false);
       jtaChatDisplay4.setEditable(false);
      
       jspChatDisplay1 = new JScrollPane(jtaChatDisplay1);
       jspChatDisplay2 = new JScrollPane(jtaChatDisplay2);
       jspChatDisplay3 = new JScrollPane(jtaChatDisplay3);
       jspChatDisplay4 = new JScrollPane(jtaChatDisplay4);
      
       jbStart = new JButton("시작");
       jbClose= new JButton("종료");
      
      jspChatDisplay1.setBorder(new TitledBorder("1조"));
      jspChatDisplay2.setBorder(new TitledBorder("2조"));
      jspChatDisplay3.setBorder(new TitledBorder("3조"));
      jspChatDisplay4.setBorder(new TitledBorder("4조"));

      Center.setLayout(new GridLayout(2, 2));
      Center.add(jspChatDisplay1);
      Center.add(jspChatDisplay2);
      Center.add(jspChatDisplay3);
      Center.add(jspChatDisplay4);
      
      setLayout(new BorderLayout());
      
      
      soso.add(jbStart);
      soso.add(jbClose);
      
      add("Center", Center);
      add("South", soso);
      setBounds(100,100, 500,500);
      setVisible(true);
//      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      ServerEvt se = new ServerEvt( this);
      jbStart.addActionListener(se);
      jbClose.addActionListener(se);
      
      addWindowListener(se);    
   }//hwServer
   public JTextArea getJtaChatDisplay1() {
	return jtaChatDisplay1;
}
public JTextArea getJtaChatDisplay2() {
	return jtaChatDisplay2;
}
public JTextArea getJtaChatDisplay3() {
	return jtaChatDisplay3;
}
public JTextArea getJtaChatDisplay4() {
	return jtaChatDisplay4;
}
public JScrollPane getJspChatDisplay1() {
	return jspChatDisplay1;
}
public JScrollPane getJspChatDisplay2() {
	return jspChatDisplay2;
}
public JScrollPane getJspChatDisplay3() {
	return jspChatDisplay3;
}
public JScrollPane getJspChatDisplay4() {
	return jspChatDisplay4;
}
public JButton getJbStart() {
      return jbStart;
   }
   public JButton getJbClose() {
      return jbClose;
   }
   public static void main(String[] args) {
      new ServerView();
   }

}