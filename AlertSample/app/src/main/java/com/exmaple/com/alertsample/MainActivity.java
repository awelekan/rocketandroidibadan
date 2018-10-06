package com.exmaple.com.alertsample;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(MainActivity.this);
    }

    public void setContentView(int contentView) {
        this.contentView = contentView;
        // Set the dialog title.
        AlertDialog myAlertBuilder;
        myAlertBuilder.setTitle("Alert");
// Set the dialog message.
        myAlertBuilder.setMessage("Click OK to continue, or Cancel to stop:");
    }

    // Set the dialog title.
myAlertBuilder.setTitle(R.string.alert_title);
// Set the dialog message.
myAlertBuilder.setMessage(R.string.alert_message);

myAlertBuilder.setPositiveButton("OK",new DialogInterface.OnClickListener()

    {
        public void onClick (DialogInterface dialog,int which){
// User clicked OK button.
        Toast.makeText(getApplicationContext(), "Pressed OK",
                Toast.LENGTH_SHORT).show();
    }
    }

    public Object getApplicationContext() {
        Object applicationContext;
        return applicationContext;
    });

// Add the buttons.
myAlertBuilder.setPositiveButton(R.string.ok,new
            DialogInterface.OnClickListener()

    {
        public void onClick (DialogInterface dialog,int which){
// User clicked OK button.
        Toast.makeText(getApplicationContext(), R.string.pressed_ok,
                Toast.LENGTH_SHORT).show();
    }
    });

myAlertBuilder.setNegativeButton(R.string.cancel,new
            DialogInterface.OnClickListener()

    {
        public void onClick (DialogInterface dialog,int which){
// User cancelled the dialog.
        Toast.makeText(getApplicationContext(), R.string.pressed_cancel,
                Toast.LENGTH_SHORT).show();
    }
    });
// Create and show the AlertDialog.
myAlertBuilder.show()
}

}




