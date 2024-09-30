import java.io.FileNotFoundException;
import java.util.List;

public interface TransactionParser {
    List<Transaction> parse(String filePath) throws FileNotFoundException;
}
