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
package com.example.androiddevchallenge.data

import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.R

class PuppyListViewModel : ViewModel() {

    var puppies = listOf(
        Puppy(id = 1L, name = "Annabelle", breed = "Akita Inu", image = R.drawable.akita_inu),
        Puppy(id = 2L, name = "Britta", breed = "Beagle", image = R.drawable.beagle),
        Puppy(id = 3L, name = "Charles", breed = "Chihuahua", image = R.drawable.chihuahua),
        Puppy(id = 4L, name = "Davis", breed = "Dachshund", image = R.drawable.dachshund),
        Puppy(id = 5L, name = "Dex", breed = "Dalmatian", image = R.drawable.dalmatian),
        Puppy(id = 6L, name = "Dalton", breed = "Doberman Pinscher", image = R.drawable.doberman_pinscher),
        Puppy(id = 7L, name = "Gaddy", breed = "Golden Retriever", image = R.drawable.golden_retriever),
        Puppy(id = 8L, name = "Jack", breed = "Jack Russel Terrier", image = R.drawable.jack_russel_terrier),
        Puppy(id = 9L, name = "Patty", breed = "Pomeranian", image = R.drawable.pomeranian),
        Puppy(id = 10L, name = "Pea", breed = "Pug", image = R.drawable.pug),
        Puppy(id = 11L, name = "Racer", breed = "Riesenschnautzer", image = R.drawable.riesenschnautzer),
        Puppy(id = 12L, name = "Raffi", breed = "Rottweiler", image = R.drawable.rottweiler),
        Puppy(id = 13L, name = "Sammy", breed = "Saint Bernand", image = R.drawable.saint_bernand),
        Puppy(id = 14L, name = "Sandy", breed = "Shih Tzu", image = R.drawable.shih_tzu),
        Puppy(id = 15L, name = "Sari", breed = "Siberian Husky", image = R.drawable.siberian_husky),
        Puppy(id = 16L, name = "Washi", breed = "Welsh Corgi", image = R.drawable.welsh_corgi),
    )

    fun getPuppy(id: Long): Puppy {
        return puppies.first { x -> x.id.equals(id) }
    }
}
