package assignment.android.acadgild.custom_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] names={"DivyaCBabu","VipinViswanathan","DhanyaAneesh","VidyuthVipin","ArjunAneesh","VaishnaviAjith","MeghaVarun"};
    String[] phoneNo={"6897987897","9854357901","2345678965","9856789345","9654323456","5654664564","2354563463"};
    int[] images={R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listViewText);
        ContactAdapter adapter=new ContactAdapter(this,names,phoneNo,images);
        listView.setAdapter(adapter);
    }
}
