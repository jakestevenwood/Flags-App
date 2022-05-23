package jakob.wood.flagsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class StudyActivity extends AppCompatActivity {

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
    int flagIndex = 0;

    //Method: onCreate
    //Param: Bundle
    //Brief: Initializes Activity and Objects
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_study);

        Button nextButton = findViewById(R.id.nextButton);
        nextButton.setText(R.string.Start_Study);
    }

    //Method: nextImage
    //Param: View
    //Brief: Displays Next Flag in ImageView
    public void nextImage(View view){

        //Handling nextButton Selection
        switch (view.getId()){
            case R.id.nextButton:
                //Variable Declaration and Initialization
                Context context = getApplicationContext();
                ImageView curImage = findViewById(R.id.flagView);
                TextView curFlagName = findViewById(R.id.flagNameView);

                //Setting Next Image
                int id = context.getResources().getIdentifier(flagNames[flagIndex], "drawable", context.getPackageName());
                curImage.setImageResource(id);
                curImage.setTag(flagNames[flagIndex]);
                curFlagName.setText(flagNames[flagIndex]);
                flagIndex++;

                //Displaying Congratulations For Studying
                if (flagIndex == flagNames.length-1){
                    curFlagName.setText(R.string.Congrats_Study);
                }
                break;
            default:
                break;

        }
    }


}