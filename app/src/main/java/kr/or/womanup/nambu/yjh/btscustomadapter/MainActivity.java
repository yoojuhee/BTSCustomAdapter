package kr.or.womanup.nambu.yjh.btscustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    String bts[] = {"진","슈가","지민","정국","뷔","제이홉","RM"};
    String names[] = {"김석진","민윤기","박지민","전정국","김태형","정호석","김남준"};
    int[] ids = {R.drawable.bts1, R.drawable.bts2, R.drawable.bts3,
            R.drawable.bts4, R.drawable.bts5, R.drawable.bts6, R.drawable.bts7};
    ListView listView;

    //ArrayList<HashMap<String,Object>> list;
    ArrayList<BTS> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

        list = new ArrayList<>();

        /*for(int i=0; i<bts.length; i++){
            HashMap<String,Object> map = new HashMap<>();
            map.put("nick",bts[i]);
            map.put("name",names[i]);
            map.put("image",ids[i]);
            list.add(map);
        }*/
        for(int i=0; i<bts.length; i++){
            BTS member = new BTS(bts[i],names[i],ids[i]);
            list.add(member);
        }
        BTSadapter adapter = new BTSadapter(this,list,R.layout.activity_layout);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                BTS member = list.get(position);
                intent.putExtra("member",member);
                startActivity(intent);



            }
        });
    }

}

