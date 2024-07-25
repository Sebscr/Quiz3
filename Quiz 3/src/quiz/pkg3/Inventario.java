/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg3;
import javax.swing.JOptionPane;
/**
 *
 * @author sebas
 */
public class Inventario {
    private double Codigo;
    private String NombreProducto;
    private String NombreEmpleado;
    private double Cedula;
    private double PrecioBase;
    private double PrecioBruto;
    private String TipoProducto;
    private double GananciaEsperada;

    private Inventario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void info (double Codigo,String NombreProducto,String NombreEmpleado, double Cedula, double PrecioBase,double PrecioBruto, String TipoProducto,double GananciaEsperada){
        this.Codigo= Codigo;
        this.NombreProducto= NombreProducto;
        this.NombreEmpleado= NombreEmpleado;
        this.Cedula= Cedula;
        this.PrecioBase= PrecioBase;
        this.PrecioBruto= PrecioBruto;
        this.TipoProducto= TipoProducto;
        this.GananciaEsperada= GananciaEsperada;
    }

    public double getCodigo() {
        return Codigo;
    }

    public void setCodigo(double Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public double getCedula() {
        return Cedula;
    }

    public void setCedula(double Cedula) {
        this.Cedula = Cedula;
    }

    public double getPrecioBase() {
        return PrecioBase;
    }

    public void setPrecioBase(double PrecioBase) {
        this.PrecioBase = PrecioBase;
    }

    public double getPrecioBruto() {
        return PrecioBruto;
    }

    public void setPrecioBruto(double PrecioBruto) {
        this.PrecioBruto = PrecioBruto;
    }

    public String getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(String TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    public double getGananciaEsperada() {
        return GananciaEsperada;
    }

    public void setGananciaEsperada(double GananciaEsperada) {
        this.GananciaEsperada = GananciaEsperada;
    }
        public void PedirInfo(){
        String NombreSuper= JOptionPane.showInputDialog(null,"Ingrese el nombre del Super Mercado:");
        String NombreEmpleado= JOptionPane.showInputDialog(null,"Ingrese su nombre:");
        double Cedula= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese su cedula:")); 
        int CantidadProductos= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar:"));
        Inventario[] arrInventario = new Inventario[CantidadProductos];
        for (int x=0; x<arrInventario.length;x++){
            String NombreProducto= JOptionPane.showInputDialog(null,"Ingrese el nombre del Producto:");
            double CodigoProducto= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el codigo del producto:"));
            double PrecioBase= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el precio base del producto:"));
            String TipoProducto= JOptionPane.showInputDialog(null,"Ingrese el tipo de Producto (Alimentos, Bebidas, Higiene o Limpieza):");
            arrInventario[x]= new Inventario();
            if (TipoProducto.equals("Alimentos")){
            double ProductoBruto1= PrecioBase * (0.2) + PrecioBase;
            }
            if (TipoProducto.equals("Bebidas")){
            double ProductoBruto1= PrecioBase * (0.3) + PrecioBase;
            }
            if (TipoProducto.equals("Higiene")){
            double ProductoBruto1= PrecioBase * (0.25) + PrecioBase + 500;
            }
            if (TipoProducto.equals("Limpieza")){
            double ProductoBruto1= PrecioBase * (0.19) + PrecioBase * (0.04) + 1000 +PrecioBase;
            }
            arrInventario[x]= new Inventario();
    }
    }
public static void ArregloInventario(){

        String TipoProducto= JOptionPane.showInputDialog(null,"Ingrese el tipo de Producto (Alimentos, Bebidas, Higiene o Limpieza):");
        if (TipoProducto.equals("Alimentos")){
            double ProductoBruto1= PrecioBase * (0.2) + PrecioBase;
            
        }
        
        
        
        
    }
}
    
    public void InfoProductos(){
        
    }
}
