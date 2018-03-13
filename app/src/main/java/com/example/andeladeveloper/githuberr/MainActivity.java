package com.example.andeladeveloper.githuberr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import presenter.GithubUsersPresenter;

public class MainActivity extends AppCompatActivity {

    private GithubUsersPresenter presenter = new GithubUsersPresenter(MainActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);

        presenter.getGithubers(mRecyclerView);
    }
}
