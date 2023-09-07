package com.example.bmi_project;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editwg,edithF,edithI;
        Button btncalculate;
        TextView resultView;  //variables bnae hein
        LinearLayout liback;
        //Assign values
        editwg= findViewById(R.id.edit_wg) ;  //resource mein just id get kr rha hy
        edithI=findViewById(R.id.edit_htI) ;
        edithF =findViewById(R.id.edit_htF) ;
        btncalculate= findViewById(R.id.calculate_Button) ;
        liback=findViewById(R.id.linid) ;
        resultView =findViewById(R.id.resultView) ;
        //on click button..formula py ho..varname.seton eventname..non click listener aa rha hy...
        //new ki view class sy
        //value leni..to get...value set krni...to set
        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   int wt=  Integer.parseInt(editwg.getText().toString());
                   int hgF =Integer.parseInt(edithF.getText().toString());
                   int hgI =Integer.parseInt(edithI.getText().toString());
                   int totalIn= hgF*12 + hgI;  //ft to inches..and add all inches

                   double total_Cm=totalIn*2.53;
                    double bMI= total_Cm/100 ;
                    double res = wt/(bMI*bMI);
                    if(res>= 25.0 && res<= 39.9)
                    {  resultView.setText("Your BMI = "+ res+ "\nYou are Over_weight");
                        liback.setBackgroundColor(getResources().getColor(R.color.darkblue));
                    }
                    else if (res>=40 )
                    {  resultView.setText("Your BMI = "+ res+ "\nYou are Obese");
                        liback.setBackgroundColor(getResources().getColor(R.color.blue));
                        }
                 else if(res>= 18.5 && res<= 24.9){
                     resultView.setText("Your BMI = "+ res+"\nYou are Healthy");
                        liback.setBackgroundColor(getResources().getColor(R.color.orange));
                 }
                 else
                    {  resultView.setText("Your BMI = "+ res+ "\nYou are Under_Weight");
                        liback.setBackgroundColor(getResources().getColor(R.color.));
                    }

            }
        });
    }
}