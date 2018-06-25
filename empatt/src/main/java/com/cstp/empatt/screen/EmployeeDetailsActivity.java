package com.cstp.empatt.screen;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cstp.empatt.R;

public class EmployeeDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_details);
    }

    public void launchSnapActivity(View view) {
        Intent intent = new Intent(this, SnapActivity.class);
        startActivity(intent);

    }

    public void placeACall(View view) {
        String phoneNumber = "9654373996";
        Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: " + phoneNumber));

        if (ActivityCompat.checkSelfPermission(EmployeeDetailsActivity.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }

        startActivity(callIntent);
    }
}
