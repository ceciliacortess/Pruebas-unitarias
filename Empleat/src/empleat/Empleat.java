/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleat;

/**
 *
 * @author Alumno
 */
public class Empleat {

    public double calculaSalariBrut(String tipusEmpleat, double vendesMes, int horesExtra) throws MaException {
        double salarioBase;
        double prima = 0;
        double hExtra = horesExtra * 18.57;
        if (!tipusEmpleat.equals("venedor") && !tipusEmpleat.equals("encarregat")) {
            throw new MaException("El tipus de venedor no es correcte");
        }
        if (vendesMes < 0 || horesExtra < 0) {
            throw new MaException("El valor no pot ser negatiu");
        }
        if (tipusEmpleat.equals("venedor")) {
            salarioBase = 1000;
        } else {
            salarioBase = 1500;
        }
        if (vendesMes >= 1000) {
            prima = 100;
        }
        if (vendesMes > 2500) {
            prima = 200;
        }
        return salarioBase + prima + hExtra;
    }

    public double calculaSalariNet(double salariBrut) throws MaException {
        double retencion = 0;
        if (salariBrut < 0) {
            throw new MaException("El salario bruto no puede ser negativo");
        }
        if (salariBrut >= 1000 && salariBrut <= 1500) {
            retencion = 0.16;
        }
        if (salariBrut >= 1501) {
            retencion = 0.20;
        }
        return salariBrut * (1 - retencion);
    }
}
