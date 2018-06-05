package com.example.d.finalbutterknife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.d.finalbutterknife.model.Breeds;
import com.example.d.finalbutterknife.service.DogApiService;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Retrofit;


public class BreedsActivity extends AppCompatActivity {

    public static final String TAG = "Breeds Activity";

    private DogApiService dogApiService;

    @BindView(R.id.welcome_text)
    TextView welcomeText;

    @BindView(R.id.terrier_image)
    ImageView terrierImage;

    @BindView(R.id.spaniel_image)
    ImageView spanielImage;

    @BindView(R.id.retriever_image)
    ImageView retrieverImage;

    @BindView(R.id.poodle_image)
    ImageView poodleImage;

//    Breeds breeds;
//    String pic;
//    final static String BASE_URL = "https://dog.ceo/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breeds);
        ButterKnife.bind(this);

        //Creating an instance of the DogAPIClient class and the method service call where Retrofit is.

        Intent intent = getIntent();
        String getUserName = intent.getStringExtra("usename");
        welcomeText.setText("What kind of dog are you looking for" + getUserName + " ? ");


    }


}
