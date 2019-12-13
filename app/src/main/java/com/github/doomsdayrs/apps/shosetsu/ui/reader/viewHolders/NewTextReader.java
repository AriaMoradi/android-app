package com.github.doomsdayrs.apps.shosetsu.ui.reader.viewHolders;
/*
 * This file is part of shosetsu.
 *
 * shosetsu is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * shosetsu is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with shosetsu.  If not, see <https://www.gnu.org/licenses/>.
 * ====================================================================
 */

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.github.doomsdayrs.apps.shosetsu.R;
import com.github.doomsdayrs.apps.shosetsu.ui.reader.NewChapterReader;
import com.github.doomsdayrs.apps.shosetsu.ui.reader.listeners.NovelFragmentChapterViewHideBar;

/**
 * shosetsu
 * 13 / 12 / 2019
 *
 * @author github.com/doomsdayrs
 */
public class NewTextReader extends NewReader {
    public final TextView textView;

    public NewTextReader(@NonNull View itemView, NewChapterReader newChapterReader) {
        super(itemView, newChapterReader);
        textView = itemView.findViewById(R.id.textview);
    }

    @Override
    public void setText(String text) {
        textView.setText(text);
    }

    @Override
    public void bind() {
        textView.setOnClickListener(new NovelFragmentChapterViewHideBar(newChapterReader.toolbar));
    }
}
