package teste.app.com.listviewapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleListItem extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_list);

        TextView txtElemento = (TextView) findViewById(R.id.elemento_label);

        Intent i = getIntent();
        // capturando o dado anexado a partir da intent
        String elemento = i.getStringExtra("elemento");
        // mostrando o nome do item selecionado
        txtElemento.setText(elemento);

    }
}
