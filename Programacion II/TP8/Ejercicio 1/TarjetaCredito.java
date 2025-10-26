
class TarjetaCredito implements Pago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con Tarjeta de Crédito por $" + monto);
        // Acá iría un lógica de validación del pago
        return true; 
    }
}
