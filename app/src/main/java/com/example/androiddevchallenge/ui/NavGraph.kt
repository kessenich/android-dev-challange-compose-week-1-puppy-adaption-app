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
package com.example.androiddevchallenge.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.PuppyListViewModel
import com.example.androiddevchallenge.ui.MainDestinations.PUPPY_DETAIL_ID_KEY
import com.example.androiddevchallenge.ui.puppy.PuppyDetails
import com.example.androiddevchallenge.ui.puppy.PuppyList

object MainDestinations {
    const val PUPPY_LIST_ROUTE = "puppies"
    const val PUPPY_DETAIL_ROUTE = "puppyDetail"
    const val PUPPY_DETAIL_ID_KEY = "puppyId"
}

@Composable
fun NavGraph(startDestination: String = MainDestinations.PUPPY_LIST_ROUTE) {
    val navController = rememberNavController()

    val actions = remember(navController) { MainActions(navController) }
    NavHost(
        navController,
        startDestination = startDestination
    ) {
        composable(MainDestinations.PUPPY_LIST_ROUTE) {
            PuppyList(puppies = PuppyListViewModel().puppies, puppySelected = actions.puppyDetails)
        }
        composable(
            "${MainDestinations.PUPPY_DETAIL_ROUTE}/{$PUPPY_DETAIL_ID_KEY}",
            arguments = listOf(navArgument(PUPPY_DETAIL_ID_KEY) { type = NavType.LongType })
        ) { backStackEntry ->
            val arguments = requireNotNull(backStackEntry.arguments)
            PuppyDetails(puppyId = arguments.getLong(PUPPY_DETAIL_ID_KEY))
        }
    }
}

class MainActions(navController: NavHostController) {
    val puppyList: () -> Unit = {
        navController.navigate(MainDestinations.PUPPY_LIST_ROUTE)
    }
    val puppyDetails: (Long) -> Unit = { puppyId: Long ->
        navController.navigate("${MainDestinations.PUPPY_DETAIL_ROUTE}/$puppyId")
    }
    val upPress: () -> Unit = {
        navController.navigateUp()
    }
}
