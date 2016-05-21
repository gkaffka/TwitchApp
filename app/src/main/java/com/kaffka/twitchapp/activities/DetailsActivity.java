package com.kaffka.twitchapp.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.kaffka.twitchapp.Constants;
import com.kaffka.twitchapp.R;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity {

    @Bind(R.id.txt_game_title)
    TextView txtGameTitle;
    @Bind(R.id.txt_details)
    TextView txtGameDetails;
    @Bind(R.id.img_logo)
    ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        loadLogo();
        loadTitle();
        loadDetails();
    }

    private void loadLogo() {
        Picasso.with(imgLogo.getContext())
                .load(getIntent().getStringExtra(Constants.Keys.URL_LOGO.name()))
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(imgLogo);
    }

    private void loadTitle() {
        txtGameTitle.setText(getExtra(Constants.Keys.TITLE));
    }

    private void loadDetails() {
        String details = buildDetails(getExtra(Constants.Keys.CHANNEL), getExtra(Constants.Keys.VIEWER));
        txtGameDetails.setText(details);
    }

    private String getExtra(Constants.Keys key) {
        return getIntent().getStringExtra(key.name()) == null ? getString(R.string.error) : getIntent().getStringExtra(key.name());
    }

    private String buildDetails(String channels, String views) {
        return String.format("%s %s\n%s %s", getString(R.string.channel), channels, getString(R.string.viewers), views);
    }
}
