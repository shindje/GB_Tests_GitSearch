package com.geekbrains.tests.presenter.details

import com.geekbrains.tests.presenter.PresenterContract
import com.geekbrains.tests.view.details.ViewDetailsContract

internal interface PresenterDetailsContract : PresenterContract {
    fun onAttach(pViewContract: ViewDetailsContract)

    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}
