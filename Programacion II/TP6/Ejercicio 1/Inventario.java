
import java.util.ArrayList;

class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        // Inicializa la coleccion dinamica
        this.productos = new ArrayList<>();
    }

    // Metodo para agregar un producto al inventario
    public void agregarProducto(Producto p) {
        // Llama al metodo para buscar el producto, pasandole su id por getter y verifica si ya está
        if (buscarProductoPorId(p.getId()) != null) {
            System.out.println("Producto ID " + p.getId() + " ya existe. No se agregó.");
            return;
        }
        // Procede a agregar el producto al ArrayList, mostrándolo
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }

    // Método para listar todos los productos
    public void listarProductos() {
        // Comprueba si el ArrayList está vacío
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("\n--- LISTADO COMPLETO DEL INVENTARIO ---");
        // Recorre el ArrayList mostrando cada producto
        for (Producto p : productos) {
            p.mostrarInfo();
        }
        System.out.println("----------------------------------------\n");
    }

    // Método para buscar un producto por ID
    public Producto buscarProductoPorId(String id) {
        // Recorre el ArrayList y si lo encuentra lo devuelve
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        // y si no lo encuentra retorna un null
        return null;
    }
    
    // Para mostrar el producto primero lo buscamos por ID 
    public void mostrarProductoPorId(String id) {
        // Llamamos al metodo de buscar producto y le pasamos ID
        Producto p = buscarProductoPorId(id);
        // Si lo encontró, mostramos la info del mismo
        if (p != null) {
            System.out.println("Producto con ID " + id + ":");
            p.mostrarInfo();
        } else {
            // Si no lo encontró, nos devolvió un null, por lo que cae acá
            System.out.println("No se encontró ningún producto con ID " + id);
        }
    }

    // Para elminiar el producto primero lo buscamos por ID 
    public boolean eliminarProducto(String id) {
        // Llamamos al metodo de buscar producto y le pasamos ID
        Producto p = buscarProductoPorId(id);
        // Si lo encontró, lo borra
        if (p != null) {
            productos.remove(p);
            System.out.println("Producto eliminado: " + p.getNombre());
            return true;
        }
        System.out.println("No se pudo eliminar. Producto con ID " + id + " no encontrado.");
        return false;
    }

    // Para actualizar el stock de un producto primero lo buscamos por ID 
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock de '" + p.getNombre() + "' actualizado a " + nuevaCantidad);
        }
        System.out.println("No se pudo actualizar el stock. Producto ID " + id + " no encontrado.");
    }

    // Método para filtrar y mostrar productos por Categoría
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n--- PRODUCTOS FILTRADOS POR CATEGORÍA: " + categoria.name() + " ---");
        // Seteamos por defecto a false
        boolean encontrado = false;
        for (Producto p : productos) {
            // Si lo encuentra seteamos a true para que salte el if que avisa que no existe
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en esta categoría.");
        }
        System.out.println("---------------------------------------------------\n");
    }

    // Método para obtener el stock total
    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto p : productos) {
            totalStock += p.getCantidad();
        }
        return totalStock;
    }

    // Método para obtener el producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        // Toma primer producto como referencia
        Producto mayorStock = productos.get(0);
        // Compara con el resto del ArrayList
        for (int i = 1; i < productos.size(); i++) {
            Producto actual = productos.get(i);
            if (actual.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = actual;
            }
        }
        return mayorStock;
    }

    // Método para filtrar productos por un rango de precio
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\n--- PRODUCTOS FILTRADOS POR PRECIO ENTRE $" + min + " y $" + max + " ---");
        boolean encontrado = false;
        for (Producto p : productos) {
            double precio = p.getPrecio();
            if (precio >= min && precio <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
             System.out.println("No se encontraron productos en este rango de precio.");
        }
        System.out.println("---------------------------------------------------\n");
    }

    // Método para mostrar todas las categorías disponibles
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- CATEGORIAS DISPONIBLES ---");
        // Recorro los enum
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println("-> " + cat.name() + ": " + cat.getDescripcion());
        }
        System.out.println("--------------------------------------------\n");
    }
}