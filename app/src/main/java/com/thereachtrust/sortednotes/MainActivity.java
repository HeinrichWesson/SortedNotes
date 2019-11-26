package com.thereachtrust.sortednotes;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.thereachtrust.sortednotes.adapter.NotesAdapter;
import com.thereachtrust.sortednotes.data.TextNote;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private NotesAdapter notesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAddNewNoteButton();
        initRecyclerViewWithAdapter();
    }

    private void initAddNewNoteButton() {

        FloatingActionButton buttonAdd = findViewById(R.id.button_add_note);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO show an AlertDialog where the user can write their note. The dialog should have a "cancel" and "save" button. Use R.layout.dialog_add_note.xml as the layout.
            }
        });
    }

    /**
     * Initialises the Adapter and RecyclerView used to display the list of notes.
     * TODO Initialise RecyclerView as well in this method.
     */
    private void initRecyclerViewWithAdapter() {

        notesAdapter = new NotesAdapter(new NotesAdapter.ButtonClickedCallback() {
            @Override
            public void onEditClicked(TextNote note, int position) {
                // TODO Your code here. THIS IS A BONUS QUESTION.
            }
        });
        notesAdapter.setInitialNoteItems(generateDefaultNotes());
        notesAdapter.notifyDataSetChanged();
    }

    /**
     * Creates 3 "default" notes. DO NOT CHANGE THIS METHOD!
     */
    private List<TextNote> generateDefaultNotes() {

        List<TextNote> defaultNotes = new ArrayList<>();
        defaultNotes.add(new TextNote("For small creatures such as we the vastness is bearable only " +
                "through love."));
        defaultNotes.add(new TextNote("In our obscurity - in all this vastness - there is no " +
                "hint that help will come from elsewhere to save us from ourselves. It is up to us."));
        defaultNotes.add(new TextNote("If you want to make an apple pie from scratch, you must first " +
                "create the universe."));

        return defaultNotes;
    }
}
