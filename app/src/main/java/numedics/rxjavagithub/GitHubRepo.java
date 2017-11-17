package numedics.rxjavagithub;

/**
 * Created by afisher on 11/17/2017.
 */

public class GitHubRepo {
    private final int id;//try making these private and not final
    private final String name;
    private final String url;
    private final String description;
    private final String language;
    private final int stargazersCount;


    public GitHubRepo(int id, String name, String url, String description, String language, int stargazersCount) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.description = description;
        this.language = language;
        this.stargazersCount = stargazersCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }

    public int stargazersCount() {
        return stargazersCount;
    }

}
