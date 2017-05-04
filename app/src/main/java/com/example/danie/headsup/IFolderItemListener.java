package com.example.danie.headsup;

import java.io.File;

/**
 * Created by Danny on 4/22/2017.
 */

public interface IFolderItemListener {

    void OnCannotFileRead(File file);//implement what to do folder is Unreadable
    void OnFileClicked(File file);//What to do When a file is clicked
}

