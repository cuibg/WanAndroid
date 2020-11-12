package com.sbingo.wanandroid_mvvm.base

import android.os.Bundle
import androidx.viewbinding.ViewBinding


abstract class BaseBindingActivity<V : ViewBinding> : BaseActivity() {

    override var layoutId = 0

    protected abstract val binding: V

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}