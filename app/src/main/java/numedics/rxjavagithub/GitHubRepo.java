package numedics.rxjavagithub;

/**
 * Created by afisher on 11/17/2017.
 */

public class GitHubRepo {
    public final int id;//try making these private and not final
    public final String userName;
    public final String url;
    public final String description;
    public final String codeLanguage;
    public final int starCount;


    public GitHubRepo(int id, String userName, String url, String description, String codeLanguage, int starCount) {
        this.id = id;
        this.userName = userName;
        this.url = url;
        this.description = description;
        this.codeLanguage = codeLanguage;
        this.starCount = starCount;
    }

}
