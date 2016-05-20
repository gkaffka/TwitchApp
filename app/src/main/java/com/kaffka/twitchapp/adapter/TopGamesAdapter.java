package com.kaffka.twitchapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kaffka.twitchapp.R;
import com.kaffka.twitchapp.models.GameItem;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TopGamesAdapter extends RecyclerView.Adapter<TopGamesAdapter.ViewHolder> {

    private List<GameItem> mGameItemList;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.img_box)
        ImageView mImgBox;
        @Bind(R.id.txt_game_title)
        TextView mTxtGameTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public TopGamesAdapter(List<GameItem> mGameItemList) {
        this.mGameItemList = mGameItemList;
    }

    @Override
    public TopGamesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_game_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TopGamesAdapter.ViewHolder holder, int position) {
        final GameItem gameItem = mGameItemList.get(position);
        loadImage(gameItem.getGame().getBox().getLarge(), holder.mImgBox);
        loadText(gameItem.getGame().getName(), holder.mTxtGameTitle);
    }

    @Override
    public int getItemCount() {
        return mGameItemList.size();
    }

    private void loadImage(String url, ImageView img) {
        Picasso.with(img.getContext())
                .load(url)
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(img);
    }

    private void loadText(String text, TextView txt) {
        txt.setText(text);
    }
}
