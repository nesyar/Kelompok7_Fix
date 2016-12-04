package id.sch.smktelkom_mlg.project.xiirpl57172737.story;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    public ToggleButton toggleButton1;
    public ToggleButton toggleButton2;
    public ToggleButton toggleButton3;
    public ToggleButton toggleButton4;

    //axel
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_isi, menu);
        return true;
    }

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

    public void new4() {
        toggleButton3 = (ToggleButton) findViewById(R.id.toogleButton3);
        toggleButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yuu = new Intent(MainActivity.this, Isi2Activity.class);
                startActivity(yuu);
            }
        });
    }

    public void new5() {
        toggleButton4 = (ToggleButton) findViewById(R.id.toogleButton1);
        toggleButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y = new Intent(MainActivity.this, Isi4Activity.class);
                startActivity(y);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("StoryBooks");
        new3();
        new1();
        new4();
        new5();

    }
}