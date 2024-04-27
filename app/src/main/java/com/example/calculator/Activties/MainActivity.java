package com.example.calculator.Activties;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;


import com.example.calculator.Databases.Entities.MyViewModel;
import com.example.calculator.Databases.Entities.Operation_en;
import com.example.calculator.databinding.ActivityMainBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding ;
ArrayList<Button> nums ;
int counter  = 0;
ArrayList<String> p;
int isPress = 0 ;
int operPresed = 0;
BottomSheetDialog dialog;
 String numbers = "";
int equalClicked = 0 ;
MyViewModel mvm ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
//inflate "View Model"
        mvm = new ViewModelProvider(this).get(MyViewModel.class);

        nums = new ArrayList<>();
        nums.add(binding.num0);
        nums.add(binding.num1);
        nums.add(binding.num2);
        nums.add(binding.num3);
        nums.add(binding.num4);
        nums.add(binding.num5);
        nums.add(binding.num6);
        nums.add(binding.num7);
        nums.add(binding.num8);
        nums.add(binding.num9);
        nums.add(binding.multply);
        nums.add(binding.munis);
        nums.add(binding.div);
        nums.add(binding.plus);
        nums.add(binding.dot);
// loop on  nums loop
        for (Button nums : nums) {
            nums.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    equalClicked = 1  ;
                    // we get the Value from the Buttons
                   String data = nums.getText().toString();
                   //  here we merge data o numbr but without repetetion
if (data.equals("+")){
    if (isPress  == 0){
        numbers += data ;
        binding.input.setText(numbers);
        isPress = 1 ;
        operPresed =  0 ;
        counter = 0;
    }
} else if (data.equals("-")) {
    if (isPress == 0) {
        numbers += data;
        binding.input.setText(numbers);
        isPress = 1;
        operPresed =  0 ;
        counter = 0;
    }

}else if (data.equals("*")) {
    if (isPress == 0) {
        numbers += data;
        binding.input.setText(numbers);
        isPress = 1;
        operPresed =  0 ;
        counter = 0;
    }

}else if (data.equals("/")) {
    if (isPress == 0) {
        numbers += data;
        binding.input.setText(numbers);
        isPress = 1;
        operPresed =  0 ;
        counter = 0 ;
    }

}else if (data.equals(".")) {
    if (operPresed == 0 && counter == 1) {
        numbers += data;
        binding.input.setText(numbers);
        operPresed = 1;
    }
}
else{
     numbers += data;
    binding.input.setText(numbers);
    isPress = 0 ;
    counter = 1;
}}});
                                    }
        for (Button nums : nums) {
            nums.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    equalClicked = 1  ;
                    // we get the Value from the Buttons
                   String data = nums.getText().toString();
                   //  here we merge data o numbr but without repetetion
if (data.equals("+")){
    if (isPress  == 0){
        numbers += data ;
        binding.input.setText(numbers);
        isPress = 1 ;
        operPresed =  0 ;
        counter = 0;
    }
} else if (data.equals("-")) {
    if (isPress == 0) {
        numbers += data;
        binding.input.setText(numbers);
        isPress = 1;
        operPresed =  0 ;
        counter = 0;
    }

}else if (data.equals("*")) {
    if (isPress == 0) {
        numbers += data;
        binding.input.setText(numbers);
        isPress = 1;
        operPresed =  0 ;
        counter = 0;
    }

}else if (data.equals("/")) {
    if (isPress == 0) {
        numbers += data;
        binding.input.setText(numbers);
        isPress = 1;
        operPresed =  0 ;
        counter = 0 ;
    }

}else if (data.equals(".")) {
    if (operPresed == 0 && counter == 1) {
        numbers += data;
        binding.input.setText(numbers);
        operPresed = 1;
    }
}
else{
     numbers += data;
    binding.input.setText(numbers);
    isPress = 0 ;
    counter = 1;
}}});
                                    }
        binding.equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inpute_d = binding.input.getText().toString();
