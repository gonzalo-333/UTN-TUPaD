
class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;       // RELACION DE COMPOSICION
    private Titular titular;            // ASOCIACION BIDIRENCCIONAL

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaClave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.titular = titular;
        this.clave = new ClaveSeguridad(codigoClave, fechaClave);   // ClaveSeguridad por composicion
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }
}