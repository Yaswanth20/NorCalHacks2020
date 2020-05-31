package donorLender;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class mainFrame
{

    public ArrayList<String[]> database;
    
    
    
//    public JButton donor;
//    public JButton search;
//    public JButton settings;
//    private JPanel panel;
//    
//    private static JFrame frame = new JFrame( "DonorLender" );
    
    public mainFrame()
    {
        

//        super( new BorderLayout( 10, 10 ) );
//
//        setBorder( new EmptyBorder( 600, 15, 5, 15 ) );
//
//        JPanel p1 = new JPanel( new FlowLayout( FlowLayout.CENTER ) );
//        p1.setBackground( Color.gray );

//        donor = new JButton( "Donor" );
//        search = new JButton( "Search" );
//        settings = new JButton( "Settings" );
//        p1.add( donor );
//        p1.add( search );
//        p1.add( settings );
        
        
        

//        panel = new JPanel( new BorderLayout( 10, 10 ) );
//        panel.setBackground( Color.gray );
//        panel.add(p1, BorderLayout.SOUTH);
//        
//         
//        
//        add( panel, BorderLayout.SOUTH );
//        
        
        database = new ArrayList<String[]>(); 

    }
    
//    public void setReceiver(mainFrame mf)
//    {
//        search.addActionListener( new ActionListener()
//        {
//            @Override
//            public void actionPerformed( ActionEvent e )
//            {
//                receiver = new Receiver(mf);
//                panel.add( receiver, BorderLayout.CENTER );
//                add( panel, BorderLayout.CENTER );
//                
//                frame.getContentPane().add( receiver );
//                frame.pack();
//                frame.setVisible( true );
//                
//            }
//        });
//    }
    
    public static void main(String[] args)
    {
        mainFrame mf = new mainFrame();
        
        JFrame frame = new JFrame( "Receiver" );
        frame.setBackground( Color.blue );
        frame.setResizable( false );
        frame.setLocationRelativeTo( null );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Receiver r = new Receiver(mf);
        frame.getContentPane().add( r );
        frame.pack();
        frame.setVisible( true );
        
        JFrame frame1 = new JFrame("Donor");
        frame1.setBackground( Color.blue );
        frame1.setResizable( false );
        frame1.setLocationRelativeTo(null );
        frame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Donor d = new Donor(mf);
        frame1.getContentPane().add( d );
        frame1.pack();
        frame1.setVisible( true );
        
        
        
        
    }
}
