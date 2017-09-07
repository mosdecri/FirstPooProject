package LibraryServices;

public class Resource
{
    private String summary;

    Resource(String pSummary)
    {
        setSummary(pSummary);
    }

    public String getSummary() {
        return summary;
    }

    private void setSummary(String summary) {
        this.summary = summary;
    }
}
