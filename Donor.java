package donorLender;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Donor extends JPanel
{
    private mainFrame mf;
    private ArrayList<String[]> database;

    

    public Donor(mainFrame mf)
    {
        super( new BorderLayout( 10, 10 ) );
        
        setBorder( new EmptyBorder( 5, 15, 5, 15 ) );
        
        this.mf = mf;
        this.database = mf.database;
        
        
        JPanel p1 = new JPanel( new FlowLayout(FlowLayout.CENTER ) );
        p1.setBackground( Color.white );
        
        JPanel p3 = new JPanel( new FlowLayout(FlowLayout.CENTER )  );
        p1.setBackground( Color.white );
        JPanel p4 = new JPanel( new FlowLayout(FlowLayout.CENTER ) );
        p1.setBackground( Color.white );
        JPanel p5 = new JPanel( new FlowLayout(FlowLayout.CENTER  ) );
        p1.setBackground( Color.white );
        
        JTextField item = new JTextField(30);
        item.setEditable( true );
        item.setText( "Item Name" );
        p1.add( item, BorderLayout.NORTH );
        JTextField name = new JTextField(30);
        name.setEditable( true );
        name.setText( "Name of Donor" );
        JButton submit = new JButton("Submit");
        p3.add( name, BorderLayout.SOUTH );
        p4.add( p1, BorderLayout.NORTH );
        p4.add( p3, BorderLayout.SOUTH );
        
        
        JPanel p2 = new JPanel( new FlowLayout( FlowLayout.CENTER ) );
        p2.setBackground( Color.white );
        p2.add( submit, BorderLayout.SOUTH );
        
        
        submit.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                String searchReference = item.getText();
                if (searchReference.isEmpty())
                {
                    item.setText( null );
                    item.setEditable( true );
                }
            }
                
        });
        

        JPanel center = new JPanel( new BorderLayout( 10, 10 ) );
        center.setBackground( Color.white );

        

        center.add( p4, BorderLayout.NORTH );
        center.add( p2, BorderLayout.SOUTH );
        
        add(center, BorderLayout.NORTH);
    }
}
