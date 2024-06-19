import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Consulta consulta = new Consulta();

        String menu = ("\nBienvenido al Conversor de Moneda\n" +
                "==================================\n" +
                "1. Dolar -> Peso Argentino\n" +
                "2. Peso Argentino -> Dolar\n" +
                "3. Dolar -> Real Brasileño\n" +
                "4. Real Brasileño -> Dolar\n" +
                "5. Dolar -> Peso Colombiano\n" +
                "6. Peso Colombiana -> Dolar\n" +
                "0. Salir\n" +
                "=================================\n" +
                "Ingrese una opcion (0 - 6):");

        String ingcantidad = "Ingrese la cantidad a convertir: ";

        //Moneda moneda = consulta.consultar("ARS",1 );
        //System.out.println(moneda);
        MonedaOmdb monedaOmdb = null;
        Moneda moneda = null;

        while (true){
            System.out.println(menu);
            int opcion = teclado.nextInt();

            if(opcion == 0) {
                break;
            } else if(opcion > 6) {
                System.out.println("\n!!!!Debe ingresar una opción válida!!!!\n");
                continue;
            }
            System.out.println(ingcantidad);
            int cantidad = teclado.nextInt();

            switch (opcion){
                case 1:
                    monedaOmdb = consulta.consultar("USD","ARS", cantidad);
                    moneda = new Moneda(monedaOmdb);
                    System.out.println(moneda);
                    break;
                case 2:
                    monedaOmdb = consulta.consultar("ARS","USD", cantidad);
                    moneda = new Moneda(monedaOmdb);
                    System.out.println(moneda);
                    break;
                case 3:
                    monedaOmdb = consulta.consultar("USD","BRL", cantidad);
                    moneda = new Moneda(monedaOmdb);
                    System.out.println(moneda);
                    break;
                case 4:
                    monedaOmdb = consulta.consultar("BRL","USD", cantidad);
                    moneda = new Moneda(monedaOmdb);
                    System.out.println(moneda);
                    break;
                case 5:
                    monedaOmdb = consulta.consultar("USD","COP", cantidad);
                    moneda = new Moneda(monedaOmdb);
                    System.out.println(moneda);
                    break;
                case 6:
                    monedaOmdb = consulta.consultar("COP","USD", cantidad);
                    moneda = new Moneda(monedaOmdb);
                    System.out.println(moneda);
                    break;
            }
        }
    }
}
