/*
 * Copyright (C) 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.materialme;

import android.app.Fragment;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.ImageView;
import android.support.test.rule.ActivityTestRule;
import java.util.ArrayList;

/***
 * Main Activity for the Material Me app, a mock sports news application with poor design choices
 */
public class MainActivity extends AppCompatActivity {

    //Member variables
    private RecyclerView mRecyclerView;
    private ArrayList<Sport> mSportsData;
    private SportsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the RecyclerView
        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        //Set the Layout Manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Initialize the ArrayLIst that will contain the data
        mSportsData = new ArrayList<>();

        //Initialize the adapter and set it ot the RecyclerView
        mAdapter = new SportsAdapter(this, mSportsData);
        mRecyclerView.setAdapter(mAdapter);
        View itemView;
        ImageView mSportsImage = (ImageView) itemView.findViewById(R.id.sportsImage);
        Sport currentSport;
        Glide.with(mContext).load(currentSport.getImageResource()).into(holder.mSportsImage);
        //Get the data
        initializeData();
    }

    /**
     * Method for initializing the sports data from resources.
     */
    private void initializeData() {
        //Get the resources from the XML file
        String[] sportsList = getResources().getStringArray(R.array.sports_titles);
        String[] sportsInfo = getResources().getStringArray(R.array.sports_info);

        //Clear the existing data (to avoid duplication)
        mSportsData.clear();

        //Create the ArrayList of Sports objects with the titles and information about each sport
        for(int i=0;i<sportsList.length;i++){
            int imageResource;
            mSportsData.add(new Sport(sportsList[i],sportsInfo[i], imageResource));
        }

        //Notify the adapter of the change
        mAdapter.notifyDataSetChanged();
    }
    TypedArray sportsImageResources =
            getResources().obtainTypedArray(R.array.sports_images);
    for(int i=0;i<sportsList.length;i++){
        mSportsData.add(new Sport(sportsList[i],sportsInfo[i],
                sportsImageResources.getResourceId(i,0)));
    }
sportsImageResources.recycle();
    ItemTouchHelper helper = new ItemTouchHelper(new ItemTouchHelper
            .SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {}
            mSportsData.remove(viewHolder.getAdapterPosition());
mAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
helper.attachToRecyclerView(mRecyclerView);

    ItemTouchHelper helper = new ItemTouchHelper(new ItemTouchHelper
            .SimpleCallback(ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT |
            ItemTouchHelper.DOWN | ItemTouchHelper.UP, ItemTouchHelper.LEFT |
            ItemTouchHelper.RIGHT) {}

    private RecyclerView.ViewHolder viewHolder;
    int from = viewHolder.getAdapterPosition();
    int to = target.getAdapterPosition();
    itemView.setOnClickListener(this);

    int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
    mRecyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    int swipeDirs;
if(gridColumnCount > 1){
        swipeDirs = 0;
    } else {
        swipeDirs = ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
    }
    ItemTouchHelper helper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback
            (ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT | ItemTouchHelper.DOWN
                    | ItemTouchHelper.UP, swipeDirs)

            onView(withId(R.id.my_view))
                    .perform(click())
                    .check(matches(isDisplayed()));
    .check(matches(isDisplayed()));
    onView(withId(R.id.my_view))
            .perform(click())
            .check(matches(isDisplayed()));@RunWith(AndroidJUnit4.class)
    public class ActivityInputOutputTest {
        @Rule
        public ActivityTestRule mActivityRule = new ActivityTestRule<>(
                MainActivity.class);
    }
    @Test
    public void activityLaunch() {
                onView(withId(R.id.button_main)).perform(click());
        onView(withId(R.id.text_header)).check(matches(isDisplayed()));
        onView(withId(R.id.button_second)).perform(click());
        onView(withId(R.id.text_header_reply)).check(matches(isDisplayed()));
            }
    @Test
    public void textInputOutput() {
        onView(withId(R.id.editText_main)).perform(typeText("This is a test."));
        onView(withId(R.id.button_main)).perform(click());
    }

    @Test
    public void textInputOutput() {
        onView(withId(R.id.editText_main)).perform(typeText("This is a test."));
        onView(withId(R.id.button_main)).perform(click());
        onView(withId(R.id.text_message)).check(matches(withText("This is a test.")));

    }

    @RunWith(AndroidJUnit4.class)
    public class SpinnerSelectionTest {
        @Rule
        public ActivityTestRule mActivityRule = new ActivityTestRule<>(
                MainActivity.class);
    }
    public void iterateSpinnerItems() {
        Fragment mActivityRule;
        String[] myArray =
                mActivityRule.getActivity().getResources()
                        .getStringArray(R.array.labels_array);
        int size = myArray.length;
        for (int i=0; i<size; i++) {
        }
        // Find the spinner and click on it.
        onView(withId(R.id.label_spinner)).perform(click());
        // Find the spinner item and click on it.
        onData(is(myArray[i])).perform(click());
        // Find the Submit button and click on it.
        onView(withId(R.id.button_main)).perform(click());
// Find the text view and check that the spinner item
// is part of the string.
        onView(withId(R.id.text_phonelabel))
                .check(ACCESSIBILITY_SERVICE.matches());
    }
}

