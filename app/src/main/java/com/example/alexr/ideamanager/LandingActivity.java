package com.example.alexr.ideamanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.alexr.ideamanager.services.MessageService;
import com.example.alexr.ideamanager.services.ServiceBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

//        TextView message = (TextView)findViewById(R.id.message);
//        message.setText("This is hardcoded, but thanks for visiting the app!  Our next hackathon is scheduled for the end of Q3.  We hope to see you there, be sure to add your ideas to the app!");

        MessageService taskService = ServiceBuilder.buildService(MessageService.class);

        Call<String> call = taskService.getMessages();

        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                TextView message = (TextView)findViewById(R.id.message);
                message.setText(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                TextView message = (TextView)findViewById(R.id.message);
                message.setText("Request Failed");
            }
        });

    }

    public void GetStarted(View view){
        Intent intent = new Intent(this, IdeaListActivity.class);
        startActivity(intent);
    }
}
