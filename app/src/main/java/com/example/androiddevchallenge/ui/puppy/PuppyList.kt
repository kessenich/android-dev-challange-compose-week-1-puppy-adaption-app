package com.example.androiddevchallenge.ui.puppy

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.PuppyListViewModel
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun PuppyList(
    modifier: Modifier = Modifier,
    puppies: List<Puppy>
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(top = 8.dp)
    ) {
        items(items = puppies) { puppy ->
            PuppyCard(puppy = puppy)
        }
    }
}

@Preview("Light Theme")
@Composable
fun PuppyListPreviewLight() {
    val puppyList = PuppyListViewModel().puppies

    MyTheme {
        PuppyList(puppies = puppyList)
    }
}

@Preview("Dark Theme")
@Composable
fun PuppyListPreviewDark() {
    val puppyList = PuppyListViewModel().puppies


    MyTheme(darkTheme = true) {
        PuppyList(puppies = puppyList)
    }
}