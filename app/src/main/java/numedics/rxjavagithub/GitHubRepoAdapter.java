package numedics.rxjavagithub;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by afisher on 11/17/2017.
 */

public class GitHubRepoAdapter extends BaseAdapter {

    private List<GitHubRepo> gitHubRepos = new ArrayList<>();

    @Override
    public int getCount() {
        return gitHubRepos.size();
    }

    @Override
    public GitHubRepo getItem(int position) {
        if (position < 0 || position >= gitHubRepos.size()) {
            return null;
        } else {
            return gitHubRepos.get(position);
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final View view = (convertView != null ? convertView : createView(parent));
        final GitHubRepoViewHolder viewHolder = (GitHubRepoViewHolder) view.getTag();
        viewHolder.setGitHubRepo(getItem(position));
        return null;
    }

    public void setGitHubRepos(@Nullable List<GitHubRepo> repos) {
        if (gitHubRepos == null) {
            return;
        }
        gitHubRepos.clear();
        gitHubRepos.addAll(repos);
        notifyDataSetChanged();
    }

    private View createView(ViewGroup parent){
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final View view = inflater.inflate(R.layout.item_github_repo, parent, false);
        final GitHubRepoViewHolder viewHolder = new GitHubRepoViewHolder(view);
        view.setTag(viewHolder);
        return view;
    }

    private static class GitHubRepoViewHolder {

        private TextView txtRepoName;
        private TextView txtRepoDescription;
        private TextView txtLanguage;
        private TextView txtStars;

        public GitHubRepoViewHolder(View view){
            txtRepoName = (TextView) view.findViewById(R.id.text_repo_name);
            txtRepoDescription = (TextView) view.findViewById(R.id.text_repo_description);
            txtLanguage = (TextView) view.findViewById(R.id.text_repo_language);
            txtStars = (TextView) view.findViewById(R.id.text_repo_ stars);
        }

        public void setGitHubRepo(GitHubRepo gitHubRepo){
            txtRepoName.setText(gitHubRepo.getUserName());
            txtRepoDescription.setText(gitHubRepo.getDescription());
            txtLanguage.setText("Language: " + gitHubRepo.getCodeLanguage());
            txtStars.setText("Stars: " + gitHubRepo.getStarCount());




        }













    }

}
