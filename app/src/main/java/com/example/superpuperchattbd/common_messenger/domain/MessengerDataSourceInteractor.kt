package com.example.superpuperchattbd.common_messenger.domain

import androidx.paging.DataSource
import com.example.superpuperchattbd.common_messenger.Dialog

interface MessengerDataSourceInteractor {

    fun getData(): DataSource.Factory<Int, Dialog>
}