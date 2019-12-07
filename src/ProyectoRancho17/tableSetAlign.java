/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoRancho17;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author a01636172
 */
public class tableSetAlign {

    private DefaultTableCellRenderer renderer = new DefaultTableCellHeaderRenderer();
    private JTable table;

    private void setTableCellAlignment(int alignment) {
        renderer.setHorizontalAlignment(alignment);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.setDefaultRenderer(table.getColumnClass(i), renderer);
        }
        // repaint to show table cell changes
        table.updateUI();
    }
}
