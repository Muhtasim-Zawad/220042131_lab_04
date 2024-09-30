public class TransactionParserFactory {
    public static TransactionParser getParser(String fileType) {
        switch (fileType.toLowerCase()) {
            case "csv":
                return new CSVParser();
            case "json":
                return new JSONParser();
            case "xml":
                return new XMLParser();
            default:
                throw new IllegalArgumentException("Unknown file type: " + fileType);
        }
    }
}
