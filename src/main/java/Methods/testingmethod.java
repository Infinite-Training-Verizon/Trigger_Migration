package Methods;

public class testingmethod {
        public static int studentLoan(int age, int Id, Long batchId, char grade) {
            System.out.println("Age: " + age + " BatchId: " + batchId + " Grade: " + grade);
            return age * 20;
        }
    public static int myloan(int loan){
            System.out.println("Loan: " + loan);
            return loan;
    }
        public static void main(String[] args) {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Student " + i + " returned age: " + studentLoan(i, i + 1, 232323L, 'A'));
//                break;
//            }
            for(int i = 0; i < 5; i++) {
                System.out.println("Student loan " + (myloan(i)));
            }

        }
    }