/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.Entidade;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maste
 */
public class Modelo_tabela extends DefaultTableModel{
    
		public boolean isCellEditable(int row, int column){  
          return false;  
      }

}
