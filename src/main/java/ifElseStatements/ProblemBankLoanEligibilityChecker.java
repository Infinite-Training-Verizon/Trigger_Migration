package ifElseStatements;

public class ProblemBankLoanEligibilityChecker {
    public static void main(String[] args) {
        int customer=21;
        int creditScore=300;
        int earns=50000;
        boolean existingLoan=false;
        String loanStatus;
        if(customer>=21 && creditScore>=700 & earns>=50000 && existingLoan==false){
            loanStatus="Loan Approved";
        }else{
            if(customer>=21 && creditScore>=650 && earns>=40000 &&  existingLoan==false){
                System.out.println("Loan Under Review");
            }else {
                System.out.println("Loan rejected");
            }
        }
    }
}

//Business requirements
//1.If the customer is 21 or older, has a credit score of at least 700, earns $50,000 or more, and has no existing loan, print "Loan Approved".
//2. Otherwise, if the customer is 21 or older, has a credit score of at least 650, earns $40,000 or more, and has no existing loan, print "Loan Under Review".
//3. Otherwise, print "Loan Rejected".