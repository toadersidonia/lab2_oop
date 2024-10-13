import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int numar = 10;
        long numarMare = 1000001;
        float zecimal1 = (float) 0.5;
        double zecimal2 = 1.2d;
        String prenume = "Ion";
        String nume = "Popescu";

        //6.2

        String numar1 = "100";
        int numarTransformat = Integer.parseInt(numar1); //Integer - clasa(are metodele ei, are intMinValue..), int - primitiva
        System.out.println(numarTransformat);

        System.out.println(Integer.toString(numarTransformat));

        //6.3

        byte byteValMax = Byte.MAX_VALUE; //Byte E INTRE (-128, 127)
        System.out.println(byteValMax);
        System.out.println((byte)(byteValMax + 1));
        System.out.println((byte)(byteValMax + 2));

        int intValMax = Integer.MAX_VALUE;
        System.out.println(intValMax);
        System.out.println(intValMax + 10);

        float floatValMax = Float.MAX_VALUE;
        float nrFloat = 2.5f;
        System.out.println(floatValMax * nrFloat);

        float nrFloat1 = 1.23456789123f;
        double nrTransformatDouble = (double)nrFloat1;
        System.out.println(nrFloat1);
        System.out.println(nrTransformatDouble);

        //pt double BigDecimal, pt int BigInteger

        //6.4

        int nrInt1 = 456;
        try {
            System.out.println(nrInt1 / 0); //ArithmeticExeption
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Salut");

        float nrneg = -2.4566f;
        System.out.println(nrneg / 0); //-Infinity

        float nrpos = 2.4464f;
        System.out.println(nrpos / 0); //Infinity

        System.out.println(nrneg / 0 + nrpos / 0); //Not a number

        System.out.println((nrneg / 0) * (nrpos / 0));

        //boolean nrBool = 2; //NU SE POATE
        //int nrIntreg2 = 3.4544f;
        int nrIntreg2 = (int)3.2444f;
        System.out.println(nrIntreg2);

        //6.6 met 1
        BigInteger nr1 = new BigInteger("1");
        BigInteger sum = new BigInteger("0");

        for(int i = 0; i < 64; i++){  //1 + 2 + 2^2 + .... + 2^63
            sum = sum.add(nr1);
            nr1 = nr1.multiply(BigInteger.valueOf(2));
        }
        System.out.println(sum);

        //met2
        nr1 = BigInteger.valueOf(2);
        sum = BigInteger.valueOf(0);

        for(int i = 0; i < 64; i++){
            sum = sum.add(nr1.pow(i));
        }
        System.out.println(sum);

        //6.5

        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numele : ");
        String nume1 = in.nextLine();
        System.out.println(nume1);

        System.out.println("Introduceti varsta : ");
        int varsta1 = in.nextInt();
        System.out.println(varsta1);

        in.close();

    }
}


