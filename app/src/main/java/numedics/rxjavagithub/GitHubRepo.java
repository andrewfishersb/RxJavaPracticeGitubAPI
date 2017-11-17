package numedics.rxjavagithub;

/**
 * Created by afisher on 11/17/2017.
 */

public class GitHubRepo {
    private final int id;//try making these private and not final
    private final String userName;
    private final String url;
    private final String description;
    private final String codeLanguage;
    private final int starCount;


    public GitHubRepo(int id, String userName, String url, String description, String codeLanguage, int starCount) {
        this.id = id;
        this.userName = userName;
        this.url = url;
        this.description = description;
        this.codeLanguage = codeLanguage;
        this.starCount = starCount;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getCodeLanguage() {
        return codeLanguage;
    }

    public int getStarCount() {
        return starCount;
    }

}
