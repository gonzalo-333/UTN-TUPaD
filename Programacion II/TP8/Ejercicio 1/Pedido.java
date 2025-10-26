import java.util.ArrayList;
import java.util.List;

class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        String mensaje = "El pedido cambió de estado: " + nuevoEstado;
        if (cliente != null) {
            cliente.notificar(mensaje);
        }
    }
}