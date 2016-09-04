package com.example.lenovo.game;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;

    ImageView imageView;

    int rolledNo;

    Random r=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);
        imageView=(ImageView)findViewById(R.id.imageView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rolledNo = r.nextInt(6) + 1;

                if (rolledNo == 1) {
                    imageView.setImageResource(R.drawable.a1);
                    Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
                } else if (rolledNo == 2) {
                    imageView.setImageResource(R.drawable.a2);
                    Toast.makeText(MainActivity.this, "Two", Toast.LENGTH_SHORT).show();
                } else if (rolledNo == 3) {
                    imageView.setImageResource(R.drawable.a3);
                    Toast.makeText(MainActivity.this, "Three", Toast.LENGTH_SHORT).show();
                } else if (rolledNo == 4) {
                    imageView.setImageResource(R.drawable.a4);
                    Toast.makeText(MainActivity.this, "Four", Toast.LENGTH_SHORT).show();
                } else if (rolledNo == 5) {
                    imageView.setImageResource(R.drawable.a5);
                    Toast.makeText(MainActivity.this, "Five", Toast.LENGTH_SHORT).show();
                } else if (rolledNo == 6) {
                    imageView.setImageResource(R.drawable.a6);
                    Toast.makeText(MainActivity.this, "Six", Toast.LENGTH_SHORT).show();
                }

                // Toast.makeText(MainActivity.this, "Rolled!",Toast.LENGTH_SHORT).show();

            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater=new MenuInflater(this);
        menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        switch (menuItem.getItemId())
        {
            case R.id.item0:
                Toast.makeText(MainActivity.this, "Diceflip 1.0", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item1:
                Toast.makeText(MainActivity.this, "Sharing options not available", Toast.LENGTH_LONG).show();
                return true;
            default: return super.onOptionsItemSelected(menuItem);
        }

    }
    public void onBackPressed()
    {
        AlertDialog.Builder al=new AlertDialog.Builder(this);
        al.setCancelable(true);
        al.setMessage("Do you really want to exit ?");
        al.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog=al.create();
        alertDialog.setCanceledOnTouchOutside(true);
        alertDialog.setIcon(R.drawable.a1);
        alertDialog.show();


    }
}
