package donorLender;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Donor extends JPanel
{
    private mainFrame mf;


    public Donor( mainFrame mf )
    {
        super( new BorderLayout( 10, 10 ) );

        setBorder( new EmptyBorder( 5, 15, 5, 15 ) );

        this.mf = mf;

        JPanel p1 = new JPanel( new FlowLayout( FlowLayout.CENTER ) );
        p1.setBackground( Color.white );

        JPanel p3 = new JPanel( new FlowLayout( FlowLayout.CENTER ) );
        p1.setBackground( Color.white );
        JPanel p4 = new JPanel( new FlowLayout( FlowLayout.CENTER ) );
        p1.setBackground( Color.white );
        JPanel p5 = new JPanel( new FlowLayout( FlowLayout.CENTER ) );
        p1.setBackground( Color.white );
        JPanel p6 = new JPanel( new FlowLayout( FlowLayout.CENTER ) );
        p1.setBackground( Color.white );

        JLabel label = new JLabel( "Enter information" );
        p1.add( label, BorderLayout.NORTH );

        JTextField item = new JTextField( 15 );
        item.setEditable( true );
        item.setText( "Item Name" );
        p1.add( item, BorderLayout.SOUTH );

        JTextField name = new JTextField( 15 );
        name.setEditable( true );
        name.setText( "Name of Donor" );
        JButton submit = new JButton( "Submit" );

        JTextField contacts = new JTextField( 15 );
        contacts.setEditable( true );
        contacts.setText( "Contact Information" );

        JTextField location = new JTextField( 15 );
        location.setEditable( true );
        location.setText( "Address of Pickup" );

        p3.add( name, BorderLayout.SOUTH );
        p4.add( p1, BorderLayout.NORTH );
        p4.add( p3, BorderLayout.SOUTH );
        p5.add( p4, BorderLayout.NORTH );
        p5.add( contacts, BorderLayout.SOUTH );
        p6.add( p5, BorderLayout.NORTH );
        p6.add(location, BorderLayout.SOUTH);

        
        
        JPanel p2 = new JPanel( new FlowLayout( FlowLayout.CENTER ) );
        p2.setBackground( Color.white );
        p2.add( submit, BorderLayout.SOUTH );

        submit.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                String itemName = item.getText();
                String donorName = name.getText();
                String contactInfo = contacts.getText();
                String address = location.getText();
                if ( itemName.isEmpty() || donorName.isEmpty()
                    || contactInfo.isEmpty() || address.isEmpty() )
                {
                    item.setText( null );
                    item.setEditable( true );
                    name.setText( null );
                    name.setEditable( true );
                    contacts.setText( null );
                    contacts.setEditable( true );
                    location.setText( null );
                    location.setEditable( true );

                    label.setText(
                        "Some fields were left blank, please fill in all fields" );

                }
                else

                {
                    String[] info = new String[4];
                    info[0] = itemName;
                    info[1] = donorName;
                    info[2] = contactInfo;
                    info[3] = address;
                    
                    item.setText( "Item Name" );
                    item.setEditable( true );
                    name.setText( "Donor Name" );
                    name.setEditable( true );
                    contacts.setText( "Contact Inforamtion" );
                    contacts.setEditable( true );
                    location.setText( "Pickup Location" );
                    location.setEditable( true );

                    mf.database.add( info );
                }
            }

        } );

        JPanel center = new JPanel( new BorderLayout( 10, 10 ) );
        center.setBackground( Color.white );

        center.add( p6, BorderLayout.NORTH );
        center.add( p2, BorderLayout.SOUTH );

        add( center, BorderLayout.NORTH );
    }
}
