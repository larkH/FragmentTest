package com.mi.fragmentbestpractice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NewsContentFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_content_frag, container, false);
        return view;
    }

    public void refresh(String newsTitle, String newsContent){
        LinearLayout ll = view.findViewById(R.id.ll);
        ll.setVisibility(View.VISIBLE);
        TextView title = view.findViewById(R.id.news_title);
        TextView content = view.findViewById(R.id.news_content);
        title.setText(newsTitle);
        content.setText(newsContent);
    }
}
