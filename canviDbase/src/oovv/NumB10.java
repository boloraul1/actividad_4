/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author bolor
 */
public class NumB10 {

    int num;

    /**
     * constructor de NumB10. número en base 10
     *
     * @param num valor del número en base 10
     */
    public NumB10(int num) {
        this.num = num;
    }

    /**
     * assigna el valor al número.
     *
     * @param num valor a assignar
     */
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates. 
    }

    /**
     * canvia el número de base. accepta des de base 2 fins a 24.
     *
     * @param base a la qual es vol canviar el número
     * @return cadena que representa el número en la base indicada
     * @throws ArithmeticException si la base no està entre 2 i 24
     */
    public String canviaABase(int base) {
        if (base < 2 || base > 24) {
            throw new ArithmeticException("la base va de 2 a 24");
        }

        String digits = "0123456789ABCDEFGHIJKLMN; // (error 2)";
        String cad = "";
        while (num > 0) { // (error 3)
            cad = cad + digits.charAt(num % base);
            num = num / base;
        }

        return alReves(cad);  // crida al mètode alReves 
    }

    /**
     * inverteix una cadena. inverteix l'ordre dels caràcters
     *
     * @param cad la cadena original
     * @return la cadena invertida
     */
    @SuppressWarnings("empty-statement")
    private String alReves(String cad) {
        String reve = "";
        String reves = ""; // (error 4)
        int i = cad.length() - 1;
        while (i >= 0) {
            reves = reves + cad.charAt(i);
            i--;
        }; // (error 5)

        return reve; // (error 6)

    }

    /**
     * transforma el número a notació romana.
     *
     * @return la cadena en notació romana
     * @throws ArithmeticException si el número no està entre 1 i 9999
     */
    public String canviaARoma() throws ArithmeticException {
        int num = 0;
        if (num < 1 || num > 4) {
            throw new ArithmeticException("sols per a números entre 1 i 9999");
        }
        String[][] caracters = {
            {"M", "W", "Ñ"},
            {"C", "D", "M"},
            {"X", "L", "C"},
            {"I", "V", "X"}
        };
        int div = 1000;
        int iBloc = 0;
        String numR = "";
        while (div > 0) {
            int digito = num / div;
            String digitR = "";
            switch (digito) {
                case 9:
                    digitR = caracters[iBloc][0];break;
                case 8:
                    digitR = digitR + caracters[iBloc][0];
                case 7:
                    digitR = digitR + caracters[iBloc][0];
                case 6:
                    digitR = digitR + caracters[iBloc][0];
                case 5:
                    digitR = caracters[iBloc][1] + digitR;
                    break;
                case 4:
                    digitR = caracters[iBloc][0] + caracters[iBloc][1];
                    break;
                case 3:
                    digitR = digitR + caracters[iBloc][0];
                case 2:
                    digitR = digitR + caracters[iBloc][0];
                case 1:

                    digitR.equals(digitR + caracters[iBloc][0]);
                    break;
            }
            numR = numR + digitR;
            iBloc++;
            num = num % div;
            div = div / 10;
        }
        return numR;

    }
}
