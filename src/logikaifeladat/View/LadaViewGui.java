/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logikaifeladat.View;

import javax.swing.JOptionPane;
import logikaifeladat.Lada;

/**
 *
 * @author voros.dominik
 */
public class LadaViewGui {

    public LadaViewGui(Lada[] tomb) {
        JOptionPane.showMessageDialog(null, "Van elöted három láda", "Logikai jatek", 0);
        game(tomb);
        
        
        
    }
    public void game(Lada[] tomb){
       
         String[] lista = generalas(tomb);
         System.out.println(generalas(tomb)[1]);
         
         String message = "<html>Válassz egy ládát anyaga alapján:<br>"+
                                 "📦   📦   📦"                  + "<br>"
                            + szovG(tomb)+ "<br>"
                            + "Ez pedig egy harmadik sor.</html>";
        
   int valasztas = JOptionPane.showOptionDialog(null, message, "találd ki", 0, 0, null,lista , tomb);
    if(tomb[valasztas].isKincs()){
        JOptionPane.showMessageDialog(null, tomb[valasztas].getAnyag()+" Láda: Igen én rejtem a kincset GG");} 
    else{JOptionPane.showMessageDialog(null, tomb[valasztas].getAnyag()+" Láda: Nem én rejtem a kicset "); }
    }
    
    public String[] generalas(Lada[] tomb){
     String[] anyagL=new String[tomb.length];
        for (int i = 0; i < tomb.length; i++) {
             anyagL[i] = tomb[i].getAnyag();
        }
          
          
        
        return anyagL;
    
    
    }
   public String szovG(Lada[] tomb) {
    String Szov = "";
    for (Lada lada : tomb) {
        Szov += "<br>" +lada.getAnyag()+": " + lada.getAllitas() + "<br>";
    }
    return Szov;
}

         
                        
    
    
    
    
    
}
