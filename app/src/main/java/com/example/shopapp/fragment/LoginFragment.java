package com.example.shopapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shopapp.NavigationHost;
import com.example.shopapp.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginFragment extends Fragment {

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_login, container, false);
        TextInputLayout passwordLayout =v.findViewById(R.id.password_text_input);
        TextInputEditText passwordText=v.findViewById(R.id.password_edit_text);
        MaterialButton nextButton =v.findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isPasswordvalid(passwordText.getText())){
                    passwordLayout.setError(getString(R.string.error_pass));
                }else {
                    passwordLayout.setError(null);
                    ((NavigationHost) getActivity()).navigateTo(new ProductGridActivity(),false);
                }
            }
        });

        passwordText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (isPasswordvalid(passwordText.getText())) {
                    passwordLayout.setError(null); //Clear the error
                }
                return false;
            }
        });

        return v;
    }

   private boolean isPasswordvalid(Editable text){
        return text != null && text.length() >= 8;
    }
}