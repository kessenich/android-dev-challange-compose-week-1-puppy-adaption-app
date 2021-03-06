/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
    puppies: List<Puppy>,
    puppySelected: (Long) -> Unit,
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(top = 8.dp)
    ) {
        items(items = puppies) { puppy ->
            PuppyCard(puppy = puppy, onClick = puppySelected)
        }
    }
}

@Preview("Light Theme")
@Composable
fun PuppyListPreviewLight() {
    val puppyList = PuppyListViewModel().puppies

    MyTheme {
        PuppyList(puppies = puppyList, puppySelected = {})
    }
}

@Preview("Dark Theme")
@Composable
fun PuppyListPreviewDark() {
    val puppyList = PuppyListViewModel().puppies

    MyTheme(darkTheme = true) {
        PuppyList(puppies = puppyList, puppySelected = {})
    }
}
