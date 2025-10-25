
class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    // Constructor con 'this.' para desambigüar
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    // Setter para actualizar stock (usado en Inventario.actualizarStock)
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método que usa toString() para la salida
    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    // Sobrescribe toString() para una representación legible
    @Override
    public String toString() {
        
        return "ID: " + id + 
               " | Nombre: " + nombre + 
               " | Precio: " + precio + 
               " | Stock: " + cantidad + 
               " | Categoría: " + categoria.name() + 
               " (" + categoria.getDescripcion() + ")";
    }
}