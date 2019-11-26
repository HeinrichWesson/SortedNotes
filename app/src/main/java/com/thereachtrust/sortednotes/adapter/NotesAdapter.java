package com.thereachtrust.sortednotes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thereachtrust.sortednotes.R;
import com.thereachtrust.sortednotes.data.TextNote;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NoteViewHolder> {

    private List<TextNote> textNotes;
    private ButtonClickedCallback callback;

    public NotesAdapter(ButtonClickedCallback callback) {
        this.callback = callback;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new NoteViewHolder(inflater.inflate(R.layout.note, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        // TODO Your code here.
    }

    @Override
    public int getItemCount() {
        return textNotes.size();
    }

    /**
     * Sets the initial "default" list of notes.
     * @param notes
     */
    public void setInitialNoteItems(List<TextNote> notes) {
        sortNotes(notes);
        textNotes = notes;
    }

    /**
     * Sorts the given list of notes via the length of text in each note in ascending order.
     *
     * @param notes The notes to be sorted.
     */
    private void sortNotes(List<TextNote> notes) {
        // TODO Your code here. Hint: Use the Java Collections API here. Do not write the sorting algorithm from scratch!
    }

    /**
     * TODO complete this class.
     */
    public static class NoteViewHolder extends RecyclerView.ViewHolder {

        public NoteViewHolder(View noteItemView) {
            super(noteItemView.getRootView());
        }
    }

    /**
     * Callback used to forward click events to the {@link com.thereachtrust.sortednotes.MainActivity}.
     */
    public interface ButtonClickedCallback {

        /**
         * Called when the edit button on a note was clicked.
         *
         * @param note     The TextNote that was clicked.
         * @param position The position of the clicked note in the adapter.
         */
        void onEditClicked(TextNote note, int position);
    }
}
