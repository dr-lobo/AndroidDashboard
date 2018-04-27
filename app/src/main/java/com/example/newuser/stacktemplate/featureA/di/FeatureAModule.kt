package com.example.newuser.stacktemplate.featureA.di

import com.example.newuser.stacktemplate.featureA.presenter.FeatureAPresenter
import com.example.newuser.stacktemplate.featureA.view.FeatureAActivity
import com.example.newuser.stacktemplate.featureA.view.FeatureAViewModel
import dagger.Module
import dagger.Provides

@Module
class FeatureAModule(val featureAActivity: FeatureAActivity) {

    @Provides
    fun providesFeatureAViewModel(): FeatureAViewModel {
        return featureAActivity
    }

    @Provides
    fun providesFeatureAPresenter(featureAViewModel: FeatureAViewModel): FeatureAPresenter {
        return FeatureAPresenter(featureAViewModel)
    }
}