package com.example.android.uitest.India;

import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android.uitest.R;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.PointsGraphSeries;
import com.jjoe64.graphview.series.Series;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class India22 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String TAG = India22.class.getSimpleName();
    private GraphView mGraph;
    private TextView fileContent;
    Spinner ageSpinner, choiceSpinner;
    List<String> age, choice;
    Button mSelect;
    TextView mItemSelected;
    String[] listItems;
    boolean[] checkedItems;
    ArrayList<Integer> mUserItems = new ArrayList<>();
    ArrayList<String []> mapData = new ArrayList<>();
    String[] content;
    String StringAge=" ", StringDistrict;
    private String result = " ";
    ArrayList<Integer> SeriesToAdd = new ArrayList<>();
    int rowNo, col=0, bar=0, line=0, point=0;
    String list;
    AlertDialog mDialog;
    ArrayList<String> colors = new ArrayList<>();
    private Button graphConfirm, removeGraph;
    private CheckBox barGraph, lineGraph, pointGraph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india22);

        mGraph = (GraphView) findViewById(R.id.graph);
        ageSpinner = (Spinner)findViewById(R.id.ageSpinner);
        choiceSpinner=(Spinner)findViewById(R.id.choiceSpinner);
        mSelect = (Button) findViewById(R.id.multiSelect);
        mItemSelected = (TextView) findViewById(R.id.textViewMultiple);
        listItems = getResources().getStringArray(R.array.indiaStates);
        checkedItems = new boolean[listItems.length];
        removeGraph = (Button)findViewById(R.id.removeSeries);
        barGraph = findViewById(R.id.barGraph);
        lineGraph = findViewById(R.id.lineGraph);
        pointGraph = findViewById(R.id.pointGraph);
        graphConfirm=findViewById(R.id.graphButton);

        mSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(India22.this);
                mBuilder.setTitle("Choose options from the following for plotting graph");
                mBuilder.setMultiChoiceItems(listItems, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {
                        if(isChecked){
                            if(! mUserItems.contains(position)){
                                mUserItems.add(position);
                            }
                        }
                        if(!isChecked){
                            if(mUserItems.contains(position)){
                                mUserItems.remove((Integer)position);
                            }

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

                mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        //choose from types of graphs
        graphConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(barGraph.isChecked()){
                    bar=1;
                }
                if(lineGraph.isChecked()){
                    line=1;
                }
                if(pointGraph.isChecked()){
                    point=1;
                }
            }
        });

        //colors for point graph
        colors.add("#123456");
        colors.add("#890678");
        colors.add("#345123");
        colors.add("#456123");
        colors.add("#098567");
        colors.add("#567123");
        colors.add("#456712");
        colors.add("#126534");
        colors.add("#984589");
        colors.add("#195713");
        colors.add("#108356");
        colors.add("#196734");
        colors.add("#124556");
        colors.add("#896378");
        colors.add("#341223");
        colors.add("#456723");
        colors.add("#098127");
        colors.add("#534123");
        colors.add("#456232");
        colors.add("#122344");
        colors.add("#984239");
        colors.add("#191233");
        colors.add("#108876");
        colors.add("#196124");


        choiceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                rowNo = parent.getSelectedItemPosition();
                String name = parent.getSelectedItem().toString();
                //list.add(name);
                Log.d(TAG, "rowNo" + rowNo);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        choice = new ArrayList<String>();
        choice.add("Select from the following characteristics");
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
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, choice);
        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(R.layout.spinner_item);
        // attaching data adapter to spinner
        choiceSpinner.setAdapter(dataAdapter);



        ageSpinner.setOnItemSelectedListener(this);
        age = new ArrayList<String>();
        age.add("Select age");
        age.add("5"); age.add("6");
        age.add("7"); age.add("8");
        age.add("9"); age.add("10");
        age.add("11"); age.add("12");
        age.add("13"); age.add("14");
        age.add("16"); age.add("17");
        age.add("18"); age.add("19");
        age.add("5-19");
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter_1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, age);
        // Drop down layout style - list view with radio button
        dataAdapter_1.setDropDownViewResource(R.layout.spinner_item);
        // attaching data adapter to spinner
        ageSpinner.setAdapter(dataAdapter_1);


        //Graph code
        mGraph.getViewport().setScalable(true);  // activate horizontal zooming and scrolling
        mGraph.getViewport().setScrollable(true);  // activate horizontal scrolling
        mGraph.getViewport().setScalableY(true);  // activate horizontal and vertical zooming and scrolling
        mGraph.getViewport().setScrollableY(true);  // activate vertical scrolling
        mGraph.getViewport().setMinX(-1);
        mGraph.getViewport().setMaxX(3);
        fileContent = (TextView)findViewById(R.id.content_from_server);
        Button loadTextButton = (Button)findViewById(R.id.load_file_from_server);

        loadTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String[]> csvContent = readCVSFromAssetFolder();
                List<String[]> another = new ArrayList<String[]>(csvContent);
                for(int i=0;i<SeriesToAdd.size();i++) {
                    another = makeAnother(csvContent, listItems[SeriesToAdd.get(i)], StringAge);
                    Log.d(TAG, listItems[SeriesToAdd.get(i)]);
                   // printCVSContent(another);
                    if(bar==1)createBarGraphSeries(another,rowNo,listItems[SeriesToAdd.get(i)]);
                    if(line==1)createLineGraphSeries(another,rowNo,listItems[SeriesToAdd.get(i)]);
                    if(point==1)createPointGraphSeries(another,rowNo,listItems[SeriesToAdd.get(i)]);

                    another.clear();
                }
           }
        });

        removeGraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mGraph.removeAllSeries();
                mUserItems.clear();
                mItemSelected.setText("");
                SeriesToAdd.clear();
                for(int i=0;i<checkedItems.length;i++){
                    checkedItems[i]=false;
                    ((mDialog)).getListView().setItemChecked(i, false);

                }
                bar=0;
                line=0;
                point=0;
            }
        });

        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(mGraph);
        staticLabelsFormatter.setHorizontalLabels(new String[] {"--","Total", "Urban", "Rural", "--"});
        mGraph.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);

    }

    private List<String[]> makeAnother(List<String[] > result, String stringDistrict, String age){
        List<String[]> another = new ArrayList<>();
        for(int i=0;i<result.size();i++){
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

            if(rows[3].matches(age)){
                if(rows[1].toUpperCase().contains(stringDistrict.toUpperCase())) {
                    another.add(rows);
                }
            }
        }
        return another;
    }

    private List<String[]> readCVSFromAssetFolder(){
        List<String[]> csvLine = new ArrayList<>();
        try {
            InputStream inputStream = getAssets().open("India.csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while((line = br.readLine()) != null){
                content = line.split(",");
                csvLine.add(content);
                mapData.add(content);
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

    private void createLineGraphSeries(List<String[]> result, int rowNo, String title){
        DataPoint[] dataPoints = new DataPoint[result.size()];
        for(int i=0;i<result.size();i++){
            String [] rows = result.get(i);
            dataPoints[i] = new DataPoint(Integer.parseInt(rows[2]),Integer.parseInt(rows[rowNo+4]));
        }
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(dataPoints);
        mGraph.addSeries(series);
        // series.setDrawValuesOnTop(true);
        //series.setValuesOnTopColor(Color.RED);
        series.setTitle(title);
        series.setDrawDataPoints(true);
        series.setDataPointsRadius(10);
        series.setThickness(8);
        series.setDrawBackground(true);
        series.setAnimated(true);
        //series.setColor(Color.GREEN);
      /* series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
           @Override
           public int get(DataPoint data) {
               return Color.rgb((int) data.getX()*255/4, (int) Math.abs(data.getY()*255/6), 100);
           }
       });*/
        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(India22.this, "On Data Point clicked: "+ dataPoint, Toast.LENGTH_SHORT).show();
            }
        });

        // custom paint to make a dotted line
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        paint.setPathEffect(new DashPathEffect(new float[]{8, 5}, 0));
        // paint.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
        series.setCustomPaint(paint);

        mGraph.getLegendRenderer().setVisible(true);
        mGraph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);
        //series.setSpacing(50);
    }

    private void createPointGraphSeries(List<String[]> result, int rowNo, String title){
        DataPoint[] dataPoints = new DataPoint[result.size()];
        for(int i=0;i<result.size();i++){
            String [] rows = result.get(i);
            dataPoints[i] = new DataPoint(Integer.parseInt(rows[2]),Integer.parseInt(rows[rowNo+4]));
        }
        PointsGraphSeries<DataPoint> series = new PointsGraphSeries<DataPoint>(dataPoints);
        mGraph.addSeries(series);
        // series.setDrawValuesOnTop(true);
        //series.setValuesOnTopColor(Color.RED);
        series.setTitle(title);

        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(India22.this, "On Data Point clicked: "+ dataPoint, Toast.LENGTH_SHORT).show();
            }
        });

        series.setCustomShape(new PointsGraphSeries.CustomShape() {
            @Override
            public void draw(Canvas canvas, Paint paint, float x, float y, DataPointInterface dataPoint) {
                paint.setStrokeWidth(10);
                canvas.drawLine(x-20, y-20, x+20, y+20, paint);
                canvas.drawLine(x+20, y-20, x-20, y+20, paint);
            }
        });

        String setCol = colors.get(col);
        series.setColor(Color.parseColor(setCol));
        mGraph.getLegendRenderer().setVisible(true);
        mGraph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);
        col++;
        //series.setSpacing(50);
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
        //series.setValuesOnTopColor(Color.RED);
        series.setTitle(title);
        //series.setColor(Color.GREEN);

        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(India22.this, "On Data Point clicked: "+ dataPoint, Toast.LENGTH_SHORT).show();
            }
        });

        mGraph.getLegendRenderer().setVisible(true);
        mGraph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);
        series.setSpacing(50);
        String setCol = colors.get(col);
        series.setColor(Color.parseColor(setCol));
        col++;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        StringAge = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        //  Toast.makeText(parent.getContext(), "Selected: " + StringAge, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        ageSpinner.setPrompt("Select an age");

    }

}
