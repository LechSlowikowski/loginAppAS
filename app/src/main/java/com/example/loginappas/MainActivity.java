package com.example.loginappas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zatwierdz(View view) {
        String komunikatStr = "";
        //odczytujemy zawartość pola email
        EditText email = (EditText) findViewById(R.id.email);
        String emailStr = email.getText().toString();
        //jeżeli indexOf<0 (==-1) to oznacza, że nie ma znaczka @
        if(emailStr.indexOf("@") < 0){
            komunikatStr = "Nieprawidłowy adres e-mail ";
        }

        //odczytujemy zawartości pól haslo1 i haslo2
        EditText haslo1 = (EditText) findViewById(R.id.haslo1);
        String haslo1str = haslo1.getText().toString();
        EditText haslo2 = (EditText) findViewById(R.id.haslo2);
        String haslo2str = haslo2.getText().toString();
        if(!haslo1str.equals(haslo2str)){
            komunikatStr = komunikatStr + "Hasła się różnią";
        }

        //jeżeli nie pojawły się błędy to komunikatStr==""
        //czyli ma długość 0
        if(komunikatStr.length()==0){
            komunikatStr = "Witaj " + emailStr;
        }

        //wyświetlamy informację
        TextView komunikat = (TextView) findViewById(R.id.komunikat);
        komunikat.setText(komunikatStr);
    }
}