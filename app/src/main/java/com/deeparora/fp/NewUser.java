package com.deeparora.fp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class NewUser extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener {

    @InjectView(R.id.heading)
    TextView heading;

    @InjectView(R.id.name)
    EditText name;

    @InjectView(R.id.email)
    EditText email;

    @InjectView(R.id.password)
    EditText password;

    @InjectView(R.id.reenter_password)
    EditText reenter;

    @InjectView(R.id.gender)
    EditText gender;

    @InjectView(R.id.female)
    RadioButton female;

    @InjectView(R.id.male)
    RadioButton male;

    @InjectView(R.id.register)
    Button register;

    @InjectView(R.id.address)
    EditText address;

    @InjectView(R.id.city)
    EditText city;

    @InjectView(R.id.zip_code)
    EditText zip_code;

    @InjectView(R.id.phone_no)
     EditText phone_no;

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
        ButterKnife.inject(this);


        //object of new user
        user=new User();

        register.setOnClickListener(this);
        male.setOnClickListener(this);
        female.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

       int id = view.getId();

        switch (id){
            case R.id.register:

                user.setName(name.getText().toString().trim());
                user.setEmail(email.getText().toString().trim());
                user.setPassword(password.getText().toString().trim());
                user.setReenter(reenter.getText().toString().trim());
                user.setAddress(address.getText().toString().trim());
                user.setCity(city.getText().toString().trim());
                user.setZip_code(Integer.parseInt(zip_code.getText().toString().trim()));
                user.setPhone_no(Integer.parseInt(phone_no.getText().toString().trim()));


                insertuser();

                break;

            case R.id.male:
                user.setGender("Male");
                break;

            case R.id.female:
                user.setGender("Female");
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
