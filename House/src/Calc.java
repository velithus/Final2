/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ikusa
 */
public class Calc {
    
    public static double housingPayment(double grossIncome){
        return (grossIncome/12)*.18;
    }
    
    public static double housingPaymentPlus(double grossIncome, double monthlyDebt){
        return ((grossIncome/12)*.36)-monthlyDebt;
    }
    
    public static double maxPay(double grossIncome, double monthlyDebt){
       double a = housingPayment(grossIncome);
       double b = housingPaymentPlus(grossIncome, monthlyDebt);
       if (a < b) {
           return a;
       }
       else return b;
    }
}
