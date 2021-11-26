package com.nitesh.leetsolution.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.nitesh.leetsolution.Notes;
import com.nitesh.leetsolution.PUYEAR;
import com.nitesh.leetsolution.Pdf;
import com.nitesh.leetsolution.R;
import com.nitesh.leetsolution.UPYEAR;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        homeViewModel =
//                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
        final ListView liststate = root.findViewById(R.id.liststate);
        liststate.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getActivity(), UPYEAR.class);
                    startActivity(intent);

                } else if (position == 1) {
                    Intent intent = new Intent(getActivity(), PUYEAR.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(getActivity(), Pdf.class);
                    startActivity(intent);
                }
                else if(position==3)
                {
                    Intent intent = new Intent(getActivity(),Notes.class);
                    startActivity(intent);
                }
            }
        });
        return root;
    }
}