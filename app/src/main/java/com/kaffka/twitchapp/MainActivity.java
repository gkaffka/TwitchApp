package com.kaffka.twitchapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.kaffka.twitchapp.adapter.TopGamesAdapter;
import com.kaffka.twitchapp.api_services.TwitchService;
import com.kaffka.twitchapp.models.GameItem;
import com.kaffka.twitchapp.models.TopGames;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.recycler_view_top_games)
    RecyclerView recyclerView;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.fab)
    FloatingActionButton fab;
    private List<GameItem> gameItemList;
    private TopGamesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        initRecyclerView();
        loadGames(50, null);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void initRecyclerView() {
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        gameItemList = new ArrayList<>();
        adapter = new TopGamesAdapter(gameItemList);
        recyclerView.setAdapter(adapter);
    }

    private void loadGames(Integer limit, Integer offset) {
        TwitchService.createTwitchService().getTopGames(limit, offset).enqueue(new Callback<TopGames>() {
            @Override
            public void onResponse(Call<TopGames> call, Response<TopGames> response) {
                if (response.isSuccessful()) {
                    gameItemList.addAll(response.body().getGameItemList());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<TopGames> call, Throwable t) {

            }
        });
    }
}
