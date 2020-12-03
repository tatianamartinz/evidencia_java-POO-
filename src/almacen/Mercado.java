/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package almacen;

/**
 *
 * @author Estudiantes
 */
public class Mercado {
     String nombre;
    double precio;
    double codigo;

    void setarroz(String nom, double pre, double descu, String refe, double codi) {

        this.codigo = codi;
        this.nombre = nom;
        this.precio = pre;

    }

    void showarroz() {

        System.out.println("nombre:" + this.nombre);
        System.out.println("codigo:" + this.codigo);
        System.out.println("precio:" + this.precio);

    }
     void setazucar(String nom, double pre, double descu, String refe, double codi) {

        this.codigo = codi;
        this.nombre = nom;
        this.precio = pre;

    }

    void showazucar() {

        System.out.println("nombre:" + this.nombre);
        System.out.println("codigo:" + this.codigo);
        System.out.println("precio:" + this.precio);

    }
     void setsal(String nom, double pre, double descu, String refe, double codi) {

        this.codigo = codi;
        this.nombre = nom;
        this.precio = pre;

    }

    void showsal() {

        System.out.println("nombre:" + this.nombre);
        System.out.println("codigo:" + this.codigo);
        System.out.println("precio:" + this.precio);

    }
     void sethuevos(String nom, double pre, double descu, String refe, double codi) {

        this.codigo = codi;
        this.nombre = nom;
        this.precio = pre;

    }

    void showhuevos() {

        System.out.println("nombre:" + this.nombre);
        System.out.println("codigo:" + this.codigo);
        System.out.println("precio:" + this.precio);

    }
     void setcarne(String nom, double pre, double descu, String refe, double codi) {

        this.codigo = codi;
        this.nombre = nom;
        this.precio = pre;

    }

    void showcarne() {

        System.out.println("nombre:" + this.nombre);
        System.out.println("codigo:" + this.codigo);
        System.out.println("precio:" + this.precio);

    }
    
}
