public class Main {
    public static void main(String[] args) throws Exception {
        TransactionParser parser = TransactionParserFactory.getParser("json");
        StatementAnalyzer analyzer = new StatementAnalyzer(parser, "src/test.json");

        System.out.println("Total Balance: " + analyzer.calcTotalBalance());
        System.out.println("Transactions in February: " + analyzer.countTransactionsInMonth("02-02-2017"));
        System.out.println("Top Expenses: " + analyzer.getTopExpenses());
        System.out.println("Top Spending Category: " + analyzer.getTopSpendingCategory());
    }
}