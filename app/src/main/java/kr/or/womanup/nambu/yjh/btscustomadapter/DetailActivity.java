package kr.or.womanup.nambu.yjh.btscustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView txtNick;
    TextView txtName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        BTS member = (BTS) intent.getSerializableExtra("member");
        txtNick = findViewById(R.id.txt_nick_detail);
        txtName = findViewById(R.id.txt_name_detail);
        imageView = findViewById(R.id.imageView_detail);
        txtName.setText(member.name);
        txtNick.setText(member.nick);
        imageView.setImageResource(member.image);

    }
}