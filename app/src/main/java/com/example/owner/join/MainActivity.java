package com.example.owner.join;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Owner on 2017-07-20.
 */

public class MainActivity extends Activity {
    private RecyclerView lecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLayout();
        initData();
    }

    /**
     * 레이아웃 초기화
     */
    private void initLayout(){

        lecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
    }

    /**
     * 데이터 초기화
     */
    private void initData(){

        List<Album> albumList = new ArrayList<Album>();

        for (int i =0; i<20; i ++){

            Album album = new Album();
            album.setTitle("어느 멋진 날");
            album.setArtist("정용");
            album.setImage(R.mipmap.ic_launcher);
            albumList.add(album);
        }

        lecyclerView.setAdapter(new MyRecyclerAdapter(albumList,R.layout.row));
        lecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        lecyclerView.setItemAnimator(new DefaultItemAnimator());

    }


}
