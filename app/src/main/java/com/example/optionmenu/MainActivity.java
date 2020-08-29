package com.example.optionmenu;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  private final int open=111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_optionmenu, menu);
        menu.add(1,open,0,"打开");
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        String label = "";
        Log.d("OptionMenu", String.valueOf(id));
        switch (id) {
            case R.id.create:
                label = "新建";
                break;
            case R.id.edit:
                label = "编辑";
                break;
            case R.id.save:
                label = "保存";
                break;
            case R.id.save_as:
                label = "另存";
                break;
            case R.id.help:
                label = "帮助";
                break;
            case open:
                label = "打开";
                break;

        }
        Toast.makeText(MainActivity.this,"你选择了"+label,Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
