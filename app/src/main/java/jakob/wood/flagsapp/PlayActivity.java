package jakob.wood.flagsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class PlayActivity extends AppCompatActivity {

    //Variable Declarations
    String[] flagNames = {"afghanistan",
            "aland_islands",
            "albania",
            "algeria",
            "american_samoa",
            "andorra",
            "angola",
            "anguilla",
            "antigua_and_barbuda",
            "antarctica",
            "argentina",
            "armenia",
            "aruba",
            "australia",
            "austria",
            "azerbaijan",
            "bahamas",
            "bahrain",
            "bangladesh",
            "barbados",
            "belarus",
            "belgium",
            "belize",
            "benin",
            "bermuda",
            "bhutan",
            "bolivia",
            "bosnia_and_herzegovina",
            "botswana",
            "brazil",
            "britain_indian_ocean_territory",
            "brunei",
            "bulgaria",
            "burkina_faso",
            "burundi",
            "cambodia",
            "cameroon",
            "canada",
            "cape_verde",
            "caribbean_netherlands",
            "central_african_republic",
            "chad",
            "chile",
            "china",
            "christmas_island",
            "cocos_islands",
            "colombia",
            "comoros",
            "cook_islands",
            "costa_rica",
            "cote_d_lvoire",
            "croatia",
            "cuba",
            "curacao",
            "cyprus",
            "czechia",
            "democratic_republic_congo",
            "denmark",
            "djibouti",
            "dominica",
            "dominican_republic",
            "ecuador",
            "el_salvador",
            "england",
            "equatorial_guinea",
            "eritrea",
            "estonia",
            "eswatini",
            "ethiopia",
            "falkland_islands",
            "faroe_islands",
            "fiji",
            "finland",
            "france",
            "french_guiana",
            "french_polynesia",
            "french_southern_and_antarctic_lands",
            "gabon",
            "gambia",
            "gaudeloupe",
            "georgia",
            "germany",
            "ghana",
            "gibraltar",
            "great_britain",
            "greece",
            "greenland",
            "grenada",
            "guam",
            "guatemala",
            "guernsey",
            "guinea",
            "guinea_bissau",
            "guyana",
            "haiti",
            "honduras",
            "hong_kong",
            "hungary",
            "iceland",
            "india",
            "indonesia",
            "iran",
            "iraq",
            "ireland",
            "isle_of_man",
            "israel",
            "italy",
            "jamaica",
            "japan",
            "jersey",
            "jordan",
            "kazakhstan",
            "kentucky",
            "kenya",
            "kiribati",
            "kosovo",
            "kuwait",
            "kyrgyzstan",
            "laos",
            "latvia",
            "lebanon",
            "lesotho",
            "liberia",
            "libya",
            "liechtenstein",
            "lithuania",
            "luxembourg",
            "macau",
            "madagascar",
            "malawi",
            "malaysia",
            "maldives",
            "mali",
            "malta",
            "marshall_islands",
            "martinique",
            "mauritania",
            "mauritius",
            "mayotte",
            "mexico",
            "micronesia",
            "moldova",
            "monaco",
            "mongolia",
            "montenegro",
            "montserrat",
            "morocco",
            "mozambique",
            "myanmar",
            "nambia",
            "nauru",
            "nepal",
            "netherlands",
            "new_caledonia",
            "new_zealand",
            "nicaragua",
            "niger",
            "nigeria",
            "niue",
            "norfolk_islands",
            "northern_ireland",
            "northern_mariana_islands",
            "north_korea",
            "north_macedonia",
            "norway",
            "oman",
            "pakistan",
            "palau",
            "palestine",
            "panama",
            "papua_new_guinea",
            "paraguay",
            "peru",
            "peurto_rico",
            "philippines",
            "pitcairn_islands",
            "poland",
            "portugal",
            "qatar",
            "republic_congo",
            "resource_do",
            "reunion",
            "romania",
            "russia",
            "rwanda",
            "saint_barthelemy",
            "saint_helena",
            "saint_kitts_and_navis",
            "saint_lucia",
            "saint_pierre_and_miquelon",
            "saint_vincent_and_the_grenadines",
            "samoa",
            "san_marino",
            "sao_tome_and_principe",
            "saudi_arabia",
            "scotland",
            "senegal",
            "serbia",
            "seychelles",
            "sierra_leone",
            "singapore",
            "sint_maarten",
            "slovakia",
            "slovenia",
            "solomon_islands",
            "somalia",
            "south_africa",
            "south_georgia",
            "south_korea",
            "south_sudan",
            "spain",
            "sri_lanka",
            "sudan",
            "suriname",
            "sweden",
            "switzerland",
            "syria",
            "taiwan",
            "tajikistan",
            "tanzania",
            "thailand",
            "timor_leste",
            "togo",
            "tokelau",
            "tonga",
            "trinidad_and_tobago",
            "tunisia",
            "turkey",
            "turkmenistan",
            "turks_and_caicos_islands",
            "tuvalu",
            "uganda",
            "ukraine",
            "united_arab_emirates",
            "united_states",
            "united_states_virgin_islands",
            "uruguay",
            "uzbekistan",
            "vanuatu",
            "vatican_city",
            "venezuela",
            "vietnam",
            "virgin_islands",
            "wales",
            "wallis_and_futuna",
            "western_sahara",
            "yemen",
            "zambia",
            "zimbabwe",
    };
    int skips = 0;
    int score = 0;

    //Method: onCreate
    //Param: Bundle
    //Brief: Initializes Activity and Calls initFlag()
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Objects.requireNonNull(this.getSupportActionBar()).hide();
        } catch (NullPointerException e) {
        }
        setContentView(R.layout.activity_play);

        initFlag();
    }

    //Method: initFlag()
    //Param: void
    //Brief: Randomizes Flag and Potential Answer Buttons, Adds One Correct Answer Button
    public void initFlag() {
        //Variable Declarations
        Context context;
        String curFlag;
        int randFlag;
        int randButton;

        //Variable Initialization
        randButton = ThreadLocalRandom.current().nextInt(0, 3 + 1);
        randFlag = ThreadLocalRandom.current().nextInt(0, 247 + 1);
        curFlag = flagNames[randFlag];
        ImageView curImage = findViewById(R.id.flagView);
        context = curImage.getContext();

        //Randomizing Flag Image
        int id = context.getResources().getIdentifier(curFlag, "drawable", context.getPackageName());
        curImage.setImageResource(id);
        curImage.setTag(curFlag);

        //Setting Random Answer Buttons
        Button[] answerButtons = {findViewById(R.id.answerButton1), findViewById(R.id.answerButton2), findViewById(R.id.answerButton3), findViewById(R.id.answerButton4)};
        for (Button answerButton : answerButtons) {
            randFlag = ThreadLocalRandom.current().nextInt(0, 247 + 1);
            answerButton.setText(flagNames[randFlag]);
        }

        //Setting One Correct Answer Button
        Button correctAnswer = answerButtons[randButton];
        correctAnswer.setText(curFlag);
    }

    //Method: skipButtonHandler()
    //Param: View
    //Brief: Handles Skip Button and Max Skips
    public void skipButtonHandler(View view) {
        //Variable Declarations and Initializations
        Context context = getApplicationContext();
        int toastDuration = Toast.LENGTH_SHORT;
        Toast toast;
        String toastText;

        //Counting Skips and Displaying Toasts Accordingly
        if (view.getId() == R.id.skipButton) {
            //Handling Maximum of 5 Skips
            if (skips <= 5 && skips >= 0) {
                initFlag();
                skips++;
                toastText = "Number of Skips Left: " + (6 - skips);
            } else {
                toastText = "No More Skips Left!";
            }
            toast = Toast.makeText(context, toastText, toastDuration);
            toast.show();
        }
    }

    //Method: correctAnswerHandler
    //Param: View
    //Brief: Checks User Selection For Correct Answer, Updates Score Accordingly, Displays Toast With Answer Result
    public void correctAnswerHandler(View view) {
        //Variable Declarations and Initializations
        Button[] answerButtons = {findViewById(R.id.answerButton1), findViewById(R.id.answerButton2), findViewById(R.id.answerButton3), findViewById(R.id.answerButton4)};
        ImageView curImage = findViewById(R.id.flagView);
        Context context = getApplicationContext();
        int toastDuration = Toast.LENGTH_SHORT;
        Toast toast;
        String toastText;
        String curImageTag = String.valueOf(curImage.getTag());

        //Checking User Answer and Updating Score, Displaying Toast Accordingly
        switch (view.getId()) {
            case R.id.answerButton1:
                if (answerButtons[0].getText().equals(curImageTag)) {
                    score++;
                    initFlag();
                    toastText = "Nice Work!";
                }
                else {
                    score = 0;
                    toastText = "Sorry! Wrong Answer! Score Set to Zero.";
                }
                updateScore();
                toast = Toast.makeText(context, toastText, toastDuration);
                toast.show();
                break;
            case R.id.answerButton2:
                if (answerButtons[1].getText().equals(curImageTag)) {
                    score++;
                    initFlag();
                    toastText = "Nice Work!";
                }
                else {
                    score = 0;
                    toastText = "Sorry! Wrong Answer! Score Set to Zero.";
                }
                updateScore();
                toast = Toast.makeText(context, toastText, toastDuration);
                toast.show();
                break;
            case R.id.answerButton3:
                if (answerButtons[2].getText().equals(curImageTag)) {
                    score++;
                    initFlag();
                    toastText = "Nice Work!";
                }
                else {
                    score = 0;
                    toastText = "Sorry! Wrong Answer! Score Set to Zero.";
                }
                updateScore();
                toast = Toast.makeText(context, toastText, toastDuration);
                toast.show();
                break;
            case R.id.answerButton4:
                if (answerButtons[3].getText().equals(curImageTag)) {
                    score++;
                    initFlag();
                    toastText = "Nice Work!";
                }
                else {
                    score = 0;
                    toastText = "Sorry! Wrong Answer! Score Set to Zero.";
                }
                updateScore();
                toast = Toast.makeText(context, toastText, toastDuration);
                toast.show();
                break;
        }
    }

    //Method: updateScore
    //Param: void
    //Brief: Adjusts User's Current Score in TextView
    public void updateScore(){
        TextView scoreStr = findViewById(R.id.scoreView);
        String curScore = "Current Score: " + score;
        scoreStr.setText(curScore);
    }
}