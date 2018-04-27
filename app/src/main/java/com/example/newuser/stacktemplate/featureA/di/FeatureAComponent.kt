package com.example.newuser.stacktemplate.featureA.di

import com.example.newuser.stacktemplate.featureA.view.FeatureAActivity
import dagger.Component

@Component(modules = [(FeatureAModule::class)])
interface FeatureAComponent {
    fun inject(activityA: FeatureAActivity)

}