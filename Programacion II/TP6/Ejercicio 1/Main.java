
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        System.out.println("--- Sistema de Inventario Inicializado (TP 6) ---");

        // Antes de insertar productos listamos inventario y vemos que está vacío.
        System.out.println("\n.:: ESTADO INICIAL DEL INVENTARIO ::.");
        inventario.listarProductos();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        System.out.println("\n.:: TAREA 1: CREAR Y AGREGAR 5 PRODUCTOS ::.");
        
        Producto p1 = new Producto("A001", "Manzanas x Kg", 2500.00, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E002", "Smart TV 55\"", 250000.00, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R003", "Remera Algodón", 1500.00, 120, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H004", "Juego de Sábanas", 3200.00, 30, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("E005", "Mouse Inalámbrico", 1200.00, 75, CategoriaProducto.ELECTRONICA);
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        // 2. Listar todos los productos mostrando su información y categoría.
        System.out.println("\n.:: TAREA 2: LISTAR TODOS LOS PRODUCTOS ::.");
        inventario.listarProductos();

        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("\n.:: TAREA 3: BUSCAR PRODUCTO POR ID (R003) ::.");
        inventario.mostrarProductoPorId("R003");
        
        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica (ELECTRONICA).
        System.out.println("\n.:: TAREA 4: FILTRAR POR CATEGORÍA (ELECTRONICA) ::.");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // 5. Eliminar un producto por su ID (A001) y listar los productos restantes.
        System.out.println("\n.:: TAREA 5: ELIMINAR PRODUCTO (A001) Y LISTAR RESTANTES ::.");
        inventario.eliminarProducto("A001");
        inventario.listarProductos();
        
        // 6. Actualizar el stock de un producto existente (E002).
        System.out.println("\n.:: TAREA 6: ACTUALIZAR STOCK (E002) ::.");
        inventario.actualizarStock("E002", 15); // Stock de Smart TV sube de 5 a 15
        inventario.mostrarProductoPorId("E002");

        // 7. Mostrar el total de stock disponible.
        System.out.println("\n.:: TAREA 7: OBTENER TOTAL DE STOCK ::.");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("El stock total disponible en el inventario es de: " + totalStock + " unidades.");

        // 8. Obtener y mostrar el producto con mayor stock.
        System.out.println("\n.:: TAREA 8: PRODUCTO CON MAYOR STOCK ::.");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("El producto con mayor stock es:");
            mayorStock.mostrarInfo();
        } else {
            System.out.println("El inventario está vacío.");
        }

        // 9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("\n.:: TAREA 9: FILTRAR PRODUCTOS POR PRECIO ($1000 - $3000) ::.");
        inventario.filtrarProductosPorPrecio(1000.00, 3000.00);

        // 10. Mostrar las categorías disponibles con sus descripciones.
        System.out.println("\n.:: TAREA 10: MOSTRAR CATEGORÍAS DISPONIBLES ::.");
        inventario.mostrarCategoriasDisponibles();
    }
}
