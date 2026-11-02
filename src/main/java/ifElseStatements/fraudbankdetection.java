package ifElseStatements;

public class fraudbankdetection {
    public static void main(String[] args) {
                int accountBalance = 15000;
                int transactionAmount = 8000;
                int creditScore = 720;
                int accountAge = 3;
                boolean accountActive = true;
                boolean internationalTransaction = true;
                boolean suspiciousActivity = false;

                // Rule 1: Reject inactive or suspicious accounts
                if (!accountActive || suspiciousActivity) {

                    System.out.println("Transaction Rejected");

                    // Rule 2: Check available balance
                } else if (transactionAmount > accountBalance) {

                    System.out.println("Insufficient Funds");

                    // Rule 3: Check international transactions
                } else if (internationalTransaction
                        && transactionAmount > 5000) {

                    System.out.println("Fraud Review Required");

                    // Rule 4: Check credit score and account age
                } else if (creditScore < 650 || accountAge < 2) {

                    System.out.println("High Risk Transaction");

                    // Rule 5: Approve transaction
                } else {

                    System.out.println("Transaction Approved");
                }

                System.out.println("Transaction Amount: "
                        + transactionAmount);

                System.out.println("Account Balance: "
                        + accountBalance);
            }
        }



/* Business requirements
Your program must follow these rules in the order shown.
Priority	Transaction status	Conditions

1	Transaction Rejected	Account is inactive OR suspicious activity is detected
2	Insufficient Funds	Transaction amount exceeds account balance
3	Fraud Review Required	International transaction AND amount exceeds $5,000
        4	High Risk Transaction	Credit score below 650 OR account age below 2 years
5	Transaction Approved	None of the above conditions apply


Test your code with these scenarios

After writing your program, change the variable values and verify that the correct status is printed.
Test	Changed values	Expected result
1	accountActive = false	Transaction Rejected
2	transactionAmount = 20000	Insufficient Funds
3	internationalTransaction = true, transactionAmount = 9000	Fraud Review Required
4	internationalTransaction = false, creditScore = 600	High Risk Transaction
5	internationalTransaction = false, transactionAmount = 2000, creditScore = 750	Transaction Approved*/