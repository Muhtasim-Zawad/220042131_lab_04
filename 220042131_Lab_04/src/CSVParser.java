import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVParser implements  TransactionParser {
    @Override
    public List<Transaction> parse(String filePath) throws FileNotFoundException {
        List<Transaction> transactions = new ArrayList<Transaction>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        while (line != null) {
            String[] data =line.split(",");

            String date = data[0];
            String[] dateDetails = date.split("-");
            int month = Integer.parseInt(dateDetails[1]);
            int amount = Integer.parseInt(data[1]);
            String type = data[2];
            transactions.add(new Transaction(month, amount, type));
            line = reader.readLine();

    }
}
