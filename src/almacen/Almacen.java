/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class Almacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Op = 0,s=0;
         Tecnologia Tec = new Tecnologia();
         Mercado Mer = new Mercado();
 do{   
Op = Integer.parseInt(JOptionPane.showInputDialog("Que Desea Realizar \n 1-Ver Catalogo \n 2- Agregar Un Producto "));

switch (Op) { //Opcion Principal
            
case 1://catalogo
                
Op = Integer.parseInt(JOptionPane.showInputDialog("Que Desea Realizar \n 1-Tecnologia \n 2-Mercado ")); 

switch (Op) {
    
case 1: // Tecnolgia
                    
Op = Integer.parseInt(JOptionPane.showInputDialog("Que Desea Realizar \n 1-Televisores \n 2-Tablets \n 3-Blu Ray \n 4- Teatro En Casa"));

switch (Op) {
                     
case 1:// Ver Televisores 
    
Op = Integer.parseInt(JOptionPane.showInputDialog("Elija La Marca: \n 1-Samsung \n 2- Sony \n 3-Hisense \n 4-Lg "));    
 
switch (Op){
    case 1:
                Tec.setTv1("Samsung", 1, 1200500, 30, "Full HD");
                Tec.showTv1();

                Tec.setTv2("Samsung", 2, 1300000, 15, "3D");
                Tec.showTv2();
                
                Tec.setTv3("Samsung", 3, 1500000, 10, "Ultra HD");
                Tec.showTv3();
    break; 
    
    case 2:
                
                Tec.setTv4("Sony", 4, 1000000, 20, "Slim");
                Tec.showTv4();
    break;
    
    case 3:
                
                Tec.setTv5("Hisense", 5, 800000, 35, "Stereo");
                Tec.showTv5();
    break;
    
    case 4:
                Tec.setTv6("Lg", 6, 2000000, 10, "3D Full HD");
                Tec.showTv6();
    break;
}
break;
case 2://Tablets
    Op = Integer.parseInt(JOptionPane.showInputDialog("Elija La Marca \n 1-Samsung \n 2-AOC "));

switch (Op){
    case 1:
                
                Tec.setTables1("Samsung Galaxy", 06, 400000, 0, "");
                Tec.showTables1();  
                break;
    case 2:
                Tec.setTables2("AOC", 89, 99000, 0, "8 Gb");
                Tec.showtables2();
        
    break;
          default:
                    System.out.println("la opcion no exite");break;
        }
break;
                
case 3://Blu Ray
                Tec.setbluray("Samsung", 75, 99000, 0, "bdfs1662x");
                Tec.showbluray();
                break;
                    
case 4:// Teatro en casa
                Tec.setteatroencasa("Sony", 32, 552210, 0, "rms3D");
                Tec.showteatroencasa();
                break;  
    
      default:
                    System.out.println("la opcion no exite");break;
                 }  
break;
 case 2://Mercado
 Op = Integer.parseInt(JOptionPane.showInputDialog("1-Arroz \n 2-Azucar \n 3-Sal \n 4-Huevos \n 5-Carne"));
 
 switch (Op){
    case 1:
          
            Mer.setarroz("Diana", 1800, 0, "Arroz Con vitaminas", 01);
            Mer.showarroz();
    break;
    case 2:
        
            Mer.setazucar("Manuelita", 1200, 0, "Blanca", 02);
            Mer.showazucar();
    break;
    case 3:
        
            Mer.setsal("Refisal", 500, 0, "En Tarro", 03);
            Mer.showsal();
    break;  
    case 4:
         
            Mer.sethuevos("Del Galpon", 300, 0, "AA", 04);
            Mer.showhuevos();
    break; 
    case 5:
        
            Mer.setcarne("Pepino", 5000, 0, "Res", 05);
            Mer.showcarne();
    break;    
        
 }
 
             break;
       default:
                    System.out.println("la opcion no exite");break;
}
       
break;

case 2: //Agregar Un Producto
           // Op = Integer.parseInt(JOptionPane.showInputDialog("Que Desea ingresar\n 1-Tecnologia \n 2-Mercado "));
             switch (Op) {   
                 
                 case 1:
                      Tec.setnuevo_producto(JOptionPane.showInputDialog("ingrese marca"),Integer.parseInt(JOptionPane.showInputDialog("ingrese codigo")),Integer.parseInt(JOptionPane.showInputDialog("ingrese referencia")),Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio ")),JOptionPane.showInputDialog("ingrese descuento"));
System.out.println("SU NUEVO PRODUCTO SE AGREGO SATISFACTORIAMENTE ESTOS SON LOS SIGUIENTES VALORES INGRESADOS\n");
    
   Tec.shownuevo_producto();
                  
              break;
                     
                 case 2:
    Tec.setnuevo_producto(JOptionPane.showInputDialog("ingrese marca"),Integer.parseInt(JOptionPane.showInputDialog("ingrese codigo")),Integer.parseInt(JOptionPane.showInputDialog("ingrese referencia")),Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio ")),JOptionPane.showInputDialog("ingrese descuento"));
System.out.println("SU NUEVO PRODUCTO SE AGREGO SATISFACTORIAMENTE ESTOS SON LOS SIGUIENTES VALORES INGRESADOS\n");
    
   Tec.shownuevo_producto();
                   break;
         default:
                    System.out.println("la opcion no exite");break;
        }
      break;      
  default:
                    System.out.println("la opcion no exite");break;
      
      
      
      
}

  s = Integer.parseInt(JOptionPane.showInputDialog("si desea volver al inicio digite 1 \n Si desea terminar digite cualquier tela"));
    }while(1==s);
 }
}