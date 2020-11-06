import java.util.List;

public interface Ads {
    List<Ad> all();
    void insert (Ad ad);///added this line to implement the "insert" and "all" in ListAdsDao.java
}
