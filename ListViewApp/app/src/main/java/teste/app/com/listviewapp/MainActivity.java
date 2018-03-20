package teste.app.com.listviewapp;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // armazenando os recursos de string dentro do Array
        String[] numero_elementos = getResources().getStringArray(R.array.numero_elementos);

        // fazendo o Binding dos recursos do Array para ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, numero_elementos));

        ListView lv = getListView();

        // "ouvindo"(listening) o click e indo para a tela single list item
        lv.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // item selecionado
                String elemento = ((TextView) view).getText().toString();

                // indicando a nova activity com o item selecionado e tranferindo para a Single List Item
                Intent i = new Intent(getApplicationContext(), SingleListItem.class);
                // enviando o dado para a nova activity
                i.putExtra("elemento", elemento);
                startActivity(i);

            }
        });
    }
}