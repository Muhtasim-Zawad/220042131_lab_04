public class TransactionParserFactory {
    TransactionParser getParser(String fileType) {
        switch (fileType.toLowerCase()) {
            case "csv":
                return new CSVParser();
                break;
            case "json":
                return new JSONParser();
                break;
            case "xml":
                return new XMLParser();
                break;
            default:
                throw new IllegalArgumentException("Unknown file type: " + fileType);
        }
    }
}
