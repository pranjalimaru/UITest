package com.example.android.uitest;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.example.android.uitest.R;
import com.jjoe64.graphview.DefaultLabelFormatter;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.Series;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import java.io.InputStream;


public class Graph23 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String TAG = Graph23.class.getSimpleName();
    private GraphView mGraph;
    private TextView fileContent;
    private RadioButton Total, Rural, Urban;
    //private Button btnDisplay;
    Spinner districtSpinner, choiceSpinner;
    List<String> district, choice;
    Button mSelect;
    TextView mItemSelected;
    String[] listItems;
    boolean[] checkedItems;
    ArrayList<Integer> mUserItems = new ArrayList<>();
    ArrayList<String []> TotalData = new ArrayList<>();
    String[] content;
    String TotRuUrb, DistrictString=" ";
    ArrayList<Integer> SeriesToAdd = new ArrayList<>();
    int rowNo;
    String list;
    List<String[]> x_axis = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph23);

        mGraph = (GraphView) findViewById(R.id.graph);
        districtSpinner = (Spinner)findViewById(R.id.districtSpinner);
        choiceSpinner=(Spinner)findViewById(R.id.choiceSpinner);
        mSelect = (Button) findViewById(R.id.multiSelect);
        mItemSelected = (TextView) findViewById(R.id.textViewMultiple);
        listItems = getResources().getStringArray(R.array.multiple_select_age);
        checkedItems = new boolean[listItems.length];
        //Total = (RadioButton)findViewById(R.id.total);
        //Rural = (RadioButton)findViewById(R.id.rural);
        //Urban = (RadioButton)findViewById(R.id.urban);
        //btnDisplay = (Button) findViewById(R.id.btnDisplay);

        districtSpinner.setOnItemSelectedListener(this);
        district = new ArrayList<String>();
        district.add("Kachchh");
        district.add("Banas Kantha");
        district.add("Patan");
        district.add("Mahesana");
        district.add("Sabar Kantha");
        district.add("Gandhinagar");
        district.add("Ahmadabad");
        district.add("Surendranagar");
        district.add("Rajkot");
        district.add("Jamnagar");
        district.add("Porbandar");
        district.add("Junagadh");
        district.add("Amreli");
        district.add("Bhavnagar");
        district.add("Anand");
        district.add("Kheda");
        district.add("Panch Mahals");
        district.add("Dohad");
        district.add("Vadodara");
        district.add("Narmada");
        district.add("Bharuch");
        district.add("The Dangs");
        district.add("Navsari");
        district.add("Surat");
        district.add("Tapi");
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, district);
        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        districtSpinner.setAdapter(dataAdapter);


        choiceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                rowNo = parent.getSelectedItemPosition();
                list = parent.getSelectedItem().toString();
                Log.d(TAG, "rowNo" + rowNo);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        choice = new ArrayList<String>();
        choice.add("Total Persons");
        choice.add("Total Males");
        choice.add("Total Females");
        choice.add("Educated People who are Main Workers");
        choice.add("Educated Men who are Main Workers");
        choice.add("Educated Women who are Main Workers");
        choice.add("Educated People who are Marginal Workers and worked for 3 to 6 months");
        choice.add("Educated Men who are Marginal Workers and worked for 3 to 6 months");
        choice.add("Educated Women who are Marginal Workers and worked for 3 to 6 months");
        choice.add("Educated People who are Marginal Workers and worked for less than 3 months");
        choice.add("Educated Men who are Marginal Workers and worked for less than 3 months");
        choice.add("Educated Women who are Marginal Workers and worked for less than 3 months");
        choice.add("Educated People who are Non-Workers");
        choice.add("Educated Men who are Non-Workers");
        choice.add("Educated Women who are Non-Workers");
        choice.add("Un-Educated People who are Main Workers");
        choice.add("Un-Educated Men who are Main Workers");
        choice.add("Un-Educated Women who are Main Workers");
        choice.add("Un-Educated People who are Marginal Workers and worked for 3 to 6 months");
        choice.add("Un-Educated Men who are Marginal Workers and worked for 3 to 6 months");
        choice.add("Un-Educated Women who are Marginal Workers and worked for 3 to 6 months");
        choice.add("Un-Educated People who are Marginal Workers and worked for less than 3 months");
        choice.add("Un-Educated Men who are Marginal Workers and worked for less than 3 months");
        choice.add("Un-Educated Women who are Marginal Workers and worked for less than 3 months");
        choice.add("Un-Educated People who are Non-Workers");
        choice.add("Un-Educated Men who are Non-Workers");
        choice.add("Un-Educated Women who are Non-Workers");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter_1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, choice);
        // Drop down layout style - list view with radio button
        dataAdapter_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        choiceSpinner.setAdapter(dataAdapter_1);


        mSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Graph23.this);
                mBuilder.setTitle("Choose options from the following for plotting graph");
                mBuilder.setMultiChoiceItems(listItems, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {
                        if(isChecked){
                            if(! mUserItems.contains(position)){
                                mUserItems.add(position);
                            }
                        }
                        else if(mUserItems.contains(position)){
                            mUserItems.remove((Integer)position);
                        }
                    }
                });

                mBuilder.setCancelable(false);
                mBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String item = "";
                        for(int i=0; i < mUserItems.size(); i++){
                            item = item + listItems[mUserItems.get(i)];
                            SeriesToAdd.add(mUserItems.get(i));
                            if(i != mUserItems.size()-1){
                                item = item + ", ";
                            }
                        }
                        mItemSelected.setText(item);
                    }
                });

                mBuilder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();
                    }
                });

                mBuilder.setNeutralButton("Clear All", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        for(int i=0; i < checkedItems.length; i++){
                            checkedItems[i] = false;
                            mUserItems.clear();
                            mItemSelected.setText("");
                            SeriesToAdd.clear();
                        }
                    }
                });

                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


        //Graph code
        mGraph.getViewport().setScalable(true);  // activate horizontal zooming and scrolling
        mGraph.getViewport().setScrollable(true);  // activate horizontal scrolling
        mGraph.getViewport().setScalableY(true);  // activate horizontal and vertical zooming and scrolling
        mGraph.getViewport().setScrollableY(true);  // activate vertical scrolling
        mGraph.getViewport().setMaxX(3);
        mGraph.getViewport().setMinX(-1);
        fileContent = (TextView)findViewById(R.id.content_from_server);
        Button loadTextButton = (Button)findViewById(R.id.load_file_from_server);

     /*  //RadioButton code
       // TotRuUrb = addListeneronButton();
       btnDisplay.setOnClickListener(new View.OnClickListener() {
           //Run when button is clicked
           int selectedValueId;
           RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup);
           @Override
           public void onClick(View v) {
               selectedValueId = rg.getCheckedRadioButtonId();
               if(selectedValueId == Total.getId()){
                   TotRuUrb = "Total";
               }
               else if(selectedValueId == Rural.getId()){
                   TotRuUrb = "Rural";
               }
               else if(selectedValueId == Urban.getId()){
                   TotRuUrb = "Urban";
               }
           }
       });

      */


        loadTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String[]> csvContent = readCVSFromAssetFolder();
                List<String[]> another = new ArrayList<String[]>(csvContent);
                //another.addAll(csvContent);
                for(int i=0;i<SeriesToAdd.size();i++) {
                    another = makeAnother(csvContent, listItems[SeriesToAdd.get(i)], DistrictString);
                    //printCVSContent(another);
                    createBarGraphSeries(another,rowNo,listItems[SeriesToAdd.get(i)]);
                    another.clear();
                    //another.addAll(csvContent);
                }

                //createLineGraph(trial);

                //  createBarGraphSeries(trial,rowNo,listItems);
                //createBarChartGraph(trial);
                //printCVSContent(another);

            }
        });

        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(mGraph);
        staticLabelsFormatter.setHorizontalLabels(new String[] {"--","Total", "Urban", "Rural", "--"});

        mGraph.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);

    }

    private ArrayList<String[]> makeAnother(List<String[] > result, String age, String district){
        for(int i=0;i<result.size();i++) {
            String rows[] = result.get(i);
            if(rows[2].contains("Total")){
                rows[2]="0";
            }
            if(rows[2].contains("Urban")){
                rows[2]="1";
            }
            if(rows[2].contains("Rural")){
                rows[2]="2";
            }


            if (rows[3].matches(age)) {
                if(rows[1].contains(district))
                    TotalData.add(rows);

            }
        }
        return TotalData;
    }

    private List<String[]> readCVSFromAssetFolder(){
        List<String[]> csvLine = new ArrayList<>();
        //String[] content = null;
        try {
            InputStream inputStream = getAssets().open("data_2.csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while((line = br.readLine()) != null){
                content = line.split(",");
                csvLine.add(content);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return csvLine;
    }

    private void printCVSContent(List<String[]> result){
        String cvsColumn = "";
        for (int i = 0; i < result.size(); i++){
            String rows []  = result.get(i);
            cvsColumn += rows[0] + " " + rows[1] + " " + rows[2] + " " + rows[3] + "\n";
        }

        fileContent.setText(cvsColumn);
    }

    private void createLineGraph(List<String[]> result){
        DataPoint[] dataPoints = new DataPoint[result.size()];
        // DataPoint[] dataPoints_1 = new DataPoint[result.size()];

        for (int i = 0; i < result.size(); i++){
            String [] rows = result.get(i);
            Log.d(TAG, "Output " + Integer.parseInt(rows[0]) + " " + Integer.parseInt(rows[2]));
            dataPoints[i] = new DataPoint(Integer.parseInt(rows[0]), Integer.parseInt(rows[2]));
            // dataPoints_1[i] = new DataPoint(Integer.parseInt(rows[0]), Integer.parseInt(rows[2]));

        }
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(dataPoints);
        // LineGraphSeries<DataPoint> series_1 = new LineGraphSeries<>(dataPoints_1);
        mGraph.addSeries(series);
        //mGraph.addSeries(series_1);
    }

    private void createBarGraphSeries(List<String[]> result, int rowNo, String title){
        DataPoint[] dataPoints = new DataPoint[result.size()];
        for(int i=0;i<result.size();i++){
            String [] rows = result.get(i);
            dataPoints[i] = new DataPoint(Integer.parseInt(rows[2]),Integer.parseInt(rows[rowNo+4]));
        }
        BarGraphSeries<DataPoint> series = new BarGraphSeries<DataPoint>(dataPoints);
        mGraph.addSeries(series);
        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Color.RED);
        series.setTitle(title);
        //series.setColor(Color.GREEN);
        series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
            @Override
            public int get(DataPoint data) {
                return Color.rgb((int) data.getX()*255/4, (int) Math.abs(data.getY()*255/6), 100);
            }
        });
        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(Graph23.this, "Series1: On Data Point clicked: "+ dataPoint, Toast.LENGTH_SHORT).show();
            }
        });

        mGraph.getLegendRenderer().setVisible(true);
        mGraph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);
        series.setSpacing(30);
    }

    private void createBarChartGraph(List<String[]> result){
        DataPoint[] dataPoints = new DataPoint[result.size()];
        DataPoint[] dataPoints_1 = new DataPoint[result.size()];


        for (int i = 0; i < result.size(); i++){
            String [] rows = result.get(i);
            //Log.d(TAG, "Output " + Integer.parseInt(rows[0]) + " " + Integer.parseInt(rows[1]));
            dataPoints[i] = new DataPoint(Integer.parseInt(rows[0]), Integer.parseInt(rows[4]));
            dataPoints_1[i] = new DataPoint(Integer.parseInt(rows[0]), Integer.parseInt(rows[5]));
        }
        BarGraphSeries<DataPoint> series = new BarGraphSeries<DataPoint>(dataPoints);
        BarGraphSeries<DataPoint> series_1 = new BarGraphSeries<DataPoint>(dataPoints_1);

        mGraph.addSeries(series);
        series.setTitle("Education Graph");
        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Color.RED);
        series.setColor(Color.GREEN);
        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(Graph23.this, "Series1: On Data Point clicked: "+ dataPoint, Toast.LENGTH_SHORT).show();
            }
        });

        mGraph.addSeries(series_1);
        series_1.setDrawValuesOnTop(true);
        series_1.setValuesOnTopColor(Color.RED);
        series_1.setColor(Color.BLUE);

        mGraph.getLegendRenderer().setVisible(true);
        mGraph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);

       /*series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
           @Override
           public int get(DataPoint data) {
               return Color.rgb((int) data.getX()*255/4, (int) Math.abs(data.getY()*255/6), 100);
           }
       }); */
        series.setSpacing(50);

      /* series_1.setValueDependentColor(new ValueDependentColor<DataPoint>() {
          @Override
           public int get(DataPoint data) {
               return Color.rgb((int) data.getX()*255/4, (int) Math.abs(data.getY()*255/6), 100);
           }
       }); */
        series_1.setSpacing(50);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        DistrictString = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        //  Toast.makeText(parent.getContext(), "Selected: " + StringAge, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        districtSpinner.setPrompt("Select an age");

    }

}


