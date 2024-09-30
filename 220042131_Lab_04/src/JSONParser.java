import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.databind.*;

public class JSONParser implements TransactionParser{
    @Override
    public List<Transaction> parse(String filePath) {
        List<Transaction> transactions = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        try {
            transactions = Arrays.asList(objectMapper.readValue(content, Transaction[].class));
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        }
        return transactions;
    }
}
