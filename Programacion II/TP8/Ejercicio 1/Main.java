
public class Main {
    public static void main(String[] args) {
        Cliente juan = new Cliente("Juan Pérez");
        Producto queso = new Producto("Queso", 500.0);
        Producto leche = new Producto("Leche", 200.0);

        Pedido pedido1 = new Pedido(juan);
        pedido1.agregarProducto(queso);
        pedido1.agregarProducto(leche);

        System.out.println("Total del pedido: $" + pedido1.calcularTotal());

        pedido1.cambiarEstado("EN PREPARACIÓN");
        pedido1.cambiarEstado("ENVIADO");
        
        Pago pagoTC = new TarjetaCredito();
        PagoConDescuento pagoPP = new PayPal();

        pagoTC.procesarPago(pedido1.calcularTotal());
        pagoPP.procesarPago(pedido1.calcularTotal());
        
    }
}
