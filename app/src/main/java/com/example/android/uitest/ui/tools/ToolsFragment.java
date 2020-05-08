package com.example.android.uitest.ui.tools;

import android.net.wifi.aware.Characteristics;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import com.example.android.uitest.R;
import com.example.android.uitest.ViewPager.two;

import static android.graphics.Canvas.EdgeType.AA;
import static java.lang.System.in;

public class ToolsFragment extends AppCompatActivity {

    private TextView hi;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
        hi = findViewById(R.id.text_tools);
        hi.setText("Welcome to AA Data! \n\n" +
                        "The prime purpose of this app is to create graphs based on certain data by applying filters selected by the user. The data for the graph used in this app is taken from the official census website.\n\n" +
                        "The features included in this app are as follows:\n\n" +
                        "Navigation Bar: \n\n" +
                        "Home button - It takes you to the Home Page which has access to all the states/country tabs \n\n"+
                "Make a Note - By clicking on the ‘+’ sign at the bottom right corner, a new page will open. Add Title and notes that you might want to make while observing the graphs. Click on the Save button next to the title. The note will be saved. It can also be deleted by clicking on the button next to the saved note. \n\n"+
                "Display my Profile - Name, email Id and phone number of the logged-in account will be displayed here.  \n\n"+
                "Contact - By clicking on the mail or phone number, you can contact the owner of the app for any query\n\n"+

                "Logout - It lets you log in/register from another account. \n\n"+
        "Login/Register - Create an account in AA Data. Changing of password, logged-in information can also be performed.\n\n"+

        "Home Page: \n\n" +
        "It contains two tabs: States/UTs and India \n" +
        "As the name suggests, these are used for creating graphs every state-wise as well as for the entire country. \n" +
                "The filters which are available for the user are as follows: \n"+
        "Select from: \n\n"+
        "\t\t-Rural/Urban/Total  \n" +
        "\t\t-Ages: 5 to 19/Total  \n"+
        "\t\t-Districts/States  \n"+
        "\t\t-Characteristics such as educated main workers/non-workers etc  \n"+
        "\t\t-Bar/Line/Point  \n\n"+

        "Graphs for all types of combinations of filters can be created, the selection of which is self-explanatory from the layout of the page."
);


    }
}