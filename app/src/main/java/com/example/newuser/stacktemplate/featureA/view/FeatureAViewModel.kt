package com.example.newuser.stacktemplate.featureA.view


import io.reactivex.Observable

interface FeatureAViewModel {

    fun subscribeToFabClickEvent(): Observable<Unit>
}