/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.drawable.image5),
            Affirmation(R.string.affirmation6, R.drawable.image6),
            Affirmation(R.string.affirmation7, R.drawable.image7),
            Affirmation(R.string.affirmation8, R.drawable.image8),
            Affirmation(R.string.affirmation9, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.drawable.image10),
        )
    }

    fun loadAuf(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.volk_1, R.drawable.volk_1),
            Affirmation(R.string.volk_2, R.drawable.volk_2),
            Affirmation(R.string.volk_3, R.drawable.volk_3),
            Affirmation(R.string.volk_4, R.drawable.volk_4),
            Affirmation(R.string.volk_5, R.drawable.volk_5),
            Affirmation(R.string.volk_6, R.drawable.volk_6),
            Affirmation(R.string.volk_7, R.drawable.volk_7),
            Affirmation(R.string.volk_8, R.drawable.volk_8),
        )
    }
}
