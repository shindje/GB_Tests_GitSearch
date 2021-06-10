package com.geekbrains.tests.presenter

import com.geekbrains.tests.view.ViewContract

internal interface PresenterContract {
    fun onAttach(p_viewContract: ViewContract)
    fun onDetach()
}
