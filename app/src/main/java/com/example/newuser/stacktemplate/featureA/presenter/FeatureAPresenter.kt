package com.example.newuser.stacktemplate.featureA.presenter

import com.example.newuser.stacktemplate.featureA.view.FeatureAViewModel
import io.reactivex.disposables.CompositeDisposable

class FeatureAPresenter(val view: FeatureAViewModel) {

    val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun onStart() {
        compositeDisposable.addAll(
                view.subscribeToFabClickEvent().subscribe({ println("I am subscribed") })
        )
    }

    fun onStop() {
        compositeDisposable.dispose()
    }

}