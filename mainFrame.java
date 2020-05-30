package donorLender;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class mainFrame extends JPanel
{

    public mainFrame()
    {

        super( new BorderLayout( 10, 10 ) );

        setBorder( new EmptyBorder( 600, 15, 5, 15 ) );

        JPanel p1 = new JPanel( new FlowLayout( FlowLayout.CENTER ) );
        p1.setBackground( Color.gray );

        JButton donor = new JButton( "Donor" );
        JButton search = new JButton( "Search" );
        JButton settings = new JButton( "Settings" );
        p1.add( donor );
        p1.add( search );
        p1.add( settings );

        JPanel southBorder = new JPanel( new BorderLayout( 10, 10 ) );
        southBorder.setBackground( Color.gray );
        southBorder.add(p1, BorderLayout.SOUTH);
        
        add( southBorder, BorderLayout.SOUTH );
        

    }
    
    public static void main(String[] args)
    {
        mainFrame mf = new mainFrame();
        
        JFrame frame = new JFrame( "DonorLender" );
        frame.setBackground( Color.white );
        frame.setResizable( false );
        frame.setLocationRelativeTo( null );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( mf );
        frame.pack();
        frame.setVisible( true );
    }
}
