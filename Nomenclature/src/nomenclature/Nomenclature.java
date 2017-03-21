/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomenclature;

import static java.awt.SystemColor.window;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author phili
 */
public class Nomenclature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        try 
        {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) 
            {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        } 
        catch (Exception e) 
        {
            // If Nimbus is not available, fall back to cross-platform
            try
            {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } 
            catch (Exception ex) 
            {
                // not worth my time
            }
        }
        
        
        
        new MainMenu().setVisible(true);
    }

}
