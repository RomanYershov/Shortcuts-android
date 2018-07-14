package kz.exampleandroid.tom.shortcuts;

import android.content.Intent;
import android.provider.AlarmClock;
import android.provider.ContactsContract;
import android.service.wallpaper.WallpaperService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
          public static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShow = (Button) findViewById(R.id.ma_show_contacts_btn);
        btnShow.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_PICK);
            intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(intent, 1);
            }
        });
        Button btnTest = findViewById(R.id.ma_show_test_btn);
        btnTest.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), ShortcutsActivityTest.class);
            startActivity(intent);
        });

    }
}
