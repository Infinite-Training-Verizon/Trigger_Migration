package Methods;

public class returnvalues {
    public static int studentLoan(int age, int Id, Long batchId,char grade) {
        System.out.println(" age " + age + " BatchId " + batchId + " grade "  + grade);
     return age*1;
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Student" + i + "pring studentLoan " + studentLoan(i, 232,233l,'c'));
        }
    }
}
