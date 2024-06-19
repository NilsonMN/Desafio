public class Moneda {
    private String base_code;
    private String target_code;
    private double conversion_rate;
    private double conversion_result;

    public Moneda(MonedaOmdb monedaOmdb) {
        this.base_code = monedaOmdb.base_code();
        this.target_code = monedaOmdb.target_code();
        this.conversion_rate = monedaOmdb.conversion_rate();
        this.conversion_result = monedaOmdb.conversion_result();
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public double getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(double conversion_result) {
        this.conversion_result = conversion_result;
    }

    @Override
    public String toString() {
        return  "Moneda Base= " + base_code + "\n" +
                "Tipo Moneda= " + target_code + "\n" +
                "Valor de Conversion= " + conversion_rate + "\n" +
                "Conversion Total= " + conversion_result;
    }
}
