package automationjunit.utilidades;

public class Utilidades {
    public static void espera(long tiempo) {
        tiempo = tiempo * 1000;
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
