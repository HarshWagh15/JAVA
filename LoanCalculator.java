import java.util.*;
class LoanCalculator{
public static void main(String[] args) {
Scanner SC=new Scanner(System.in);
System.out.println("Loan Calculator");
System.out.println("Enter the Amount:");
float amount=SC.nextFloat();
System.out.println("Enter the ROI:");
float roi=SC.nextFloat();
System.out.println("Enter Tenure in months:");
int tenure=SC.nextInt();

String STR=(tenure/12)+"."+(tenure%12);
float con=Float.parseFloat(STR);
System.out.println();

System.out.println("Loan Calculation");
System.out.println("Principle Amount:"+amount);
System.out.println("ROI:"+roi+"%");
System.out.println("Tenure:"+tenure+"months");

float intYear=amount*roi/100;
float totalInterest=intYear*con;
System.out.println("Interst:"+totalInterest);
float outStandingAmount=amount*totalInterest;
System.out.println("outStandingAmount:"+(outStandingAmount));
System.out.println("EMI:"+(outStandingAmount/tenure)+"rs");
}
}