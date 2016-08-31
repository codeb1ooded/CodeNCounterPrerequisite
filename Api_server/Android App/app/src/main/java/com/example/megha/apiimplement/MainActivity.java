package com.example.megha.apiimplement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView id1, name1;
    TextView id2, name2;
    TextView id3, name3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id1 = (TextView) findViewById(R.id.id1);
        name1 = (TextView) findViewById(R.id.name1);
        id2 = (TextView) findViewById(R.id.id2);
        name2 = (TextView) findViewById(R.id.name2);
        id3 = (TextView) findViewById(R.id.id3);
        name3 = (TextView) findViewById(R.id.name3);

        /*Call<StudentData> call = ApiClient.getInterface().getMySearch("get_student_list");
        call.enqueue(new Callback<StudentData>() {
            @Override
            public void onResponse(Call<StudentData> call, Response<StudentData> response) {
                if(response.isSuccessful()){
                    StudentData data = response.body();
                    ArrayList<StudentData.Student> st = data.students;
                    id1.setText(st.get(0).id+"");
                    name1.setText(st.get(0).name+"");
                    id2.setText(st.get(1).id+"");
                    name2.setText(st.get(1).name+"");
                    id3.setText(st.get(2).id+"");
                    name3.setText(st.get(2).name+"");
                }
                else {

                }
            }

            @Override
            public void onFailure(Call<StudentData> call, Throwable t) {
                Toast.makeText(MainActivity.this, "You are not connected to Internet  "+t.toString(), Toast.LENGTH_LONG).show();
                Log.i("CallLocal", t.toString());
            }
        });*/
        StudentData.Student student = new StudentData.Student(7, "Megha");
        Call<StudentData> call1 = ApiClient.getInterface().postData(student);
        call1.enqueue(new Callback<StudentData>() {
            @Override
            public void onResponse(Call<StudentData> call, Response<StudentData> response) {
                if(response.isSuccessful())
                    Log.i("JSONPost", response.body().toString());
                else
                    Log.i("JSONPost", response.errorBody().toString());
            }

            @Override
            public void onFailure(Call<StudentData> call, Throwable t) {
                Log.i("JSONPost", t.toString());
            }
        });
    }
}
