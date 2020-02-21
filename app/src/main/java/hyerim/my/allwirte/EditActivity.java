package hyerim.my.allwirte;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
//        toolbar.setTitle(R.string.myAppName);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기 버튼 생성

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.gallery:
                Toast.makeText(getApplicationContext(),"gallery click", Toast.LENGTH_LONG).show();
                return true;
            case R.id.save:
                Toast.makeText(getApplicationContext(),"save click", Toast.LENGTH_LONG).show();
                return true;
            case android.R.id.home:     //뒤로가기 버튼 클릭 시
                finish();
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }
    }
}
