package gb.android1.lesson1.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView helloWorld;
    private Button wassUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setBtnClickListener();
    }

    private void setBtnClickListener() {
        wassUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloWorld.setText(R.string.afterClick);
            }
        });
    }

    private void initViews() {
        helloWorld = findViewById(R.id.textView);
        wassUp = findViewById(R.id.button);
    }

}
