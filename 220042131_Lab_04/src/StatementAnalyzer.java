import java.util.ArrayList;
import java.util.List;

public class StatementAnalyzer {
    private List<Transaction> transactions;

    public StatementAnalyzer(TransactionParser parser, String filePath) throws Exception {
        this.transactions = parser.parse(filePath);
    }

    public double calcTotalBalance() {
        double totalBalance = 0;
        for (Transaction transaction : transactions) {
            totalBalance += transaction.getAmount();
        }
        return totalBalance;
    }

    public long countTransactionsInMonth(String month) {
        long count = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getDate().equals("month")) {
                count += 1;
            }
        }
        return count;
    }

    public List<Transaction> getTopExpenses() {
        transactions = new ArrayList<Transaction>();
        for (Transaction transaction : transactions) {


        }
        return null;
    }

    public String getTopSpendingCategory() {
        String category = "";
        double tempBalance = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() >=  tem) {}
        }
        return null;
    }
}
