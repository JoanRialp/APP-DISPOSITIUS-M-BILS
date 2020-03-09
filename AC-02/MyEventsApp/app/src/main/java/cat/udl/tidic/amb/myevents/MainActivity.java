package cat.udl.tidic.amb.myevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView num_Event;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Main_Controller controller = new Main_Controller(this);

        Button create = (Button) findViewById(R.id.Create);
        num_Event = (TextView) findViewById(R.id.Num_Events);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        try
        {
            contador = extras.getInt("Contador");;
            updateContador(contador);
        }
        catch(Exception e)
        {

        }

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Registrate.class);
                intent.putExtra("Contador", contador);
                startActivity(intent);
            }
        });

    }

    public void updateContador(int contador)
    {
        String contador2 = Integer.toString(contador);
        num_Event.setText(contador2);
        System.out.println("COntador" +contador2);
    }

}
