package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ComposeEmail extends AppCompatActivity {

    EditText id_email, id_subject, id_message;
    Button id_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mail_compose);

        id_email = findViewById(R.id.id_email);
        id_subject = findViewById(R.id.id_subject);
        id_message = findViewById(R.id.id_message);

        id_send = findViewById(R.id.id_send);
        id_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                send();

                }

                 // intent will be used if want to use other applications like Gmail
//                 Intent intent = new Intent(Intent.ACTION_SEND);
//                 intent.setType("message/rfc822");
//                 intent.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
//                 intent.putExtra(Intent.EXTRA_SUBJECT, subject);
//                 intent.putExtra(Intent.EXTRA_TEXT   , message);
//                 try {
//                    startActivity(Intent.createChooser(intent, "Select Email app"));
//                 } catch (android.content.ActivityNotFoundException ex) {
//                    Toast.makeText(ComposeEmail.this, "There are no email clients installed.", Toast.LENGTH_LONG).show();
//                 }

            });
        }

    private void send(){
        String to = id_subject.getText().toString().trim();
        String subject = id_subject.getText().toString().trim();
        String message = id_message.getText().toString().trim();

        JavaMailAPI javaMailAPI = new JavaMailAPI(this, to, subject, message);

        javaMailAPI.execute();

    }


}
