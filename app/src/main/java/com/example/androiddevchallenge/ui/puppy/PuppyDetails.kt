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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.PuppyListViewModel
import com.example.androiddevchallenge.ui.theme.MyTheme

const val lorem_ipsum_text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet."

@Composable
fun PuppyDetails(
    modifier: Modifier = Modifier,
    puppyId: Long
) {
    val puppy = PuppyListViewModel().getPuppy(puppyId)

    Column(
        modifier.fillMaxHeight()
    ) {
        Header(puppy = puppy)

        val isLightTheme = MaterialTheme.colors.isLight
        var textColor = MaterialTheme.colors.primaryVariant

        if (!isLightTheme) {
            textColor = Color.White
        }

        Text(
            lorem_ipsum_text + lorem_ipsum_text,
            style = MaterialTheme.typography.body1,
            color = textColor,
            modifier = Modifier
                .padding(40.dp)
                .verticalScroll(rememberScrollState())
        )
    }
}

@Composable
fun Header(puppy: Puppy) {
    Surface(color = MaterialTheme.colors.background) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(MaterialTheme.colors.surface)
                .padding(24.dp)
        ) {
            Image(
                painter = painterResource(puppy.image),
                contentDescription = null,
                alignment = Alignment.Center,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(8.dp)
                    .clipToBounds()
                    .clip(CircleShape)
                    .size(150.dp)
                    .background(color = Color.White),
            )

            Text(
                puppy.name,
                style = MaterialTheme.typography.h4,
                color = MaterialTheme.colors.secondary
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    puppy.breed,
                    style = MaterialTheme.typography.body2,
                    color = MaterialTheme.colors.primaryVariant
                )

                Button(onClick = { /*TODO*/ }) {
                    Text("Adopt")
                }
            }
        }
    }
}

@Preview("Light Theme")
@Composable
fun PuppyDetailsPreviewLight() {
    MyTheme {
        PuppyDetails(puppyId = 1L)
    }
}

@Preview("Dark Theme")
@Composable
fun PuppyDetailsPreviewDark() {
    MyTheme(darkTheme = true) {
        PuppyDetails(puppyId = 1L)
    }
}
