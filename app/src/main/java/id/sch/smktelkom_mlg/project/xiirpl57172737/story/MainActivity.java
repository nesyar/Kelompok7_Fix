package id.sch.smktelkom_mlg.project.xiirpl57172737.story;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    public ToggleButton toggleButton1;
    public ToggleButton toggleButton2;

    public void new3() {
        toggleButton1 = (ToggleButton) findViewById(R.id.toogleButton1);
        toggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yuhu = new Intent(MainActivity.this, IsiActivity.class);
                startActivity(yuhu);
            }
        });
    }
    public void new1() {
        toggleButton2 = (ToggleButton) findViewById(R.id.toogleButton2);
        toggleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yuhuy = new Intent(MainActivity.this, Isi2Activity.class);
                startActivity(yuhuy);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new3();
        new1();
    }
}