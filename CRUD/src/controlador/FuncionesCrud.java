
package controlador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FuncionesCrud {
    
    
    
    
    public boolean comprobarCajas(String nombre, String profesion, String edad, String telefono){
        
        boolean continuar=true, esEntero;
        
        if(nombre.length()>30){
            JOptionPane.showMessageDialog(null, "La casilla 'NOMBRE', solo permite 30 caracteres");
            continuar=false;
        }
        if(profesion.length()>30){
            JOptionPane.showMessageDialog(null, "La casilla 'PROFESIÓN', solo permite 30 caracteres");
            continuar=false;
        }
        if(edad.length()>3){
            JOptionPane.showMessageDialog(null, "La casilla 'EDAD', solo permite 3 dígitos");
            continuar=false;
        }
        if(telefono.length()>10){
            JOptionPane.showMessageDialog(null, "La casilla 'TELÉFONO', solo permite 10 dígitos");
            continuar=false;
        }
        
        // Con esta funcion vamos a verificar si la casilla está llena solo de números
        esEntero = edad.matches("-?\\d+"); //edad es un string de puros enteros?
        if (!esEntero){
            JOptionPane.showMessageDialog(null, "La casilla 'EDAD', es solo para números");
            continuar = false;
        }
        esEntero = telefono.matches("-?\\d+");
        if (!esEntero){
        JOptionPane.showMessageDialog(null, "La casilla 'TÉLEFONO', es solo para números");
            continuar = false;
        }
        
        return continuar;
    }
    
    
    
    
    public void limpiarTabla(DefaultTableModel m){
        for (int i=m.getRowCount()-1;i>=0;i--){
            m.removeRow(i);
        }
    }
    
    
    
}
