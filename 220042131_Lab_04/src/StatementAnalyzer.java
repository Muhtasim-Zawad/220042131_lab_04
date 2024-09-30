import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StatementAnalyzer {
    private List<Transaction> transactions;

    public StatementAnalyzer(TransactionParser parser, String filePath) throws Exception {
        this.transactions = parser.parse(filePath);
    }

    public double calcTotalBalance() {
        return 0;
    }

    public long countTransactionsInMonth(String month) {
        return 0;
    }

    public List<Transaction> getTopExpenses(int topN) {
        return null;
    }

    public String getTopSpendingCategory() {
        return null;
    }
}
