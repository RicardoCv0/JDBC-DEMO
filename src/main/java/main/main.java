
package main;

import Controlador.ControladorProducto;
import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.VProducto;

public class main {

    public static void main(String[] args) {
        Producto pro = new Producto();
        ConsultasProducto proC = new ConsultasProducto();
        VProducto frmPro = new VProducto();
        ControladorProducto ctrlPro = new ControladorProducto(pro,frmPro, proC);
        frmPro.setVisible(true);

    }

}