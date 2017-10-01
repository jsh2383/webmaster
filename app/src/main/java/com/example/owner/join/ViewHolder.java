package com.example.owner.join;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Owner on 2017-09-23.
 */

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView img;
    public TextView textTitle;
    public TextView textContent;

    public ViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);
        img = (ImageView) itemView.findViewById(R.id.imgProfile);
        textTitle = (TextView) itemView.findViewById(R.id.textTitle);
        textContent = (TextView) itemView.findViewById(R.id.textContent);
    }


    @Override
    public void onClick(View v) {

        System.out.println(getPosition());
        Intent intent = new Intent(v.getContext() , DetailActivity.class);
        v.getContext().startActivity(intent);
    }

}