// we try To Stop the Operation if dosot ther are operation
                if (inpute_d.isEmpty()){
                    Toast.makeText(MainActivity.this, "No Operation", Toast.LENGTH_SHORT).show();
                    return;
                }
                // wer try to stop the  Operation if the Opreration it not redy to Caculation
                if (inpute_d.equals("*")  || inpute_d.equals("/") || inpute_d.equals("+") || inpute_d.equals("-")){
                    Toast.makeText(MainActivity.this, "the operation it's not Complete! ", Toast.LENGTH_SHORT).show();
                    return;
                }

               String ps =  binding.input.getText(). toString();
               p = new ArrayList<>();
               // here we shift the value of ps to char List for insolate the Number from Operation
                char[] pro = ps.toCharArray();
                String pp = "" ;
                // the process of Insolation
                for ( char pros : pro){
                    if (pros == '+'){
                            p.add(pp);
                            p.add("+");
                            pp ="";


                    }else if (pros == '-'){
                        p.add(pp);
                        p.add("-");
                        pp ="";
                    } else if (pros == '*'){
                        p.add(pp);
                        p.add("*");
                        pp ="";
                    }else if (pros == '/'){
                        p.add(pp);
                        p.add("/");
                        pp ="";
                    }else {
                        // i  try in here to merege My Number to variable pp
                        pp += pros ;
                    }

                }

// i try to add the last Number to ArrayList "p" if pp don't equal ""
                if (!pp.equals("")){
                    p.add(pp);
                }

// we try to get the size of list
                int listSize = p.size();
                // here i try to remov the the last item in list if equal one of operatopn symbol
if (p.get(listSize-1).equals("*") || p.get(listSize-1).equals("/") ||  p.get(listSize-1).equals("+") || p.get(listSize-1).equals("-")){
    p.remove(listSize-1);
    listSize = p.size();
}

                // the role of this line is hlep us for merge the an oher numbers to our process
for (int i = 0 ; i < p.size() ; i++){
    if (p.get(i) == "*") {
        double a1 = Double.parseDouble(p.get(i+1));
        double a2 = Double.parseDouble(p.get(i-1));
        double res = a1*a2 ;
        p.set(i-1 , String.valueOf(res));
        p.remove(i);
        p.remove(i);
     i-- ;
    }
   else if (p.get(i) == "/") {
        double a1 = Double.parseDouble(p.get(i+1));
        double a2 = Double.parseDouble(p.get(i-1));
        double res = a2 / a1 ;
        p.set(i-1 , String.valueOf(res));
        p.remove(i);
        p.remove(i);
        i--;
    }
}
                double result = Double.parseDouble(p.get(0)) ;
                // there we use "for" for calculat the process like "+";"-"
                for (int i = 0 ; i < p.size() ; i++){
                    // calculat the process of "+"
                    if (p.get(i) == "+"){
                        result += Double.parseDouble(p.get(i+1));
                    }

                    else if (p.get(i) == "-"){
                    // calculat the process of "-"
                        result -= Double.parseDouble(p.get(i+1));
                    }

                }
// i try to caste the  result number to int
                int simpleNumber = (int) result;
                if (simpleNumber == result) {
                    binding.result.setText(String.valueOf(simpleNumber));
                }else {
                    binding.result.setText(String.valueOf(result));
                }
// i get the  input data
                     String input_Data =   binding.input.getText().toString() ;
                if(!input_Data .isEmpty() && listSize >= 3 && equalClicked == 1){
                    // i get the result data
                    String result_Data = binding.result.getText().toString() ;
                    Operation_en operation = new Operation_en(result_Data ,input_Data);
                    // in this part try to Add th opertion to RoomDataBase
                    mvm.InsertOperation(operation);
                    equalClicked = 0 ;
                }else {
                    Toast.makeText(MainActivity.this, "the Operaion its Not Complete ", Toast.LENGTH_SHORT).show();
                }

            }
        });
        // i try to rmove the  last Number
        binding.del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String iputData = binding.input.getText().toString();
                if (iputData.length() > 0){
                    int numLenght = numbers.length();
                    numbers = numbers.substring(0, numLenght-1);
                    binding.input.setText(numbers);
                }

            }
        });
        // i try to remove all of data and restart from Scratch
        binding.Ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers = "";
                binding.input.setText("0");
                counter = 0 ;
                isPress = 0;
                operPresed = 0 ;
                binding.result.setText("0");
            }
        });
        // throug this bt we an to going to shape calc Activity
     binding.shapes.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
Intent intent = new Intent(getBaseContext() , Shape_Calculation.class);
startActivity(intent);
         }
     });
        // throug this bt we an to going to Archive Activity
        binding.archiveShiftd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getBaseContext() ,Archive_AActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Archive !", Toast.LENGTH_SHORT).show();
            }
        });


    }



}




