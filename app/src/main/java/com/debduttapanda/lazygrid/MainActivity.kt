package com.debduttapanda.lazygrid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.debduttapanda.lazygrid.ui.theme.LazyGridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyGridTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xff1a1a1a)
                ) {
                    Box(){
                        Column(){
                            LazyHorizontalGrid()
                            LazyVerticalGrid()
                        }
                    }

                }
            }
        }
    }

    @Composable
    private fun ColumnScope.LazyVerticalGrid() {
        val data = MutableList<String>(20){
            it.toString()
        }.toList()

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            contentPadding = PaddingValues(8.dp),
            modifier = Modifier.fillMaxSize().weight(1f)
        ) {

            items(data) { item ->
                Card(
                    modifier = Modifier.padding(4.dp),
                    backgroundColor = Color(0xff7400e8)
                ) {
                    Box(
                        modifier = Modifier.wrapContentSize(),
                        contentAlignment = Alignment.Center
                    ){
                        Text(
                            text = item,
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(24.dp),
                            color = Color.White
                        )
                    }
                }
            }
        }
    }

    @Composable
    private fun ColumnScope.LazyHorizontalGrid() {
        val data = MutableList<String>(20){
            it.toString()
        }.toList()

        LazyHorizontalGrid(
            rows = GridCells.Fixed(3),
            contentPadding = PaddingValues(8.dp),
            modifier = Modifier.fillMaxSize().weight(1f)
        ) {
            items(data) { item ->
                Card(
                    modifier = Modifier.padding(4.dp),
                    backgroundColor = Color(0xff7400e8)
                ) {
                    Box(
                        modifier = Modifier.wrapContentSize(),
                        contentAlignment = Alignment.Center
                    ){
                        Text(
                            text = item,
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(24.dp),
                            color = Color.White
                        )
                    }

                }
            }
        }
    }
}