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
    /** 
*	constructor de NumB10. número en base 10 
*	@param num valor del número en base 10 
*/ 

    public NumB10(int num) { 
        this.num = num; 
    } 
 /** 
*	assigna el valor al número. 
*	@param num valor a assignar 
 */ 

    public void setNum(int num) {         this.num = num; 
    } 
 
    @Override 
public String toString() { 
return num; // (error 1)
} 
    public String canviaABase(int base) {     if(base<2||base>24){ 
        throw new ArithmeticException("la base va de 2 a 24"); 
    } 
String digits = "0123456789ABCDEFGHIJKLMN; // (error 2)
    String cad = ""; 
while (num > “O”) { // (error 3)
        cad = cad + digits.charAt(num % base);         num = num / base; 
    } 
    return alReves(cad);  // crida al mètode alReves 
} 

    

}
