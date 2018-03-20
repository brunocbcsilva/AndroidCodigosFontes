package teste.app.com.gridviewapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.grid_view);

        // Instancia do ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));

        /**
         * Evento onclick da Full Image Item
         * */
        gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Enviando a imagem id para FullImageActivity
                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                // passando o index do array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
}