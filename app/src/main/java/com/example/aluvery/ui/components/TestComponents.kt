package com.example.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.ui.theme.AluveryTheme


@Preview(showBackground =  true)
@Composable
fun ColumnPreview() {
    Column {
        Text(text = "Text 1")
        Text(text = "Text 2")
    }
}

@Preview(showBackground =  true)
@Composable
fun RowPreview() {
    Row {
        Text(text = "Text 1")
        Text(text = "Text 2")
    }
}


@Preview(showBackground =  true)
@Composable
fun BoxPreview() {
    Box {
        Text(text = "Text 1")
        Text(text = "Text 2")
    }
}

@Preview(showBackground =  true)
@Composable
fun CustomLayoutPreview() {
    Column(
        Modifier
        .padding(8.dp)
        .background(color = Color.Blue)
        .padding(all = 8.dp)
        .fillMaxHeight()
        .fillMaxWidth()) {
        Text(text = "Text 1")
        Text(text = "Text 2")
        Row(modifier = Modifier
            .padding(
                horizontal = 8.dp,
                vertical = 16.dp
            ). background(Color.Green)
            .fillMaxWidth()) {
            Text(text = "Text 3")
            Text(text = "Text 4")
        }
        Box(
            Modifier
            .padding(8.dp)
            .background(color = Color.Red)
            .padding(all = 8.dp)){
            Row (
                Modifier
                .padding(8.dp)
                .background(color = Color.Cyan)
                .padding(all = 8.dp)
                .fillMaxWidth()){
                Text(text = "Text 5")
                Text(text = "Text 6")
            }
            Column(
                Modifier.padding(8.dp)
                .background(color = Color.Yellow)
                .padding(all = 8.dp))   {
                Text(text = "Texto 7")
                Text(text = "Texto 8")
            }
        }
    }
}

@Composable
fun MyFirstComposavle() {
    Text(text = "Meu primeiro texto")
    Text(text = "Meu segundo texto maior")
}

@Preview
@Composable
fun MyFirstComposablePreview() {
    AluveryTheme {
        Surface {
            MyFirstComposavle()
        }
    }
}