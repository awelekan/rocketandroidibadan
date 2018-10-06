package com.exmaple.com.recyclerview;

import android.view.LayoutInflater;
import android.view.View;

public class WordListAdapter {
    public class WordListAdapter extends
            RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = (TextView) itemView.findViewById(R.id.word);
            this.mAdapter = adapter;
            private final LinkedList<String> mWordList;
        }
        @Override
        public int getItemCount() {
            return mWordList.size();
        }

        private LayoutInflater mInflater;

    }
    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent);
    }
    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    // Get the position of the item that was clicked.
    int mPosition = getLayoutPosition();
    // Use that to access the affected item in mWordList.
    String element = mWordList.get(mPosition);
// Change the word in the mWordList.
mWordList.set(mPosition, "Clicked! " + element);
// Notify the adapter, that the data has changed so it can
// update the RecyclerView to display the data.
mAdapter.notifyDataSetChanged();
itemView.setOnClickListener(this);
}
