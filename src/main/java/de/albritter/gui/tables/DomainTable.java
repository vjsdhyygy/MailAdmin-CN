package de.albritter.gui.tables;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


/**
 * Created by hhalbritter on 10.06.2016.
 */
public class DomainTable extends JPanel implements UpdateTabel {
    public final static String[] HEADER = new String[]{"ID", "Domain", "Active"};
    private DataTable table;

    public DomainTable() {
        setLayout(new BorderLayout());
        table = new DataTable(HEADER);
        table.updateTable(new Object[][]{{464, "fsdf", false}});


        add(new JScrollPane(table));
    }


    @Override
    public void updateDomainTable(Object[][] data) {
        table.updateTable(data);
    }

    @Override
    public void updateMailboxTable(Object[][] data) {

    }

    @Override
    public void updateAliasTable(Object[][] data) {

    }

    @Override
    public void updateTLSTable(Object[][] data) {

    }
}
