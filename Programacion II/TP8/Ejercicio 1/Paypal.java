
class PayPal implements PagoConDescuento {
    private static final double DESCUENTO = 0.05; // 5%

    @Override
    public double aplicarDescuento(double montoBase) {
        return montoBase * (1 - DESCUENTO);
    }

    @Override
    public boolean procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("Procesando pago con PayPal por $" + monto + ". Aplicado 5% de descuento. Total: $" + montoFinal);
        // Acá iría un lógica de validación del pago
        return true; 
    }
}

