package com.example.optionmenu;

import android.util.Log;
import android.view.*;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  private final int open=111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_pop=findViewById(R.id.btn_pop);
        registerForContextMenu(btn_pop);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo){
        MenuInflater menuInflater=new MenuInflater(this);
        menuInflater.inflate(R.menu.main_contextmenu, menu);
        menu.add(1,open,1,"打开");
        super.onCreateContextMenu(menu, v, menuInfo);

    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.main_optionmenu, menu);
//        menu.add(1,open,0,"打开");
//        return true;
//
//    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
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
        return super.onContextItemSelected(item);
    }
}
