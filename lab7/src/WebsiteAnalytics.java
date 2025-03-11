import java.util.HashSet;
import java.util.Set;

public class WebsiteAnalytics {
    private final Set<String> uniqueVisitors = new HashSet<>();

    public void addVisitor(Visitor visitor) {
        uniqueVisitors.add(visitor.ip);
    }

    public int getUniqueVisitorCount() {
        return uniqueVisitors.size();
    }

    public Set<String> getAllUniqueIPs() {
        return uniqueVisitors;
    }
}
