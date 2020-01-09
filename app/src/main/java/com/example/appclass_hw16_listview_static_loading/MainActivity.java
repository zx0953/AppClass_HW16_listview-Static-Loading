package com.example.appclass_hw16_listview_static_loading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ListAdapter listAdapter;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        listView = (ListView) findViewById(R.id.listView);
        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[]{"d(d＇∀＇)", "d(`･∀･)b", "ε٩(๑> ₃ <)۶з", "(*´∀`)~♥"});
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(listViewOnClickListener);
    }
    private AdapterView.OnItemClickListener listViewOnClickListener
            = new AdapterView.OnItemClickListener()
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id)
        {
            // TODO Auto-generated method stub

            textView.setText("你選擇了: " + ((TextView) view).getText());
        }
    };
}
