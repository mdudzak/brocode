package com.dudzak.brocode.ui.main

import androidx.lifecycle.ViewModel
import com.dudzak.brocode.data.ExampleRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(private val exampleRepository: ExampleRepository): ViewModel()