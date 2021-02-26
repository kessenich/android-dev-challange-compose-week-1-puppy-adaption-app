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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun PuppyCard(
    modifier: Modifier = Modifier,
    puppy: Puppy
) {
    Surface(color = MaterialTheme.colors.background) {
        Row(
            modifier
                .padding(8.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(MaterialTheme.colors.surface)
                .clickable(onClick = { /*TODO*/ })
                .padding(16.dp),
        ) {
            Image(
                painter = painterResource(puppy.image),
                contentDescription = null,
                alignment = Alignment.Center,
                modifier = Modifier
                    .padding(8.dp)
                    .clipToBounds()
                    .clip(CircleShape)
                    .size(50.dp)
                    .background(color = Color.White),
            )

            Column(
                Modifier
                    .padding(start = 16.dp)
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            ) {
                Text(
                    puppy.name,
                    style = MaterialTheme.typography.h5,
                    color = MaterialTheme.colors.secondary
                )
                Text(
                    puppy.breed,
                    style = MaterialTheme.typography.body2,
                    color = MaterialTheme.colors.primaryVariant
                )
            }
        }
    }
}

@Preview("Light Theme")
@Composable
fun PuppyCardPreviewLight() {
    val puppy = Puppy(name = "Akita Inu", breed = "Akita Inu", image = R.drawable.akita_inu)

    MyTheme {
        PuppyCard(puppy = puppy)
    }
}

@Preview("Dark Theme")
@Composable
fun PuppyCardPreviewDark() {
    val puppy = Puppy(name = "Akita Inu", breed = "Akita Inu", image = R.drawable.akita_inu)

    MyTheme(darkTheme = true) {
        PuppyCard(puppy = puppy)
    }
}
