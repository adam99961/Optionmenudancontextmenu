package com.example.ketemploy.uts_pbb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ketemploy.uts_pbb.Basket;
import com.example.ketemploy.uts_pbb.Lari;

public class List_olahraga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_olahraga);
        String[] mobileArray = {"Lari", "Futsal", "Basket", "Bulutangkis", "Tenis"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_tampil_olahraga, mobileArray);
        ListView listView = (ListView) findViewById(R.id.list_olahraga);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Lari.class);
                    startActivityForResult(myIntent, 0);
                } else if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Futsal.class);
                    startActivityForResult(myIntent, 1);
                } else if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Basket.class);
                    startActivityForResult(myIntent, 2);
                } else if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), Bulutangkis.class);
                    startActivityForResult(myIntent, 3);
                } else if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Tenis.class);
                    startActivityForResult(myIntent, 4);
                }}});
    }
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_settings){
            Toast.makeText(getApplicationContext(), "Anda menekan tombol Setting pada Option Menu", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.action_logout){
            Toast.makeText(getApplicationContext(), "Anda menekan tombol Logout pada Option Menu", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Pilih Action");
        menu.add(0, v.getId(), 0, "Edit");
        menu.add(0, v.getId(), 0, "Hapus");
    }
}
