import javax.swing.*;

public class Inicio {
    public static void main(String[] args) {

        int resp = JOptionPane.NO_OPTION;
        while (resp == JOptionPane.NO_OPTION) {
            try {
                String seleccionConversion = tipoDeConversion();
                if (seleccionConversion.equals("Conversor de moneda")) {
                    String cantidad = (JOptionPane.showInputDialog(null, "Ingrese la cantidad", "Cantidad", 1));
                    if (ValidarNumero(cantidad)) {
                        String tipoMoneda = seleccionTipoDeMoneda();
                        switch (tipoMoneda) {
                            case "PesoMX - DolarUS":
                                double numOperacionDolar = Double.parseDouble(cantidad);
                                JOptionPane.showMessageDialog(null,
                                        "La cantidad de pesos en Dolares es: USD$" + numOperacionDolar * 18.5);
                                break;
                            case "PesoMX - Euro":
                                double numOperacionEuro = Double.parseDouble(cantidad);
                                JOptionPane.showMessageDialog(null,
                                        "La cantidad de pesos en Euros es: EURO$" + numOperacionEuro * 20.18);
                                break;
                            case "PesoMX - LibrasUK":
                                double numOperacionLibras = Double.parseDouble(cantidad);
                                JOptionPane.showMessageDialog(null,
                                        "La cantidad de pesos en Libras es: UK$" + numOperacionLibras * 23.09);
                                break;
                            case "PesoMX - YenJPN":
                                double numOperacionYen = Double.parseDouble(cantidad);
                                JOptionPane.showMessageDialog(null,
                                        "La cantidad de pesos en Yen es: JP$" + numOperacionYen * 0.14);
                                break;
                            case "PesoMX - WonKR":
                                double numOperacion = Double.parseDouble(cantidad);
                                JOptionPane.showMessageDialog(null,
                                        "La cantidad de pesos en Won es: KR$" + numOperacion * 0.014);
                                break;
                            case "DolarUS - PesoMX":
                                double numOperacionDolarPeso = Double.parseDouble(cantidad);
                                JOptionPane.showMessageDialog(null,
                                        "La cantidad de pesos en Dolares es: USD$" + numOperacionDolarPeso * 0.054);
                                break;
                            case "Euro - PesoMX":
                                double numOperacionEuroPeso = Double.parseDouble(cantidad);
                                JOptionPane.showMessageDialog(null,
                                        "La cantidad de pesos en Euros es: EURO$" + numOperacionEuroPeso * 0.049);
                                break;
                            case "LibrasUK - PesoMX":
                                double numOperacionLibrasPeso = Double.parseDouble(cantidad);
                                JOptionPane.showMessageDialog(null,
                                        "La cantidad de pesos en Libras es: UK$" + numOperacionLibrasPeso * 0.043);
                                break;
                            case "YenJPN - PesoMX":
                                double numOperacionYenPeso = Double.parseDouble(cantidad);
                                JOptionPane.showMessageDialog(null,
                                        "La cantidad de pesos en Yen es: JP$" + numOperacionYenPeso * 7.14);
                                break;
                            case "WonKR - PesoMX":
                                double numOperacionWonPeso = Double.parseDouble(cantidad);
                                JOptionPane.showMessageDialog(null,
                                        "La cantidad de pesos en Won es: KR$" + numOperacionWonPeso * 71.42);
                                break;
                        }

                    }else {
                        
                    }
                    
                } else {
                    String temperatura = (JOptionPane.showInputDialog(null, "Ingrese la temperatura", "Temperatura",
                            1));
                    if (ValidarNumero(temperatura)) {
                        String tipoTemperatura = seleccionTipoDeTemperatura();
                        switch (tipoTemperatura) {
                            case "Convertir de Celsius a Fahrenheit":
                                double numOperacion = Double.parseDouble(temperatura);
                                JOptionPane.showMessageDialog(null,
                                        "La cantidad de Grados Celcius a Ferenhait es " + ((numOperacion * 1.8) + 32));
                                break;
                            case "Convertir de Fahrenheit a Celsius":
                                double numOperacion1 = Double.parseDouble(temperatura);
                                JOptionPane.showMessageDialog(null,
                                        "La cantidad de Grados Farenhait a Celcius es "
                                                + ((numOperacion1 - 32) * 0.555556));
                                break;
                        }
                    }
                }
            } catch (NullPointerException ex) {
                confirmacionDeSalida();
            }
        }
    }

    public static String tipoDeConversion() {
        final Object[] opciones = { "Conversor de moneda", "Conversor de temperatura" };
        return JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Menú", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]).toString();
    }

    public static String seleccionTipoDeMoneda() {
        final Object[] opcionesMoneda = { "PesoMX - DolarUS", "PesoMX - Euro", "PesoMX - LibrasUK", "PesoMX - YenJPN",
                "PesoMX - WonKR","DolarUS - PesoMX", "Euro - PesoMX", "LibrasUK - PesoMX", "YenJPN - PesoMX",
                "WonKR - PesoMX"};
        return JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión de moneda",
                "Menú", JOptionPane.PLAIN_MESSAGE, null, opcionesMoneda, opcionesMoneda[0]).toString();
    }

    public static String seleccionTipoDeTemperatura() {
        final Object[] opcionesTemperatura = { "Convertir de Celsius a Fahrenheit",
                "Convertir de Fahrenheit a Celsius" };
        return JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión de temperatura",
                "Menú", JOptionPane.PLAIN_MESSAGE, null, opcionesTemperatura, opcionesTemperatura[0]).toString();
    }

    public static void confirmacionDeSalida() {
        final int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea salir?", "Alerta",
                JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public static boolean ValidarNumero(String cantidad) {
        try {
            double n = Double.parseDouble(cantidad);
            if (n <= 0 || n >= 0) {
                return true;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "No se aceptan espacios en blanco ni letras, unicamente puede ingresar números");
        }
        return false;
    }
}