package jakob.wood.flagsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity<Intnet> extends AppCompatActivity {

    //Method: onCreate
    //Param: Bundle
    //Brief: Initializes Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_main);
    }

    //Method: callIntent
    //Param: View
    //Brief: Starts Activities Based on Button Selection
    public void callIntent(View view){
        switch (view.getId()){
            case R.id.buttonStudy:
                Intent intent = new Intent(this,StudyActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonPlay:
                intent = new Intent(this,PlayActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}