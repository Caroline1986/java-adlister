public class QuotesDAOFactory {
    private static Quotes quotesDAO;
    public static Quotes getQuotesManager() {
        if (quotesDAO == null) {
            quotesDAO = new ListQuotes();
        }
        return quotesDAO;
    }

}
