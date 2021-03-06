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
package com.example.androiddevchallenge.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.androiddevchallenge.R

private val appFontFamily = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.quicksand,
            weight = FontWeight.Normal
        ),
        Font(
            resId = R.font.quicksand_bold,
            weight = FontWeight.Bold
        ),
        Font(
            resId = R.font.quicksand_light,
            weight = FontWeight.Light
        ),
        Font(
            resId = R.font.quicksand_medium,
            weight = FontWeight.Medium
        ),
    )
)

// Set of Material typography styles to start with
private val defaultTypography = Typography()
val typography = Typography(
    defaultFontFamily = appFontFamily,

    h5 = defaultTypography.h5.copy(
        fontWeight = FontWeight.Bold,
    ),

)
