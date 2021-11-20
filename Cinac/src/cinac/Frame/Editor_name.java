/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.Frame;

import java.util.EventObject;
import javax.swing.DefaultCellEditor;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maste
 */
public class Editor_name{
  public boolean isCellEditable(int linha,int coluna) {
    return false;
  }
}
