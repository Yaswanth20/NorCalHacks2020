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

public class Receiver extends JPanel
{
    private mainFrame mf;
    private ArrayList<String[]> database;
    private DefaultListModel<String> model;
    private JList list;
    private JScrollPane scroll;
    

    public Receiver(mainFrame mf)
    {
        super( new BorderLayout( 10, 10 ) );
        
        setBorder( new EmptyBorder( 5, 15, 5, 15 ) );
        
        this.mf = mf;
        this.database = mf.database;
        
        
        JPanel p1 = new JPanel( new FlowLayout( FlowLayout.CENTER ) );
        p1.setBackground( Color.white );
        
        JTextField search = new JTextField(30);
        search.setEditable( true );
        JButton searchButton = new JButton("Search");
        p1.add( search );
        p1.add( searchButton );
        
        JPanel p2 = new JPanel( new FlowLayout( FlowLayout.CENTER ) );
        p2.setBackground( Color.gray );
        
        model = new DefaultListModel<String>();
        list = new JList(model);
        scroll = new JScrollPane(list);
        p2.add( scroll, BorderLayout.CENTER );
        searchButton.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                model.removeAllElements();
                String searchReference = search.getText();
                if (searchReference.isEmpty())
                {
                    search.setText( null );
                    search.setEditable( true );
                }
                else
                {
                    
                    
                    int count = 0;
                    
                    for (int i = 0; i < database.size(); i++)
                    {
                        String[] s = database.get( i );
                        String information = "";
                        for (int j = 0; j < s.length; j++)
                        {
                            information += s[j] + " ; ";
                        }
                     
                        if(s[0].contains( searchReference ))
                        {
                            count++;
                            model.addElement( information );
                        }
                        
                    }
                    if (count == 0)
                    {
                        model.addElement( "Nothing related" );
                    }
                    
                    
                }
                
            }
        });
        

        JPanel center = new JPanel( new BorderLayout( 10, 10 ) );
        center.setBackground( Color.white );


        center.add( p1, BorderLayout.NORTH );
        center.add( p2, BorderLayout.SOUTH );
        
        add(center, BorderLayout.NORTH);
    }
}
