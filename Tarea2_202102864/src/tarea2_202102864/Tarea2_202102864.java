/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2_202102864;

/**
 *
 * @author alvar
 */
public class Tarea2_202102864 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usuario[] usuarios = new Usuario[3];
        
        usuarios[0] = new Usuario(202102864,"Alvaro","Arenas","202102864");
        
        Login ventana = new Login(usuarios);
        ventana.setVisible(true);
    }
    
}
