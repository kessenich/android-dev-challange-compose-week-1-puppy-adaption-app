package com.example.androiddevchallenge.data

import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.R

class PuppyListViewModel : ViewModel() {

    var puppies = listOf<Puppy>(
        Puppy(name = "Annabelle", breed = "Akita Inu", image = R.drawable.akita_inu),
        Puppy(name = "Britta", breed = "Beagle", image = R.drawable.beagle),
        Puppy(name = "Charles", breed = "Chihuahua", image = R.drawable.chihuahua),
        Puppy(name = "Davis", breed = "Dachshund", image = R.drawable.dachshund),
        Puppy(name = "Dex", breed = "Dalmatian", image = R.drawable.dalmatian),
        Puppy(name = "Dalton", breed = "Doberman Pinscher", image = R.drawable.doberman_pinscher),
        Puppy(name = "Gaddy", breed = "Golden Retriever", image = R.drawable.golden_retriever),
        Puppy(name = "Jack", breed = "Jack Russel Terrier", image = R.drawable.jack_russel_terrier),
        Puppy(name = "Patty", breed = "Pomeranian", image = R.drawable.pomeranian),
        Puppy(name = "Pea", breed = "Pug", image = R.drawable.pug),
        Puppy(name = "Racer", breed = "Riesenschnautzer", image = R.drawable.riesenschnautzer),
        Puppy(name = "Raffi", breed = "Rottweiler", image = R.drawable.rottweiler),
        Puppy(name = "Sammy", breed = "Saint Bernand", image = R.drawable.saint_bernand),
        Puppy(name = "Sandy", breed = "Shih Tzu", image = R.drawable.shih_tzu),
        Puppy(name = "Sari", breed = "Siberian Husky", image = R.drawable.siberian_husky),
        Puppy(name = "Washi", breed = "Welsh Corgi", image = R.drawable.welsh_corgi),
    )
}