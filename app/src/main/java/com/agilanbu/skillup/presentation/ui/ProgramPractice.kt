package com.agilanbu.skillup.presentation.ui

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun ListOfButton(){
val buttonLabels = listOf("StringSort","IntSort","Replace String & Char")

    Column() {
        buttonLabels.forEach { label->
            Button(onClick = {
                Log.e("ButtonClick:" ,"Label- $label")
            }) { Text(text = label) }
        }

    }


}


@Preview(showBackground = true)
@Composable
fun PreviewButtonList(){
    ListOfButton()
}