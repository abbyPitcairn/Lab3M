//Silas Code
public class postFixCalTesting {

 public double precision(IStack stack, IPostFixCal calculator) throws Exception {
     double corResults = 0;
     String postFix1 ="12+3*";
     String postFix2 ="31-5*";
     String postFix3 ="62+4/";
     String postFix4 ="83-5/";
     String postFix5 ="99*6+";
     
     if(calculator.calculate(stack, postFix1 )==9) {
         corResults+=1;
     }
     if(calculator.calculate(stack, postFix2)==10) {
         corResults+=1;
     }
     if(calculator.calculate(stack, postFix3)==2) {
         corResults+=1;
     }
     if(calculator.calculate(stack, postFix4)==1) {
         corResults+=1;
     }
     if(  calculator.calculate(stack, postFix5)==87) {
         corResults+=1;
     }
     
     
   
     
     
     return corResults / 5.0;
     
 }
    
}
