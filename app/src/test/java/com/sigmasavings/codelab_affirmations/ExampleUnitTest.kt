package com.sigmasavings.codelab_affirmations

import android.content.Context
import com.sigmasavings.codelab_affirmations.adapter.ItemAdapter
import com.sigmasavings.codelab_affirmations.model.Affirmation
import org.junit.Test
import org.junit.Assert.assertEquals
import org.mockito.Mockito.mock

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AffirmationsAdapterTests {

    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}