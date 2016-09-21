package com.lhk.androiddemo.mobileInfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.lhk.androiddemo.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BaseMobileInfoList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_mobile_info_list);
        List<HashMap<String, Object>> datas = createDatas();
        ListView listView = (ListView) findViewById(R.id.base_mobile_info_list);
        listView.setAdapter(new SimpleAdapter(this, datas, R.layout.activity_base_mobile_info_list, new String[]{}, new int[]{}));
    }

    private List<HashMap<String, Object>> createDatas(){
        List<HashMap<String, Object>> datas = new ArrayList<>();
        HashMap<String, Object> data = null;
        return datas;
    }
}
