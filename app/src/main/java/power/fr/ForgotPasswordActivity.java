package power.fr;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);

        EditText emailEditTextForgot = findViewById(R.id.emailEditTextForgot);
        Button resetPasswordButton = findViewById(R.id.resetPasswordButton);

        resetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Récupérer l'adresse e-mail entrée par l'utilisateur
                String userEmail= emailEditTextForgot.getText().toString();

                //sendResetPasswordEmail(userEmail);

            }
        });
    }
}

