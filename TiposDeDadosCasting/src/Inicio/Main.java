package Inicio;

import java.util.Arrays;

/**
 *  Classe de exemplo de variáveis, tipos de dados e operadores aritméticos
 *
 *  byte: -128 até 127
 *  short: -32768 até 32767
 *  int: -2.147.483.648 até 2.147.483.647
 *  long: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807
 *  float: +-3.40282347E+38F
 *  double: +-1.79769313486231570E+308
 */
public class Main {

    public static void main(String[] args) {

        byte b1;
        short s1 = 1000; //short > byte
        b1 = (byte) s1; //aqui estou convertendo um short para byte(maior espaço, para menos espaço = Downcasting)Haverá perda de informação

        long l1;
        int i1 = 10; //int < long
        l1 = i1; //aqui não houve perda de informação, pois houve uma promoção, um UPcasting

        int i2;
        long l2 = 1000000000000000000L; //haverá perda de informação
        i2 = (int) l2;

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; //Downcast sem perdas pq cabe

        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2;
        double d3 = 10000.5888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3;

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4; //aqui não há arredondamento, ele simplesmente ignorou as casas decimais!!!

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3; //converti o doble para byte (houve perda enorme de dados rsrs...)

        System.out.println("b1: " + b1);

    }
}
