package ademar.androidioscppexample;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cpptest.Core;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Core coreWrapper = new Core();

        TextView textView = findViewById(R.id.text);
        textView.setText(coreWrapper.concatenateMyStringWithCppString("Java"));
    }

}
