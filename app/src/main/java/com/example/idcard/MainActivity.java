package com.example.idcard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView whatsappIcon, githubIcon, linkedinIcon, emailIcon, callIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the icons
        whatsappIcon = findViewById(R.id.whatsapp_icon);
        githubIcon = findViewById(R.id.github_icon);
        linkedinIcon = findViewById(R.id.linkedin_icon);
        emailIcon = findViewById(R.id.email_icon);
        callIcon = findViewById(R.id.call_icon);

        // WhatsApp click event
        whatsappIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "+8801720510987"; // Replace with your WhatsApp number
                String url = "https://wa.me/" + phoneNumber;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        // GitHub click event
        githubIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String githubUrl = "https://github.com/Sovon380"; // Replace with your GitHub profile URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(githubUrl));
                startActivity(intent);
            }
        });

        // LinkedIn click event
        linkedinIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String linkedinUrl = "https://www.linkedin.com/in/sovonmallick"; // Replace with your LinkedIn profile URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(linkedinUrl));
                startActivity(intent);
            }
        });

        // Email click event
        emailIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:sovon.stu2019@juniv.edu")); // Replace with your email address
                startActivity(intent);
            }
        });

        // Call click event
        callIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "+8801720510987"; // Replace with your phone number
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(intent);
            }
        });
    }
}
