package com.kazuki.github_androidstudio_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  private static final String TAG=MainActivity.class.getSimpleName();

  private final String message1 = "edit from main PC";

  private final String message2 = "edit from sub PC";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}