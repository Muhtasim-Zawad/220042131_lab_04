public class Main {
    public static void main(String[] args) throws Exception {
        TransactionParser parser = TransactionParserFactory.getParser("json");
        StatementAnalyzer analyzer = new StatementAnalyzer(parser, "transactions.json");

        System.out.println("Total Balance: " + analyzer.calcTotalBalance());
        System.out.println("Transactions in February: " + analyzer.countTransactionsInMonth("02-2017"));
        System.out.println("Top Expenses: " + analyzer.getTopExpenses(10));
        System.out.println("Top Spending Category: " + analyzer.getTopSpendingCategory());
    }
}